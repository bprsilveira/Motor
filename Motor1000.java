package motor;

public class Motor1000 extends Motor {
	
	private static double gasto = 2;
	
	public Motor1000(String nome, double combustivel){
		
		super(nome, combustivel);
				
	}
	
	
	
	public double Acelera() {
		
		return this.combustivel - this.gasto;
	}

}
