package model;

import java.util.List;



public class Sale {
	private String id, sale_id;
	private SaleMan saleman;
	private List<Products> listProducts;
	private double amont;
	
	public Sale(String id, String sale_id, SaleMan saleman, List<Products> listProducts) {		
		this.id = id;
		this.sale_id = sale_id;
		this.saleman = saleman;
		this.listProducts = listProducts;
		this.amont = calcutesSale(listProducts);
	}
	
	public Sale(){
		
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSale_id() {
		return sale_id;
	}
	
	public void setSale_id(String sale_id) {
		this.sale_id = sale_id;
	}
	
	public SaleMan getSaleman() {
		return saleman;
	}
	
	public void setSaleman(SaleMan saleman) {
		this.saleman = saleman;
	}
	
	public List<Products> getListProducts() {
		return listProducts;
	}
	
	public void addProduct(Products listProducts) {
		this.listProducts.add(listProducts) ;
	}
	
	public void setList(List<Products> list){
		this.listProducts = list;
	}
	
	public double getAmont() {
		return amont;
	}
	
	public void setListProducts(List<Products> listProducts) {
		this.listProducts = listProducts;
	}

	public String deliveryProduct(){
		String content = "";
		for (Products products : listProducts) {
			content = content + Integer.toString(products.getId())
							  +Integer.toString(products.getQuantity())
							  +Double.toString(products.getPrice())
							  +"\n";
		}
		return content;		
	}
	
	public double calcutesSale(List<Products> prod){
		double amont = 0;
		for (Products product : prod) {			
			amont += product.getPrice()*product.getQuantity();
		}
		return amont;
	}
	
	public String mostExpensiveSale(List<Sale> sales){
		String idMostExpensiveSale="";
		double mostAmont=0;
		for (int i = 0; i < sales.size(); i++) {
			if(i==0){
				idMostExpensiveSale = sales.get(i).sale_id;
				mostAmont=sales.get(i).amont;
			}
			else if(mostAmont<sales.get(i).amont){
				mostAmont=sales.get(i).amont;
				idMostExpensiveSale = sales.get(i).sale_id;
			}
		}
		return idMostExpensiveSale;
	}
	
	public String worstSale(List<Sale> sales){
		String idWorstSale="";
		double mostAmont=0;
		for (int i = 0; i < sales.size(); i++) {
			if(i==0){
				idWorstSale = sales.get(i).sale_id;
				mostAmont=sales.get(i).amont;
			}
			else if(mostAmont<sales.get(i).amont){
				mostAmont=sales.get(i).amont;				
				idWorstSale = sales.get(i).sale_id;
			}
		}
		return idWorstSale;
	}
	
	public SaleMan worstSaleman(List<Sale> sales){
		SaleMan worstSaleman = new SaleMan();
//		String idWorstSale="";
		double lowerTotal=0;
		for (int i = 0; i < sales.size(); i++) {
			if(i==0){
				worstSaleman=sales.get(i).saleman;
//				idWorstSale=sales.get(i).sale_id;
				lowerTotal=sales.get(i).amont;
			}
			else if(lowerTotal>sales.get(i).amont){
				lowerTotal=sales.get(i).amont;
				worstSaleman=sales.get(i).saleman;
//				idWorstSale=sales.get(i).sale_id;
			}
		}
		return worstSaleman;
		
	}
	
	@Override
	public String toString() {		
		return "Sales [id=" + id + ", sale_id=" + sale_id + ", saleman=" + saleman.getName() + ", listProducts=" + listProducts + "]";
	}
}
