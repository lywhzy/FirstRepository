package lyw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lyw.model.Page;
import lyw.pojo.Book;
import lyw.service.BookService;

@org.springframework.stereotype.Controller
public class Controller extends BaseController{
	@Autowired
	private BookService bookService;
	
	@RequestMapping("find")
	public ModelAndView getBookList() {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("list", bookService.FindBookList());
		return modelAndView;
	}
	
	@RequestMapping(value="/listPage",method=RequestMethod.GET)
	public ModelAndView getPageList(Page page) {
		ModelAndView modelAndView = new ModelAndView("success");
		List<Book> list = bookService.FindPageList(page);
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
	@RequestMapping("/edit/{id}")
	public String fowardEdit(@PathVariable String id, Map<String,Object> map) {
		Book book = bookService.FindBook(id);
		map.put("book", book);
		return "edit";
	}
	
	@RequestMapping(value="/listPage",method=RequestMethod.PUT)
	public String updateBook(Book book) {
		bookService.UpdateBook(book);
		return "redirect:/listPage";
	}
	
	@RequestMapping(value="/listPage",method=RequestMethod.POST)
	public String insertBook(Book book) {
		bookService.InsertBook(book);
		return "redirect:/listPage";
	}
	
	@RequestMapping(value="/listPage/{id}",method=RequestMethod.DELETE)
	public String deleteBook(@PathVariable String id) {
		bookService.DeleteBook(id);
		return "redirect:/listPage";
	}
	
}
