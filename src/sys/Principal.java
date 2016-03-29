package sys;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import model.Customer;
import model.Products;
import model.Sale;
import model.SaleMan;

public class Principal {

	private Map<String, SaleMan> sellers = new HashMap<String, SaleMan>();
	
	private List<Sale> sales = new ArrayList<>();
	
	public void executar() {

		try {
			String user = System.getProperty("user.home");
			File folder = new File(user + File.separator + "Data" + File.separator + "in" + File.separator);
			
			for (File file : folder.listFiles()) {
				if (file.getName().endsWith(".dat")) {
				
//					BufferedReader buffer = new BufferedReader(new FileReader(file));
//					System.out.println(file);
					Scanner read = new Scanner(file);
					read.useDelimiter("ç|\\n|\\r");
					
					while (read.hasNext()) {
						String id_operation = read.next();
						
						if (id_operation.equals("001")) {
							String saleCpf = read.next();
							String saleName = read.next();
							double sal = Double.parseDouble(read.next());
							SaleMan saleman = new SaleMan(id_operation, saleCpf, saleName, sal);
							populateSellers(saleman);
							System.out.println(saleman);
						} else if (id_operation.equals("002")) {
							String custCnpj = read.next();
							String custName = read.next();
							String custBusinessArea = read.next();
							Customer custumer = new Customer(id_operation, custCnpj, custName, custBusinessArea);
							System.out.println(custumer);
						} else if (id_operation.equals("003")) {
							String saleId = read.next();
							String prodStrings = read.next();
							String nameSaleman = read.next();
							
							prodStrings = prodStrings.replace("[", "").replace("]", "");
							String[] itens = prodStrings.split(",");
							List<Products> listProd = new ArrayList<>();
							for (String string : itens) {
								String[] pro = string.split("-");
								int id_product = Integer.parseInt(pro[0]);
								int quant_product = Integer.parseInt(pro[1]);
								double price_product = Double.parseDouble(pro[2]);

								listProd.add(new Products(id_product, quant_product, price_product));
							}
							
							Sale sale = new Sale(id_operation, saleId, sellers.get(nameSaleman), listProd);
							sales.add(sale);
							
							System.out.println(sale);
						}
					}
				}
			}	
			
//			for (Sale sale : sales) {
//				System.out.println(sale);
//			}
//			
//			sales.forEach(sale -> System.out.println(sale));
//			sales.forEach(System.out::println);
			
		} catch (Exception e) {
			System.out.println("Erro brabo: ");
			e.printStackTrace();
		}
	}

	public void populateSellers(SaleMan man) {
		sellers.put(man.getName(), man);
	}

	// criar o método que compara o vendedor na minha lista

}
