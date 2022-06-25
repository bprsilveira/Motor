package motor;

public abstract class Motor { 
	
	protected String nome;
	protected double combustivel;
	protected static double gasto;
		
	public Motor(String nome, double combustivel) {
		
		this.nome = nome;
		this.combustivel = combustivel;
			
	}
	
	public String getMotor() {
		
		return this.nome;
	}
	
	public double getCombustivel() {
		
		return this.combustivel;
	}
	
	public double Acelera() {
		
		return this.combustivel - this.gasto;
	}
	
	public void Painel() {
		
		
		System.out.println("Nome do motor: " + this.getMotor());
		System.out.println("combustivel inicial: " + this.getCombustivel());
		System.out.println("Combustivel restante, uma acelerada: " + this.Acelera());
		System.out.println();
		
	}
	

}
