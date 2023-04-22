package GenericsStore;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		
	//	Cart<Candy> can = new Cart();
	
		
		// 3. Create another Cart object of type Cereal
		
	//	Cart<Cereal> cer = new Cart();
		
		// 4. Add a few items to EACH cart
		
	//	can.add(new Candy());
	//	can.add(new Candy());
		
	//	cer.add(new Cereal());
	//	cer.add(new Cereal());
	//	cer.add(new Cereal());

		
		// 5. Call the showCart() method on EACH cart
	//	can.showCart();
	//	cer.showCart();
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		Cart<Clothing> cloth = new Cart<Clothing>();
		Cart<Toy> toy = new Cart<Toy>();
		
		cloth.add(new Clothing());
		cloth.add(new Clothing());
		cloth.add(new Clothing());

		toy.add(new Toy());
		toy.add(new Toy());
		toy.add(new Toy());
		toy.add(new Toy());
		
		toy.showCart();
		cloth.showCart();
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
