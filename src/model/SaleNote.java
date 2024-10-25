package model;

public class SaleNote {
	public String printNote(Sale sale) {
		String note = "";
		for(Product pd : sale.getProd()) {
			note += pd.getInfoProduct() + "\n";
		}
		
		note += "Valor Total: RS";
		note += sale.totalSale();
		
		return note;
	}
}
