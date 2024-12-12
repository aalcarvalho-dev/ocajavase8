package cadeiadecaracteres;
public class TesteStrings{
	public static void main(String[] args){
		String texto = " novidade hoje! ";
		String textoDois = new String(" Esse é um texto Dois!");
		String textoTres = ("");

		System.out.println("texto: "+texto);
		System.out.println("texto2: "+textoDois);
		System.out.println("texto3: "+textoTres);

		//charAt(int)
		System.out.println(texto.charAt(5));
		//concat(String)			
		System.out.println(texto.concat(textoDois));
		//endsWith(String)
		System.out.println(texto.endsWith("hoje! "));
		//equalsIgnoreCase(String):boolean
		System.out.println(texto.equalsIgnoreCase(textoDois));
		//indexOf(int)
		System.out.println(texto.indexOf('d'));
		//indexOf(int,int)
		System.out.println(texto.indexOf('d',6));
		//indexOf(String)
		System.out.println(texto.indexOf("hoje"));
		//indexOf(String, int)
		System.out.println(texto.indexOf("idade",2));
		//length()
		System.out.println(texto.length());
		//replace(char, char)
		System.out.println(texto.replace('v','f'));
		//replace(CharSequence, CharSequence)
		System.out.println(texto.replace("novidade","nada de novo"));
		//startsWith(String)
		//startsWith(String, int):boolean
		System.out.println(texto.startsWith(" n"));
		System.out.println(texto.startsWith("hoje",4));
		//toLowerCase(Locale)
		//toLowerCase()
		System.out.println(texto.toLowerCase());
		//toString()
		System.out.println(texto.toString());
		//toUpperCase()
		System.out.println(texto.toUpperCase());
		//trim()
		System.out.println(texto.trim());

	}
}
