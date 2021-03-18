package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author priyankaku
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model m) {
		System.out.println("home page ");
		m.addAttribute("name", "Omkar Kulkarni");
		m.addAttribute("id", 123);
		
		List<String> friendList=new ArrayList<String>();
		friendList.add("Shital");
		friendList.add("Prajakta");
		friendList.add("Rajita");
		friendList.add("Ajit");
		m.addAttribute("f",friendList);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about page ");
		return "myAbout";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("fName","Rushikesh");
		mv.addObject("lName", "Kulkarni");
		System.out.println("help page ");
		LocalDateTime dateTime=LocalDateTime.now();
		mv.addObject("date",dateTime.toString());
		List<Integer> markList=new ArrayList<Integer>();
		markList.add(78);
		markList.add(98);
		markList.add(40);
		markList.add(70);
		mv.addObject("f",markList);
		mv.setViewName("help");
		return mv;
	}
	

}
