package animal;

public class Leao extends Animais{
	public Leao(String nome,String sexo,String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O leão Ruge");
	}
	@Override
	public void dormir() {
		System.out.println("O leão Dorme");
	}
	@Override
	public void caminhar() {
		System.out.println("O leão Caminha");
	}
	@Override
	public void correr() {
		System.out.println("O leão Corre");
	}
}