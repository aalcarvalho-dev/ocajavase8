package incremento;
public class Incremento{

	public static void main(String[] args){
		int i = 0;
		i++;
		System.out.println(i);
		i = 0;
		System.out.println(i++);
		System.out.println(i);
		i = 0;
		System.out.println(++i);
		System.out.println(i);
		i = 0;
		++i;
		System.out.println(i);

		for (int j=0; j < 3; j++){
			System.out.println(j);
		}

		for (int j=0; j < 3; ++j) System.out.println(j);

		boolean isValid = true;

		if (i == 0) ; else if (i == 1) {} else {;}

		boolean novidade = new Boolean(true);
		boolean velhice = new Boolean("true");
		boolean meeiro = new Boolean("TRUE");
		//boolean novissimo = new Boolean(TRUE);
	}
}
