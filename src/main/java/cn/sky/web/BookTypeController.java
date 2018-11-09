package cn.sky.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sky.entity.BookType;
import cn.sky.service.BookService;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {

	@Resource
	private BookService bookService;
	
	@RequestMapping("/findAll.do")
	public void FindAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<BookType> bookTypes = bookService.findAllBookType();
		request.getSession(true).setAttribute("bookTypes", bookTypes);
		request.getRequestDispatcher("/bookType.jsp").forward(request, response);
	}
	@RequestMapping("/del.do")
	public void delById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		bookService.delBookTypeById(id);
		response.sendRedirect("findAll.do");
	}
	@RequestMapping("/add.do")
	public void addBookType(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String typeName = request.getParameter("typeName");
		int days = Integer.parseInt(request.getParameter("days"));
		BookType bookType = new BookType(typeName,days);
		bookService.addBookType(bookType);
		response.sendRedirect("../bookType_ok.jsp");
	}
	
	@RequestMapping("/modify.do")
	public void ModifyBookType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookType bookType = bookService.findBookTypeById(id);
		request.getSession(true).setAttribute("bookType", bookType);
		response.sendRedirect("../bookType_Modify.jsp");
	}
	
	@RequestMapping("/update.do")
	public void UpdateBookType(String typeName,String days,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookType bookType = bookService.findBookTypeById(id);
		bookType.setTypeName(typeName);
		bookType.setId(Integer.parseInt(days));
		bookService.updateBookType(bookType);
		response.sendRedirect("../bookType_ok.jsp");
	}
}
