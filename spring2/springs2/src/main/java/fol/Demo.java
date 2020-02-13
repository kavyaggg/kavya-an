package main.java.fol;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class Demo {
	public Demo(){
	System.out.println("created");	
	}
	@RequestMapping("/first.do")
	public String click(HttpServletRequest req) {
		System.out.println("invoked click");
		
		String message =req.getParameter("message");
		System.out.println("message"+message);
		
		
		String email =req.getParameter("email");
		System.out.println("email"+email);
		
		String file =req.getParameter("file");
		System.out.println("file"+file);
		
		
		
		
	
	
	//public String onFirst() {
		//System.out.println("invoked onFirst");
		return "/index.jsp";
	}
}
