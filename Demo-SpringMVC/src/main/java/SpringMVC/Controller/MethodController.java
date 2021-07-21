package SpringMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MethodController {
	
	@RequestMapping("/home")
	public String home(Model model) {					//Send data from controller to jsp using Model
		System.out.println("RequestingMapping -> home url");
		
		model.addAttribute("name", "Debraj");
		model.addAttribute("id", 5421);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Debo");
		friends.add("Tamo");
		friends.add("lol");
		model.addAttribute("frnds", friends);
		
		return "index";
	}
	
	
	
	@RequestMapping("/about")
	public ModelAndView about() {						//Send data from controller to jsp  using ModelAndView
		System.out.println("RequestingMapping -> about url");
		
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("roll", 101);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(35);
		list.add(10);
		list.add(64);
		list.add(56);
		modelAndView.addObject("marks", list);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		modelAndView.setViewName("about");
		
		return modelAndView;
	}
}
