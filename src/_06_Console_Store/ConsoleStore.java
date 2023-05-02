package _06_Console_Store;

import java.util.Scanner;

import GenericsStore.Cart;
import GenericsStore.Clothing;
import GenericsStore.Dog;
import GenericsStore.Computer;
import GenericsStore.WaterBottle;
import GenericsStore.Toy;
import GenericsStore.NonFood;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cart<NonFood> cart = new Cart<NonFood>();
		System.out.println("WHATS YOUR NAME?!?!??!");
		String name = scan.nextLine();
		System.out.println(
				"HELLO AND WECLOME TO TOYS R US. I'M MRBEAST AND I'M GOING TO BE GIVING YOU $1000 TO BUY WHAEVTER YOU WANT");
		System.out.println("TOY R US IS CURRENTLY SELLING: CLOTHING, TOYS, DOGS, COMPUTERS, AND WATER");
		String decision = "";
		String item = "";
		
		do {
			System.out.println("DO YOU WANT TO ADD TO CART, REMOVE FROM CART, VIEW, OR CHECK OUT?(ex: view dogs");
			decision = scan.next();
			item = scan.next();
			
			if (decision.equals("add")) {
				if(item == "clothing") {
					Clothing c = new Clothing();
					add(c , cart);
				}
				else if(item == "toys") {
					Toy toy = new Toy();
					add(toy, cart);
				}
				else if(item == "dogs"){
					Dog dog = new Dog();
					add(dog, cart);
				}
				else if(item == "computers") {
					Computer computer = new Computer();
					add(computer, cart);
				}
				else {
					WaterBottle water = new WaterBottle();
					add(water, cart);
				}
			}
			else if(decision.equals("remove")) {
				remove(item, cart);
			}
			else {
				view(item);
			}
			
		} while (!decision.equals("check"));

		
		System.out.println("----------------------------------------");
		System.out.println("CHECKING OUT...");
		for(int i = 0; i < cart.length(); i++) {
			System.out.println(cart.toString()+"");
		}
		System.out.println();
		
		cart.showCart();
		
		
		
		
	}

	public static void add(NonFood item, Cart cart) {
		cart.add(item);
		System.out.println(item.toString()+" HAS BEEN ADDED TO YOUR CART");
    }
	public static void remove(String item, Cart cart) {
    	cart.remove(item);
    	System.out.println(item+" HAS BEEN REMOVED FROM YOUR CART");
    	
    }
	public static void view(String item) {
		int cost = 0;
		if(item.equals("clothing")) {
			cost = 30;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);
		}
		else if(item.equals("toys")) {
			cost = 100;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);

		}
		else if(item.equals("dogs")) {
			cost = 5;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);
		}
		else if(item.equals("computers")) {
			cost = 300;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);

		}
		else if(item.equals("water")) {
			cost = 1;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);
		}
		else {
			System.out.println(item+" ISN'T SOLD HERE!!");
		}
    }

}
