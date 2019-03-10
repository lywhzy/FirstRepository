package lyw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseController {
	protected HttpServletRequest request;
	protected HttpSession session;
	
	@ModelAttribute
	public void getBaseAttr(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}
}
