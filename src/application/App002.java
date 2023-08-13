package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class App002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.forEach(System.out::println);
		System.out.println("-------------");
		 
		list.sort(App002::compareProducts);
		list.forEach(System.out::println);
		System.out.println("-------------");
		
		//---------------------------------------
		//LAMBDA EXPRESSION AS FIRST CLASS OBJECT:

		list.sort( (p1, p2) -> p1.getName().compareTo(p2.getName()));
		list.forEach(System.out::println);
		System.out.println("-------------");
		
		//---------------------------------------
		//LAMBDA EXPRESSION AS FIRST CLASS OBJECT:

		list.sort( (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		list.forEach(System.out::println);

	}

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

}
