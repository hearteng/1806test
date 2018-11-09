package cn.sky.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sky.entity.BorrowForm;
import cn.sky.entity.Reader;
import cn.sky.entity.ReaderType;
import cn.sky.service.BookFindService;
import cn.sky.service.BookService;
import cn.sky.service.BorrowService;
import cn.sky.service.ReaderService;
import cn.sky.util.JsonResult;

@Controller
@RequestMapping("/back")
public class BookBackController extends BaseController {
	@Resource
	private ReaderService readerService;

	@Resource
	private BookService bookService;
	
	@Resource
	private BookFindService bookFindService;
	
	@Resource
	private BorrowService borrowService;
	
	@RequestMapping("/backBook")
	public void Index(HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("../bookBack.jsp");
	}
	
	@RequestMapping("/checkCode")
	@ResponseBody
	public JsonResult<Reader> CheckCode(String barcode){
		Reader reader = readerService.findByBarcode(barcode);
		ReaderType readerType = readerService.findReaderTypeById(reader.getTypeid());
		reader.setNumber(readerType.getNumber());
		return new JsonResult<Reader>(reader);
	}
	
	@RequestMapping("/checkBook")
	@ResponseBody
	public JsonResult<List<BorrowForm>> CheckBook(String barcode){
		Reader reader = readerService.findByBarcode(barcode);
		Integer readerid = reader.getId();
		List<BorrowForm> borrowForms = borrowService.findBorrowForm(readerid);
		return new JsonResult<List<BorrowForm>>(borrowForms);
		
	}

	
	@RequestMapping("/BackBookById")
	public void BackBookById(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String bookid = request.getParameter("bookid");
        String barcode = request.getParameter("barcode");
        String operator = request.getParameter("operator");
        
		Reader reader = readerService.findByBarcode(barcode);
		int readerId = reader.getId();
		int bookId = Integer.parseInt(bookid);
		borrowService.BackActivity(readerId, bookId, operator);
//		int n = borrowService.BackActivity(readerId, bookId, operator);
		
//		if(n!=3){
//			throw new RuntimeException("²Ù×÷Ê§°Ü");
//		}
		
//		List<BorrowForm> borrowForms = borrowService.findBorrowForm(readerId);
		request.getRequestDispatcher("backBook.do").forward(request, response);
	}
	
	
}
