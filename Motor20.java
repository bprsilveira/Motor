package motor;

public class Motor20 extends Motor {
	
	protected static double gasto = 10;
	
	public Motor20(String nome, double combustivel) {
		
		super(nome, combustivel);
	}
	
   public double Acelera() {
		
		return this.combustivel - this.gasto;
	}
		
}
