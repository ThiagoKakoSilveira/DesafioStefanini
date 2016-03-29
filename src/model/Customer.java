package model;

public class Customer {
	private String id, cnpj, name, businessArea;
		
	public Customer(String id, String cnpj, String name, String businessArea) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cnpj=" + cnpj + ", name=" + name + ", businessArea=" + businessArea + "]";
	}
	
	

}
