package ex71;
public class Rose extends Plant{
	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 3;
	private String name = "Rose";

	private void grow(){
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}

	public void doSpring(){
		grow();
		addYearToAge();
		System.out.println(getName()+" Primavera: começando a crescer");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doSummer(){
		grow();
		System.out.println(getName()+" Verão: continuar a crescer");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doFall(){
		grow();
		System.out.println(getName()+" Outono: cresce");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	public void doWinter(){
		grow();
		System.out.println(getName()+" Inverno: cresce");
		System.out.println("Idade: "+getAge()+" Tamanho: "+getHeight());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
