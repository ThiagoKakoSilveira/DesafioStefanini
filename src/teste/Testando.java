package teste;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class Testando {
	
	public static List<Sale>sales = new ArrayList<Sale>(); 
	public static SaleMan saleman = new SaleMan("001", "00657510009", "Thiago", 2000);
	public static SaleMan saleman2 = new SaleMan("001", "10000657509", "Diego", 2500.50);
	public static Products product = new Products(2, 1, 3);
	public static Products produ = new Products(1, 2, 1);


	public static void main(String[] args) {
		List<Products> prods = new ArrayList<>();
		List<Products> pro = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			prods.add(product);						
		}		
		Sale sale1 = new Sale("003", "010", saleman, prods);
		System.out.println(sale1.getAmont());
		for (int i = 0; i < 2; i++) {
			pro.add(produ);						
		}
		Sale sale2 = new Sale("003", "08", saleman2, pro);
		System.out.println(sale2.getAmont());
		sales.add(sale2);
		sales.add(sale1);
		System.out.println(sale1.mostExpensiveSale(sales));
		System.out.println(sale1.worstSaleman(sales));
	}

}
