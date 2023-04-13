package geometrija;

public class Valjak extends Telo {
	
	private double h;
	
	public Valjak(String ime) {
		
		super(ime);
		this.h = Math.random() * 10;
		
	}

	@Override
	public double zapremina() {
		return r*r*h*Math.PI;
	}
	

}
