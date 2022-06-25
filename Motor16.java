package motor;

public class Motor16 extends Motor {
	
	public static double gasto = 5;
	
	public Motor16(String nome, double combustivel) {
		
		super(nome, combustivel);
		
	}
	
public double Acelera() {
		
		return this.combustivel - this.gasto;
	}

}
