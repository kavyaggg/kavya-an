package main.java.fol;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping
public class CountryController {
	public CountryController() {
		System.out.println("created");
	}
	@RequestMapping("/country.do")
	public String onPress(HttpServletRequest req) {
		
		System.out.println("invoked on press");
		String country= req.getParameter("country");
		System.out.println("con"+country);
		
		String capital= req.getParameter("capital");
		System.out.println("cap"+capital);
		req.setAttribute("delhi",capital);
	
		
		String file= req.getParameter("file");
		System.out.println("fi"+file);
		
	
		return "/success.jsp";
		
		
	}

}



