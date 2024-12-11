package operador;
public class TesteOperador{
	public static void main(String[] args){
		boolean temRazao = true;
		//boolean naoTemRazao = FALSE; erro compilacao
		//boolean podeNumero = 0; erro
		//boolean podeString = "true"; erro

		byte piratas = 127;
		//byte piratasV2 = 128; erro
		byte piratasV3 = -1;
		byte piratasV4 = -128;
		//byte piratasV5 = -129;

		int goldCoins = 0;
		goldCoins +=99;
		System.out.println(goldCoins);
		
		byte a = 40;
		System.out.println(a &= 3);
		a = 10;
		System.out.println(a ^= 2);
		a = 10;
		System.out.println(a |= 2);
		a = 10;
		System.out.println(a <<= 2);

		a = 10;
		int matches = 15;
		System.out.println(a + matches);

		long matchesLong = 20;
		System.out.println(a + matchesLong);

		String nome = "Aldair";
		System.out.println(nome + matches);

		System.out.println(matches + nome);

		String numero = "15";
		System.out.println(numero + a);

		System.out.println(a > matches);
		System.out.println(a > matchesLong);
		//System.out.println(nome > numero);

		char caracter = 'c';
		System.out.println(a +  caracter);
		System.out.println(a > caracter);

		float flutua = 1.5f;
		System.out.println(caracter > flutua);

		System.out.println(flutua + a);

		Object obj1 = new Object();
		System.out.println(obj1);
		
		Object obj2 = new Object();
		System.out.println(obj2);

		Object obj3 = obj1;

		System.out.println("objs 1 e 3"+(obj1 == obj3));
		System.out.println("objs 1 e 3"+(obj1.equals(obj3)));
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

		Integer numInt = 10;
		System.out.println(numInt);

		Integer numInt2 = 10;
		System.out.println(numInt==numInt2);
		System.out.println(numInt.equals(numInt2));

		String numString = "10";
		//System.out.println(numString == numInt);
		System.out.println(numString.equals(numInt));

		System.out.println("---");
		String aa = "Nome";
		StringBuilder ab = new StringBuilder("Nome");
		//System.out.println(aa==ab);
		System.out.println(aa.equals(ab));
		System.out.println(aa + ab);

		String ac = "mauro";
		int ad = ac.indexOf(97);
		System.out.println(ad);
	}
}
