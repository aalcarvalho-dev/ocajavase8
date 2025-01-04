package excompareto;
public class ExCompareTo{
	public static void main(String[] args){
		String eggs1 = "Cackle fruit";
		String eggs2 = "Cackle fruit";
		System.out.println(eggs1.compareTo(eggs2));
		eggs1 = eggs1 +"a";
		System.out.println(eggs1.compareTo(eggs2));
		eggs2 = eggs2 + "aa";
		System.out.println(eggs1.compareTo(eggs2));
	}
}
