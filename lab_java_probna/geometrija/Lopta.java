package geometrija;

public class Lopta extends Telo {

	public Lopta(String ime) {
		super(ime);
	}
	
	@Override
	public double zapremina() {
		return (4/3)*r*r*r*Math.PI;
	}
	
}
