package main.java.fol;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class PoliticsController {
	
	public PoliticsController() {
		System.out.println("created");
	}
	@RequestMapping("/politics.do")
	public String onPress(HttpServletRequest req) {
		
		System.out.println("invoked on press");
		String party= req.getParameter("party");
		System.out.println("org"+party);
		
		String symbol= req.getParameter("symbol");
		System.out.println("sys"+symbol);
		req.setAttribute("flower",symbol);
	
		String president= req.getParameter("president");
		System.out.println("pres"+president);
	
		
	
		return "/success.jsp";
		
		
	}

}
