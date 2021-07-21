package SpringMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class ClassController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {					// Send data from controller to jsp using Model
		System.out.println("RequestingMapping -> first/home url");

		model.addAttribute("name", "Kang The Conqueror");
		model.addAttribute("id", 999);

		List<String> friends = new ArrayList<String>();
		friends.add("Loki");
		friends.add("Sylvie");
		model.addAttribute("frnds", friends);

		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about() {						// Send data from controller to jsp using ModelAndView
		System.out.println("RequestingMapping -> first/about url");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Iron Man");
		modelAndView.addObject("roll", 000);

		List<Integer> list = new ArrayList<Integer>();
		list.add(99);
		list.add(100);
		list.add(100);
		list.add(90);
		modelAndView.addObject("marks", list);

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		modelAndView.setViewName("about");

		return modelAndView;
	}
}
