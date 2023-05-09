package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
		int money = 1000;
		
		do {
			System.out.println("DO YOU WANT TO ADD TO CART, REMOVE FROM CART, VIEW, OR CHECK OUT?(ex: view dogs");
			decision = scan.next();
			item = scan.next();
			
			
			if (decision.equals("add")) {
				if(item.equals("clothing")) {
					Clothing c = new Clothing();
					add(c , cart);
				}
				else if(item.equals("toys")) {
					Toy toy = new Toy();
					add(toy, cart);
				}
				else if(item.equals("dogs")){
					Dog dog = new Dog();
					add(dog, cart);
				}
				else if(item.equals("computers")) {
					Computer computer = new Computer();
					add(computer, cart);
				}
				else if(item.equals("water")){
					WaterBottle water = new WaterBottle();
					add(water, cart);
				}
				else {
					
				}

			}
			else if(decision.equals("remove")) {
				remove(item, cart);
			}
			else {
				if(decision.equals("view")){
					view(item);
				}
			}
			
		} while (!decision.equals("check"));

		
		System.out.println("----------------------------------------");
		System.out.println("CHECKING OUT...");
		for(int i = 0; i < cart.length(); i++) {
			
			if (cart.cart[i] instanceof Clothing ) {

				money -=30;
				if(money < 0) {
					System.out.println("you can't afford the rest of the items have. do you want to return them?(y/n)");
					String answer = scan.next();
					if(answer.equals("y")) {
						money+=30;
						break;
					}
				}
				System.out.println("Bought clothing for $30");			
			}
			else if(cart.cart[i] instanceof Toy) {

				money -=50;
				if(money < 0) {
					System.out.println("you can't afford the rest of the items have. do you want to return them?(y/n)");
					String answer = scan.next();
					if(answer.equals("y")) {
						money+=50;
						break;
					}
				}
				System.out.println("Bought a toy for $50");

			}
			else if(cart.cart[i] instanceof Dog) {

				money -=5;
				if(money < 0) {
					System.out.println("you can't afford the rest of the items have. do you want to return them?(y/n)");
					String answer = scan.next();
					if(answer.equals("y")) {
						money+=5;
						System.out.println("returned");
						break;
					}
				}
				System.out.println("Bought a dog for $5");

			}
			else if(cart.cart[i] instanceof Computer) {

				money -=250;
				if(money < 0) {
					System.out.println("you can't afford the rest of the items have. do you want to return them?(y/n)");
					String answer = scan.next();
					if(answer.equals("y")) {
						money+=250;
						break;
					}
				}
				System.out.println("Bought a computer for $250");

			}
			else if(cart.cart[i] instanceof WaterBottle) {

				money -= 1;
				if(money < 0) {
					System.out.println("you can't afford the rest of the items have. do you want to return them?(y/n)");
					String answer = scan.next();
					if(answer.equals("y")) {
						money +=1;
						break;
					}
				}
				System.out.println("Bought water for $1");
			}
			else {
				
			}
			
		}
		System.out.println("All bought by "+name);
		
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
			cost = 50;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);

		}
		else if(item.equals("dogs")) {
			cost = 5;
	    	System.out.println("YOU SEE THAT "+item+" COST $"+cost);
		}
		else if(item.equals("computers")) {
			cost = 250;
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
