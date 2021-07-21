package Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Product.Dao.ProductDao;
import Product.Model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void saveProduct(Product product) {
		this.productDao.createProduct(product);
	}
	
	public List<Product> getAllProduct() {
		List<Product> Allproducts = productDao.getProducts();
		return Allproducts;
	}
	
	public void deleteOneProduct(int productId) {
		this.productDao.deleteProduct(productId);
	}
	
	public Product updateProduct(int productId) {
		return this.productDao.getProduct(productId);
	}

}
