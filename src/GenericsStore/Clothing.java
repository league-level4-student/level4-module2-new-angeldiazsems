package GenericsStore;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends NonFood{
	public Clothing() {
		this.item = new Random().nextBoolean() ? "toy1.jpeg" : "toy2.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
