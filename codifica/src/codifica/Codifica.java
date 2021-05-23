package codifica;

public class Codifica {

	public static void main(String[] args) {
		
		String S = "The sunset sets at twelve o' clock.";
		
		String resultado = encodeString(S);
		
		System.out.println(resultado);

	}
	
	public static String encodeString(String S) {
		
		String frase= S.toLowerCase();
		
		String texto = "";
		
		for(int i = 0;i<frase.length();i++) {
			
			if((int)frase.charAt(i)>=96 && (int)frase.charAt(i)<=122) {
				
			texto = texto+((int)frase.charAt(i)-96+" ");
			
			}
		}
		
		return texto;

	}

}
