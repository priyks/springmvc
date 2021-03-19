package springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectUsingSpringMvc {

	@RequestMapping("/one")
	public String redirectOne() {
		System.out.println("Redirect one method...");

		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String redirectTwo() {
		System.out.println("Redirect two method...");

		return "contact";
	}
	


}
/**
 * first way :
 * redirect prefix:
 * public String handler(){
 * 
 * return "redirect:/two"; }
 * 
 * second way :
 * RedirectView
 * public RedirectView handler(){
 * 
 * RedirectView rv=new RedirectView();
 * rv.setUrl("https://www.google.com/");
 * return rv;
 * 
 * }
 * 
 * third way 
 * public void follow(HttpServletResponse res) throws Exception{
 * 
 * res.sendRedirect("");
 * 
 * }
 * 
 * but this is not recommanded ..
 **/