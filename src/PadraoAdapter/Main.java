package PadraoAdapter;

public class Main {

	public static void main(String[] args) {
		Pato pato = new Pato();
		Peru peru = new Peru();
		
		PatoGenerico peruAdaptado = new PeruAdaptado(peru);
		
		System.out.println("O peru faz: ");
		peru.gorgolejar();
		peru.voarBaixo();
		
		System.out.println("\nO pato faz: ");
		chamaPato(pato);
		
		System.out.println("\nO peru adaptado faz: ");
		chamaPato(peruAdaptado);
		
		
	}
	
	static void chamaPato(PatoGenerico patoGenerico) {
		patoGenerico.quack();
		patoGenerico.fly();
	}
	
	
	
}

