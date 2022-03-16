package Basiccommands;

import java.util.Scanner;

public class AsgmtQ5 {

	public static void main(String[] args) {
		String pname;
		int price;
		float discount;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product name");
		pname = s.next();
		System.out.println("Enter the price of the product");
		price = s.nextInt();
		if(price > 2000)
			{	discount = price * 0.1f;
				System.out.println("Congratulations!You are eligible for 10% discount");
			}
		else
		{		discount = price * 0.07f;
			System.out.println("Congratulations!You are eligible for 7% discount");
		}
		System.out.println("Product = " + pname);
		System.out.println("Price of the Product is = " + price);
		System.out.println("Discount = " + discount);
		System.out.println("Price after discount = " + (price - discount));

	}

}
