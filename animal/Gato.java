package animal;

public class Gato extends Animais{
	public Gato(String nome,String sexo,String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato Ronrona");
	}
	@Override
	public void dormir() {
		System.out.println("O gato Dorme");	}
	@Override
	public void caminhar() {
		System.out.println("O gato Caminha");	
	}
	@Override
	public void correr() {
		System.out.println("O gato Corre");
	}
}