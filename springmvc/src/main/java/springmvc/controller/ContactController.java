package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserDaoService;

@Controller
public class ContactController {
	
	@Autowired
	private UserDaoService service; 

	@ModelAttribute
	public void commonData(Model m) {
		
		System.out.println("common data is called ");
		m.addAttribute("headtitle", "Learn coding with passion");
		m.addAttribute("descone", "Knowledge is power.Programs must be written for people to read, and only incidentally for machines to execute.");
	}
	 
	@RequestMapping("/contact")
	public String contact() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model m) {

		System.out.println(user);
		
		if(user.getUserName().isEmpty()) {
			System.out.println("again on same page ");
			
			return "redirect:/contact";
		}
		this.service.createUser(user);

		//m.addAttribute("user", user);

		return "success";
	}

}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(@RequestParam("email") String
 * email, @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String password, Model m) {
 * 
 * User user=new User(); user.setEmail(email); user.setUserName(userName);
 * user.setPassword(password); System.out.println(user);
 * 
 * // m.addAttribute("email", email); // m.addAttribute("username", userName);
 * // m.addAttribute("password", password);
 * 
 * m.addAttribute("user", user);
 * 
 * return "success"; }
 */
