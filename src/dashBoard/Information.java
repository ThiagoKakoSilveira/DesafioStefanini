package dashBoard;
import java.util.List;

import model.Sale;
import model.SaleMan;
public class Information {
	
	private List<Sale> sales;
	private int quantityCustomer, quantitySaleman;
	private String idMostExpensiveSale;
	private SaleMan worstSaleman;
	private Sale sal = new Sale();
	
	public Information(List<Sale> sals, int quantityCustomer, int quantitySaleman) {		
		this.sales = sals;
		this.quantityCustomer = quantityCustomer;
		this.quantitySaleman = quantitySaleman;
		this.idMostExpensiveSale = sal.mostExpensiveSale(sals);
		this.worstSaleman = sal.worstSaleman(sals);
	}
	
	public String deliveryInformation(){
		//quantidade de cliente, quantidade de vendedor, id da maior venda e pior vendedor
		StringBuilder answer = new StringBuilder();
		answer.append("There is in file "+quantityCustomer+" customer"
				+"\n"+"and "+quantitySaleman+" sellers"
				+"\n"+"the most expensive sale is "+idMostExpensiveSale
				+"\n"+"the worst seller "+worstSaleman.getName());
		return answer.toString();
	}
	
//	public void feedsIdMostSale(List<Sale>sales){
//		idMostExpensiveSale=sale.mostExpensiveSale(sales);
//	}
	
	
}
