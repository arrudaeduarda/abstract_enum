package animal;

public class Tigre extends Animais{
	public Tigre(String nome,String sexo,String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O tigre Ronca");
	}
	@Override
	public void dormir() {
		System.out.println("O tigre Dorme");
	}
	@Override
	public void caminhar() {
		System.out.println("O tigre Caminha");	
	}
	@Override
	public void correr() {
		System.out.println("O tigre Corre");
	}	
}