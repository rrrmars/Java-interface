package Interface;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Animal a1 = new cachorro();
		Animal a2 = new cavalo();
		Animal a3 = new preguica();
		
		a1.movimento();
		a1.som();
		
		a2.movimento();
		a2.som();
		
		a3.movimento();
		a3.som();
		
		
		

	}

}
