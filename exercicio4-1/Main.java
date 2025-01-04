package ex41;
public class Main{
	public static void main(String[] args){
		Car myCar = new Car(new Integer(230),Boolean.TRUE);
		System.out.println(myCar.isRunning());

		System.out.println(myCar.getTopSpeed());
	}
}
