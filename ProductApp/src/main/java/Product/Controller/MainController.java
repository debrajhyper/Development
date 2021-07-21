package Product.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import Product.Model.Product;
import Product.Service.ProductService;

@Controller
public class MainController {
	
	@Autowired
	private ProductService productService;

	// Home -> Show all Products
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> allProducts = productService.getAllProduct();
		
		m.addAttribute("products", allProducts);
		
		return "index";
	}

	// Show Add Product Form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		
		m.addAttribute("title", "Add Product");
		
		return "add_product_form";
	}

	// handle Add Product Form
	@RequestMapping(value = "/handleProduct", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productService.saveProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");

		return redirectView;
	}
	
	// handle Delete Product
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productService.deleteOneProduct(productId);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		
		return redirectView;
	}
	
	// handle Update Product
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int productId, Model m) {
		Product updateProduct = this.productService.updateProduct(productId);
		
		m.addAttribute("updateProductInfo", updateProduct);
		m.addAttribute("title", "update Product");
		
		return "update_form";
	}

}
