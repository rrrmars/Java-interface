package Interface;

public class cachorro implements Animal{
	
	@Override 
	public void movimento() {
		System.out.println("Cachorro est� correndo...");
}

	@Override
	public void som() {
		System.out.println("O cachorro est� latindo...");
	}
		
	}
