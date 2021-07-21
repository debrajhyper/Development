package SpringMVC.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NumberFormatException.class })
	public String exceptionHandlerNumberFormater(Model model) {
		model.addAttribute("msg", "Number Format Exception Occur");
		return "exception_null";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NullPointerException.class })
	public String exceptionHandlerNull(Model model) {
		model.addAttribute("msg", "Null Pointer Exception Occur");
		return "exception_null";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model model) {
		model.addAttribute("msg", "Exception Occur !!");
		return "exception_null";
	}

}
