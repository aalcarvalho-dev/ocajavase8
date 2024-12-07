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
	}
}
