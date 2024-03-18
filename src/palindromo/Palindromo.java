package palindromo;

public class Palindromo {

	public static void main(String[] args) {
		detectorDePalindromos("anilina");
		
	}

	private static void detectorDePalindromos(String palindromo) {
		
		char[] anver = palindromo.toCharArray();
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		
		char[] rever = new char[palindromo.length()];
		int x = 0;
		for(int i = palindromo.length() -1; i>-1; --i, ++x) {
			 rever[x] = palindromo.charAt(i);
		}
	
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		
		String reverso = "";
		String anverso = "";
		reverso = String.valueOf(rever);
		anverso = String.valueOf(anver);
		
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		
		if(reverso.equals(anverso)) {
			System.out.println("Es un Palindromo");
		}
		else {
			System.out.println("No es un palindromo");
		}
		
	}

}
