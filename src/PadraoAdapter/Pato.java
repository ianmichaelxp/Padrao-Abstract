package PadraoAdapter;

public class Pato implements PatoGenerico {

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

	@Override
	public void fly() {
		System.out.println("Estou voando");
		
	}

}
