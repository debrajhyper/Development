package SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("RequestMapping -> one handler");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("RequestMapping -> two handler");
		return "contact";
	}
}
