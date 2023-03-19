package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
     public void add(Product product) {
    	 
    	 // sadece db erişim kodları buraya yazılır..SQL 
    	 System.out.println("Hibernate ile veritababına eklendi");
     }
}
