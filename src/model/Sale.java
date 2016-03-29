package model;

import java.util.List;



public class Sale {
	private String id, sale_id;
	private SaleMan saleman;
	private List<Products> listProducts;
	
	public Sale(String id, String sale_id, SaleMan saleman, List<Products> listProducts) {		
		this.id = id;
		this.sale_id = sale_id;
		this.saleman = saleman;
		this.listProducts = listProducts;
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
	
	@Override
	public String toString() {		
		return "Sales [id=" + id + ", sale_id=" + sale_id + ", saleman=" + saleman.getName() + ", listProducts=" + listProducts + "]";
	}
	
		

}
