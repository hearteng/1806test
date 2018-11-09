package cn.sky.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sky.entity.Book;
import cn.sky.entity.BookCase;
import cn.sky.entity.BookInfo;
import cn.sky.entity.BookType;
import cn.sky.entity.Publishing;
import cn.sky.service.BookFindService;
import cn.sky.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource
	private BookService bookService;
	
	@Resource
	private BookFindService bookFindService;

	@RequestMapping("/findAll.do")
	public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = bookService.findAllBook();
		List<BookType> bookTypes = bookService.findAllBookType();
		List<Publishing> publishes = bookService.findAllPublishing();
		List<BookCase> bookCases = bookService.findAllBookCase();
		request.getSession(true).setAttribute("books", books);
		request.getSession(true).setAttribute("bookTypes", bookTypes);
		request.getSession(true).setAttribute("publishes", publishes);
		request.getSession(true).setAttribute("bookCases", bookCases);
		request.getRequestDispatcher("/book.jsp").forward(request, response);
	}

	@RequestMapping("/add.do")
	public void addReader(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String barcode = request.getParameter("barcode");
		String bookName = request.getParameter("bookName");
		int typeId = Integer.parseInt(request.getParameter("typeId"));
		String author = request.getParameter("author");
		String translator = request.getParameter("translator");
		String isbn = request.getParameter("isbn");
		float price = Float.parseFloat(request.getParameter("price"));
		int page = Integer.parseInt(request.getParameter("page"));
		String operator = request.getParameter("operator");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String inTime = sdf.format(new Date());
		int bookcase = Integer.parseInt(request.getParameter("bookcaseid"));
		BookInfo bookInfo = new BookInfo(barcode, bookName, typeId, author, translator, isbn, price, page, bookcase,
				inTime, operator);
		bookService.addBookInfo(bookInfo);
		response.sendRedirect("findAll.do");
	}

	@RequestMapping("/del.do")
	public void delById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		bookService.delBookInfoById(id);
		response.sendRedirect("findAll.do");
	}

	@RequestMapping("/modify.do")
	public void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookInfo bookInfo = bookService.findBookInfoById(id);
		List<BookCase> bookcases = bookService.findAllBookCase();
		List<BookType> bookTypes = bookService.findAllBookType();
		List<Publishing> pubes = bookService.findAllPublishing();
		request.setAttribute("bookInfo", bookInfo);
		request.setAttribute("bookcase", bookcases);
		request.setAttribute("booktype", bookTypes);
		request.setAttribute("publish", pubes);
		request.getRequestDispatcher("/book_Modify.jsp").forward(request, response);
	}

	@RequestMapping("/update.do")
	public void Update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String barcode = request.getParameter("barcode");
		String bookName = request.getParameter("bookName");
		int typeId = Integer.parseInt(request.getParameter("typeId"));
		String author = request.getParameter("author");
		String translator = request.getParameter("translator");
		String isbn = request.getParameter("isbn");
		float price = Float.parseFloat(request.getParameter("price"));
		int page = Integer.parseInt(request.getParameter("page"));
		String operator = request.getParameter("operator");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String inTime = sdf.format(new Date());
		int bookcase = Integer.parseInt(request.getParameter("bookcaseid"));
		int id = Integer.parseInt(request.getParameter("id"));
		BookInfo bookInfo = new BookInfo(barcode, bookName, typeId, author, translator, isbn, price, page, bookcase,
				inTime, operator, id);
		System.out.println(bookInfo);
		bookService.updateBookInfo(bookInfo);
		response.sendRedirect("findAll.do");
	}

	@RequestMapping("/query.do")
	public void Query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = bookService.findAllBook();
		request.getSession(true).setAttribute("books", books);
		request.getRequestDispatcher("/bookQuery.jsp").forward(request, response);
	}

	@RequestMapping("/detail.do")
	public void Detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookInfo bookInfo = bookService.findBookInfoById(id);
		Book book = bookService.finBookById(id);
		request.setAttribute("bookInfo", bookInfo);
		request.setAttribute("book", book);
		request.getRequestDispatcher("/book_detail.jsp").forward(request, response);
	}

	@RequestMapping("/findKey.do")
	public void FindKey(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		String key = request.getParameter("key");
		List<Book> books = null;
		if ("barcode".equals(type)) {
			books = bookFindService.findByBarcode(key.trim());
		}
		if ("typename".equals(type)) {
			books = bookFindService.findByType(key.trim());
		}
		if ("bookname".equals(type)) {
			books = bookFindService.findByBookname(key.trim());
		}
		if ("publishing".equals(type)) {
			books = bookFindService.findByPubname(key.trim());
		}
		if ("bookcasename".equals(type)) {
			books = bookFindService.findByCasename(key.trim());
		}
		request.getSession(true).setAttribute("books", books);
		request.getRequestDispatcher("/bookQuery.jsp").forward(request, response);
	}
}
