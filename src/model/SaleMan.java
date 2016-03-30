package model;

public class SaleMan {
	
	private String id, cpf, name;
	private double salary;
	
	public SaleMan(String id, String cpf, String name, double salary){
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		this.salary = salary;
	}
	
	public SaleMan(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SaleMan [id=" + id + ", cpf=" + cpf + ", name=" + name + " Salary="+salary+"]";
	}
	
	public SaleMan deliverySaleman(String name){
		if(this.name==name){
			return this;
		}
		return null;
	}

}
