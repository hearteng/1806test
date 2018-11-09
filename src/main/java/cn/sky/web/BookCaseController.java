package cn.sky.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sky.entity.BookCase;
import cn.sky.service.BookService;

@Controller
@RequestMapping("/bookCase")
public class BookCaseController {

	@Resource
	private BookService bookService;
	
	@RequestMapping("/findAll.do")
	public void FindAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<BookCase> bookCases = bookService.findAllBookCase();
		request.getSession(true).setAttribute("bookCases", bookCases);
		request.getRequestDispatcher("/bookcase.jsp").forward(request, response);
	}
	@RequestMapping("/del.do")
	public void delById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		bookService.delBookCaseById(id);
		response.sendRedirect("findAll.do");
	}
	@RequestMapping("/add.do")
	public void addBookCase(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		BookCase bookCase = new BookCase(name);
		bookService.addBookCase(bookCase);
		response.sendRedirect("../bookcase_ok.jsp");
	}
	
	@RequestMapping("/modify.do")
	public void ModifyBookCase(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookCase bookCase = bookService.findBookCaseById(id);
		request.getSession(true).setAttribute("bookCase", bookCase);
		response.sendRedirect("../bookCase_Modify.jsp");
	}
	
	@RequestMapping("/update.do")
	public void UpdateBookCase(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		BookCase bookCase = bookService.findBookCaseById(id);
		bookCase.setName(name);
		bookService.updateBookCase(bookCase);
		response.sendRedirect("../bookcase_ok.jsp");
	}
}
