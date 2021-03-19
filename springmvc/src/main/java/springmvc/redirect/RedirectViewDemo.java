package springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectViewDemo {
	
	@RequestMapping("/google")
	public RedirectView goGoogle() {
		
		RedirectView rv=new RedirectView();
		System.out.println("Redirect to google ...");
		rv.setUrl("https://www.google.com/");
		return rv;
	}

}
