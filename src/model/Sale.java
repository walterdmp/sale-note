package model;

import java.util.List;

public class Sale {
	List<Product> prod;

	public List<Product> getProd() {
		return prod;
	}


	public Sale(List<Product> prod) {
		this.prod = prod;
	}
	
	public Double totalSale() {
		if(this.prod != null) {
			Double total = 0.0;
			
			for(Product pd : prod) {
				total += (pd.getPrice() * pd.getQuantity());
			}
			
			return total;
		} 
		
		return 0.0;
	}
}
