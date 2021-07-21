package Product.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import Product.Model.Product;


@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void createProduct(Product product) {
		System.out.println("____________________________________________________");
		System.out.println("PRODUCT SAVED -> " + product);
		System.out.println("____________________________________________________");
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// Get1
	public Product getProduct(int pId) {
		return this.hibernateTemplate.get(Product.class, pId);
	}

	// Get All
	public List<Product> getProducts() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	// Delete
	@Transactional
	public void deleteProduct(int pId) {
		Product product = this.hibernateTemplate.load(Product.class, pId);
		System.out.println("____________________________________________________");
		System.out.println("PRODUCT DELETED -> " + product);
		System.out.println("____________________________________________________");
		this.hibernateTemplate.delete(product);
	}

}
