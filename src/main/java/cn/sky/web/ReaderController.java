package cn.sky.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sky.entity.Reader;
import cn.sky.service.ReaderService;

@Controller
@RequestMapping("/reader")
public class ReaderController {

	@Resource
	private ReaderService readerService;

	@RequestMapping("/findAll.do")
	public void findAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<Reader> readers = readerService.findAllReader();
		request.getSession(true).setAttribute("readers", readers);
		request.getRequestDispatcher("/reader.jsp").forward(request, response);
	}
	@RequestMapping("/findAlldeil.do")
	public void findAllDeil(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<Reader> readers = readerService.findAllReader();
		System.out.println(readers);
		request.getSession(true).setAttribute("readers", readers);
		request.getRequestDispatcher("/reader_detail.jsp").forward(request, response);
	}
	
	
	@RequestMapping("/del.do")
	public void delById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		readerService.deleteReaderById(id);
		response.sendRedirect("findAll.do");
	}
	
	@RequestMapping("/modify.do")
	public void modify(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		Reader reader = readerService.findById(id);
		request.setAttribute("reader", reader);
		request.getRequestDispatcher("/readerModify.jsp").forward(request, response);
	}
	@RequestMapping("/add.do")
	public void addReader(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		Reader reader = initReader(request, response);
	    readerService.addReader(reader);
	    request.getRequestDispatcher("findAll.do").forward(request, response);
	}
	
	@RequestMapping("/update.do")
	public void updateReader(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		Reader reader = initReader(request, response);
		readerService.updateReader(reader);
		request.getRequestDispatcher("findAll.do").forward(request, response);
	}
	
	
	
	//增加,修改时 接收参数
	public Reader initReader(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String barcode = request.getParameter("barcode");
		String vocation=request.getParameter("vocation");
		String birthday = request.getParameter("birthday");
		String paperType=request.getParameter("paperType");
		String paperNo = request.getParameter("paperNo");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String createDate = sdf.format(new Date());
		String operator = request.getParameter("operator");
		String remark = request.getParameter("remark");
		int typeid = Integer.parseInt(request.getParameter("typeid"));
		Reader reader = new Reader(id,name,sex,barcode,vocation,birthday,paperType,paperNo,tel,email,createDate,operator,remark,typeid);
		System.out.println(reader);
		return reader;
	}
	
	
}
