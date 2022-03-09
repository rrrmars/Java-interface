package Interface;

public class cavalo implements Animal{

	@Override
	public void movimento() {
		System.out.println("O cavalo está galopando...");
		
	}

	@Override
	public void som() {
		System.out.println("O cavalo está relinchando...");
		
	}
	

}
