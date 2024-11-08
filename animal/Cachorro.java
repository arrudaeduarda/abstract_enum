package animal;

public class Cachorro extends Animais{
	public Cachorro(String nome,String sexo,String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O cachorro Late");
	}
	@Override
	public void dormir() {
		System.out.println("O cachorro Dorme");
	}
	@Override
	public void caminhar() {
		System.out.println("O cachorro Caminha");	
	}
	@Override
	public void correr() {
		System.out.println("O cachorro Corre");
	}
}