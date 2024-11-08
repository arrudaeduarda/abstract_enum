package animal;

public abstract class Animais {
	private String nome;
	private String sexo;
	private String raca;


	public Animais(String nome,String sexo,String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();
}