package motor;

public class motorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor20 m1 = new Motor20("Motor20", 100);
		Motor1000 m2 = new Motor1000("Motor1000", 100);
		Motor13 m3 = new Motor13("Motor13", 100);
		Motor16 m4 = new Motor16("Motor16", 100);
		
		m1.Painel();
		m2.Painel();
		m3.Painel();
		m4.Painel();
		

	}

}
