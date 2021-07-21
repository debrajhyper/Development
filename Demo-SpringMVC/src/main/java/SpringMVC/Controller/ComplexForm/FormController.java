package SpringMVC.Controller.ComplexForm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import SpringMVC.Model.ComplexForm.Student;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student, @RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model, BindingResult result) throws IOException {

		if (result.hasErrors()) {
			return "complex_form";
		}

		System.out.println(student);

		

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		
		byte[] data = file.getBytes();
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "fileUpload" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded...");
			
			model.addAttribute("msg", "File Uploaded Successfully");
			model.addAttribute("filename", file.getOriginalFilename());
			
		} catch (Exception e) {
			System.out.println("File Uploading error");
			model.addAttribute("msg", "File Uploading Error !!");
		}
		

		return "complex_success";
	}
}
