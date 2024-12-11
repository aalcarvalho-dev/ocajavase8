package exstringbuilder;
public class ExStringBuilder{
	public static void main(String[] args){
		StringBuilder sbPuro = new StringBuilder();
		sbPuro.append("Início");
		System.out.println(sbPuro);

		StringBuilder sbCharSeq = new StringBuilder(new StringBuffer());
		sbCharSeq.insert(0, "Olá, Mundo!");
		System.out.println(sbCharSeq);

		sbPuro.append(sbCharSeq);
		System.out.println(sbPuro);

		sbPuro.insert(6," ");
		System.out.println(sbPuro);

		StringBuilder sbCapacity = new StringBuilder(1);
		sbCapacity.append("abcdefghijklmn");
	}
}
