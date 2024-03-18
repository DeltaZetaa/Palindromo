package palindromo;

public class Palindromo {

	public static void main(String[] args) {
		detectorDePalindromos("anilina");
		
	}

	private static void detectorDePalindromos(String palindromo) {
		String reverso = "";
		String anverso = "";
		
		
		char[] anver = palindromo.toCharArray();
		for(int i = 0; i<palindromo.length(); ++i ) {
			System.out.println(i + " " + anver[i]);
		}
		
		
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		
		char[] rever = new char[palindromo.length()];
		int x = 0;
		for(int i = palindromo.length() -1; i>-1; --i, ++x) {
			 rever[x] = palindromo.charAt(i);
			System.out.println(x + " " + rever[x]);
		}
		
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		reverso = String.valueOf(rever);
		System.out.println("Palindromo al reves: "+reverso);
		
		anverso = String.valueOf(anver);
		System.out.println("Palindromo del derecho: "+anverso);
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		
		//IF DE COMPROBACION▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
		if(reverso.equals(anverso)) {
			System.out.println("Es un Palindromo");
		}
		else {
			System.out.println("No es un palindromo");
		}
		
	}

}
