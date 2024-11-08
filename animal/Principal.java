package animal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Lobão","M","Lupino");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		System.out.println("-----------------------");
		
		Leao leao = new Leao("Leão Proerd","M","Lion");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		System.out.println("-----------------------");
		
		Tigre tigre = new Tigre("Cheetos","M","Tiger");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		System.out.println("-----------------------");
		
		Cachorro cachorro = new Cachorro("Nutella","F","Pinscher");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		System.out.println("-----------------------");
		
		Gato gato = new Gato("Frajola", "M", "American Shorthair");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
	}
}