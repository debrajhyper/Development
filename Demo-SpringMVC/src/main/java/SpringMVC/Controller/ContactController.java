package SpringMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import SpringMVC.Model.User;
import SpringMVC.Service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	private String str;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Glorious Purpose");
		m.addAttribute("Desc", "Kang The Conqueror");
		System.out.println("adding common data to model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {

		return "contact";
	}

//		OLD WAY
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST)
	 * public String handleForm(@RequestParam(name = "email", required = true) String userEmail, @RequestParam("userName") String userName, @RequestParam("password") String userPass, Model model) {
	 * 
	 * System.out.println("User Email -> " + userEmail);
	 * System.out.println("User Name -> " + userName);
	 * System.out.println("User Password -> " + userPass);
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPass);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * // model.addAttribute("name", userName); // model.addAttribute("Email",
	 * userEmail); // model.addAttribute("Password", userPass);
	 * 
	 * return "success"; }
	 */
	

//	SPRING MVC WAY
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);

		if (user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		int createdUser = this.userService.createUser(user);

		model.addAttribute("msg", "User created with id : " + createdUser);

		return "success";
	}

	
	@RequestMapping("/user/{id}")
	public String getUserId(@PathVariable("id") int userId) {

		System.out.println(userId);
		return "success";
	}
	
	@RequestMapping("/null")
	public String getUserName() {
		
		str = null;
		System.out.println(str);
		System.out.println(str.length());
		return "success";
	}
	

}
