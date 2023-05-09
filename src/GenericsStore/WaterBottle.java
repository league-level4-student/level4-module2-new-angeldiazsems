package GenericsStore;

import java.util.Random;

import javax.swing.JLabel;

public class WaterBottle extends NonFood{
	public WaterBottle() {
		this.item = new Random().nextBoolean() ? "" : "";
		
		
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	@Override
	public String toString() {
		return "Water";
		
	}
	
	
}
