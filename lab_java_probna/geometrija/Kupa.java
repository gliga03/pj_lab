package geometrija;

public class Kupa extends Telo {

	private double h;
	
	public Kupa(String ime) {
		
		super(ime);
		this.h = Math.random() * 10;
		
	}

	@Override
	public double zapremina() {
		return (1/3)*r*r*h*Math.PI;
	}
	
}
