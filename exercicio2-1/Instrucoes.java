package instrucoes;
public class Instrucoes{
	public static void main(String[] args){
		String nome = "alphx";
		switch(nome){
			default:
				System.out.println("primeiro default");
			case "alpha":
				System.out.println("aqui é alpha");
				break;
			case "dudu":
				System.out.println("dudu");
				//break;
			//default:
			//	System.out.println("saiu no default");
			case "gloria":
				System.out.println("continuou");
		}
	}
}
