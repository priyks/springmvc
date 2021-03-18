package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, @RequestParam("userName") String userName,
			@RequestParam("password") String password, Model m) {

		System.out.println("Email id : " + email);
		System.out.println("User Name : " + userName);
		System.out.println("User Password : " + password);
		m.addAttribute("email", email);
		m.addAttribute("username", userName);
		m.addAttribute("password", password);

		return "success";
	}

}
