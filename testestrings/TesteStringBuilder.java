package builder;
public class TesteStringBuilder{
	public static void main(String[] args){
		String textoA = "Texto inicial com String!";
		StringBuilder sb = new StringBuilder("Esse é um Sring Builder, ENTENDEU?");
		byte byteA= 100;
		long longA= 100;
		double doubleA = 111;
		char[] charA = {'a','l','e','x','a','n','d','r','e'};

		//appendd
		System.out.println(sb.append(textoA));
		System.out.println(sb.append(byteA).append(longA));
		System.out.println(sb.append('c'));
		System.out.println(sb.append(2f));
		System.out.println(sb.append(doubleA));
		System.out.println(sb.append(charA));
		System.out.println(sb.append(charA,2,5));

		//delete(int,int)
		//deleteCharAt(int)


	}
}

