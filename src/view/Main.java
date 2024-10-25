package view;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.Sale;
import model.SaleNote;

public class Main {

	public static void main(String[] args) {
		List<Product> prods = new ArrayList<>();
		prods.add(new Product("Pão", 1.0, 20));
		prods.add(new Product("Leite", 5.0, 5));
		prods.add(new Product("Manteiga", 20.0, 2));
		
		Sale sale = new Sale(prods);
		
		SaleNote note = new SaleNote();
		
		System.out.print(note.printNote(sale));
		
	}

}
