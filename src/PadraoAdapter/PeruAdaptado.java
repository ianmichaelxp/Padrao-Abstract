package PadraoAdapter;

public class PeruAdaptado implements PatoGenerico {
	PeruGenerico peruGenerico;
	
	public PeruAdaptado(PeruGenerico peruGenerico) {
		this.peruGenerico = peruGenerico;
	}

	@Override
	public void quack() {
		peruGenerico.gorgolejar();
		
	}

	@Override
	public void fly() {
		for(int i = 0;i < 5;i++) {
			peruGenerico.voarBaixo();
		}
		
		
	}
	
	

}
