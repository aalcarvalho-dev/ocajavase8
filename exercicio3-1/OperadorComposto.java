package operador;
public class OperadorComposto{

	public static void main(String[] args){
		byte a;
		a = 10;
		System.out.println(a += 3);
		a = 15;
		System.out.println(a -= 3);
		a = 20;
		System.out.println(a *= 3);
		a = 25;
		System.out.println(a /= 3);
		a = 30;
		System.out.println(a %= 3);
		a = 35;
		//Opcional. Fora do escopo do exame
		System.out.println(a &= 3);
		a = 40;
		System.out.println(a ^= 3);
		a = 45;
		System.out.println(a |= 3);
		a = 50;
		System.out.println(a <<= 3);
		a = 55;
		System.out.println(a >>= 3);
		a = 60;
		System.out.println(a >>>= 3);
		//Fim Opcional
	}
}
