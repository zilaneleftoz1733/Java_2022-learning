package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Product;

public abstract class JdbcProductDao implements ProductDao {

	public void ad(Product product) {
		
		System.out.println("JDBC ile veritabanına eklendi");
		
	}
	
	
}
