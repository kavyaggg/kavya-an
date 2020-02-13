package main.java.fol;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class ProtestController {
	
	public ProtestController() {
		System.out.println("created");
	}
	@RequestMapping("/protest.do")
	public String onPress(HttpServletRequest req) {
		
		System.out.println("invoked on press");
		String organization= req.getParameter("organization");
		System.out.println("org"+organization);
		
		String reason= req.getParameter("reason");
		System.out.println("res"+reason);
		req.setAttribute("kavya",reason);
	
		String date= req.getParameter("date");
		System.out.println("date"+date);
	
		String locat= req.getParameter("locat");
		System.out.println("loc"+locat);
		
	
		return "/success.jsp";
		
		
	}

}
