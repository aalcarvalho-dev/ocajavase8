package builder;
public class TesteStringBuilder{
	public static void main(String[] args){
		String textoA = "Texto inicial com String!";
		String textoB = new String("Texto B, com outro conteúdo! "); 
		StringBuilder sb = new StringBuilder("Esse é um Sring Builder, ENTENDEU?");
		byte byteA= 100;
		long longA= 100;
		double doubleA = 111;
		char[] charA = {'a','l','e','x','a','n','d','r','e'};

		//append
		System.out.println(sb.append(textoA));
		System.out.println(sb.append(byteA).append(longA));
		System.out.println(sb.append('c'));
		System.out.println(sb.append(2f));
		System.out.println(sb.append(doubleA));
		System.out.println(sb.append(charA));
		System.out.println(sb.append(charA,2,5));

		//delete(int,int)
		//deleteCharAt(int)
		System.out.println(sb.delete(0,5));
		System.out.println(sb.deleteCharAt(10));

		//indexOf(String)
		//indexOf(String,int)
		System.out.println(sb.indexOf("Sring"));
		System.out.println(sb.indexOf("Sring",0));
		System.out.println(sb.indexOf("Sring",45));

		//insert(int, String)
		System.out.println(sb.insert(0,"amor"));
		System.out.println(sb.insert(10,"luau"));

		//lastIndexOf(String)
		//lastIndexOf(String,int)
		System.out.println(sb.lastIndexOf("ENT"));
		System.out.println(sb.lastIndexOf("ENDEU"));

		//replace(int,int,String)
		System.out.println(sb.replace(0,3,"ABCDEF"));

		//reverse()
		System.out.println(sb.reverse());


	}
}

