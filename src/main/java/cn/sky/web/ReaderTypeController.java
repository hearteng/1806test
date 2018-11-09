package cn.sky.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sky.entity.ReaderType;
import cn.sky.service.ReaderService;

@Controller
@RequestMapping("/readerType")
public class ReaderTypeController {

	@Resource
	private ReaderService readerService;
	
	@RequestMapping("/findAll.do")
	public void findAllReaderType(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException{
		List<ReaderType> readerTypes = readerService.findAllReaderType();
		request.getSession().setAttribute("readerTypes", readerTypes);
		request.getRequestDispatcher("/readerType.jsp").forward(request, response);
	}
	
	@RequestMapping("/del.do")
	public void delById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		readerService.delReaderTypeById(id);
		response.sendRedirect("findAll.do");
	}
	
	@RequestMapping("/add.do")
	public void addBookType(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		int number = Integer.parseInt(request.getParameter("number"));
		ReaderType readerType = new ReaderType(name,number);
		readerService.addReaderType(readerType);
		response.sendRedirect("../readerType_ok.jsp");
	}
	@RequestMapping("/modify.do")
	public void ModifyBookType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ReaderType readerType = readerService.findReaderTypeById(id);
		request.getSession(true).setAttribute("readerType", readerType);
		response.sendRedirect("../readerType_Modify.jsp");
	}
	@RequestMapping("/update.do")
	public void UpdateBookType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int num = Integer.parseInt(request.getParameter("number"));
		ReaderType readerType = new ReaderType(id,name,num);
		readerService.updateReaderType(readerType);
		response.sendRedirect("../readerType_ok.jsp");
	}

}
