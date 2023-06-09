package oopWithLayeredApp.business;

import java.util.List;

import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.JdbcProductDao;
import oopWithLayeredApp.dataAccess.ProductDao;
import oopWithLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {

		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz ");

		}

		productDao.add(product);
		for(Logger logger : loggers ) {
			logger.log(product.getName());
		}
	}
}
