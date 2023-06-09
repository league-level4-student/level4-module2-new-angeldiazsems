package GenericsStore;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T> {
	public T[] cart;

	public Cart() {
		cart = (T[]) new NonFood[100];
	}

	// Adds an item to the cart
	public void add(T item) {
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				cart[i] = item;
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Your cart is full!\nNo more than 100 items");
	}

	public void remove(String thing) {

		// loop through the array
		// if they say computer && item is instanceof Computer

	
			for (int i = 0; i < cart.length; i++) {
				if (cart[i] instanceof Clothing && thing == "clothing") {
					cart[i] = null;
					break;
				}
				else if(cart[i] instanceof Toy && thing == "toys") {
					cart[i] = null;
					break;
				}
				else if(cart[i] instanceof Dog && thing == "dogs") {
					cart[i] = null;
					break;
				}
				else if(cart[i] instanceof Computer && thing == "computers") {
					cart[i] = null;
					break;
				}
				else if(cart[i] instanceof WaterBottle && thing == "water") {
					cart[i] = null;
					break;
				}
				else {
					
				}
			}

	}
	

	// Displays everything currently in the cart
	public void showCart() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {
				if (cart[i] instanceof NonFood) {
					panel.add(((NonFood) cart[i]).getNonFood());
				}

			}
		}
		frame.pack();

	}

	public int length() {
		return cart.length;
	}
}
