package ex71;
public class Tulip extends Plant{
	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;
	private String name = "Tulip";

	private void grow(){
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}

	private void dieDownForWinter(){
		setHeight(0);
	}

	public void doSpring(){
		grow();
		addYearToAge();
		System.out.println(getName()+" Primavera: começando a crescer");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doSummer(){
		System.out.println(getName()+" Verão: parou de crescer");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doFall(){
		System.out.println(getName()+" Outono: começou a despetalar");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doWinter(){
		dieDownForWinter();
		System.out.println(getName()+" Inverno: dormindo no subsolo");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
