package animal;

public class Lobo extends Animais{
	public Lobo(String nome,String sexo,String raca) {
		super (nome, sexo, raca);
	}	
	@Override
	public void emitirSom() {
		System.out.println("O lobo Uiva");
	}
	@Override
	public void dormir() {
		System.out.println("O lobo Dorme");
	}
	@Override
	public void caminhar() {
		System.out.println("O lobo Caminha");
	}
	@Override
	public void correr() {
		System.out.println("O lobo Corre");
	}
}