package com.BikkadIT.SpringMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMVCFirstApp.model.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		
		Book book=new Book();
		book.setBookID(1);
		book.setBookName("SQL");
		book.setBookPrice(1000.00);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOK", book);
		mav.setViewName("book");
		return mav;
	}
}
