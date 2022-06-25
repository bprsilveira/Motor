package motor;

public class Motor13 extends Motor {
	
	protected static double gasto = 3;
	
	public Motor13(String nome, double combustivel) {
		
		super (nome, combustivel);
		
	}
	
	
	
	public double Acelera() {
		
		return this.combustivel - this.gasto;
	}

}
