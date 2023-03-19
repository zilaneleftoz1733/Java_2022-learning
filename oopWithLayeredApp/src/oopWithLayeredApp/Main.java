package oopWithLayeredApp;

import oopWithLayeredApp.business.ProductManager;
import oopWithLayeredApp.core.logging.DatabaseLogger;
import oopWithLayeredApp.core.logging.FileLogger;
import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.core.logging.MailLogger;
import oopWithLayeredApp.dataAccess.HibernateProductDao;
import oopWithLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
	Product product1 =new  Product(1,"Iphone Xr",1000);
	
	Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
	
	
		ProductManager productManeger=
 new ProductManager(new HibernateProductDao(),loggers);
		productManeger.add(product1);
		
	
		
	}

}
