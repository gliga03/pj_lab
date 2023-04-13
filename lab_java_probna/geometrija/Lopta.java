package geometrija;

public class Lopta extends Telo {

	public Lopta(String ime) {
		super(ime);
	}
	
	@Override
	public double zapremina() {
		return (4.0/3.0)*r*r*r*Math.PI;
	}
	
	public String toString() {
		
		return "Lopta sa zapreminom: " + zapremina() + ", r = " + r;
		
	}
	
}
