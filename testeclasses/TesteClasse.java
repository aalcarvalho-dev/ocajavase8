package classesjava;
public class TesteClasse{
	public static void main(String[] args){
		float numFloat = 1.05f;
		int numInt = (int) numFloat; //sem cast não compila

		int numeroInt = 10;
		float numeroFloat = numeroInt; //funciona pois não há perda de precisão
	}
}
