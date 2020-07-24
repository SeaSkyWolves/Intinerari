import java.util.Arrays;
import java.util.List;

public class Exercici2_Fase2 {
    public static void main(String[] args) throws Exception {
        
    	//Canvia la taula per una llista (List<Character>)
    	List<Character> chars = Arrays.asList('M', '1', 'R', 'C', 'E', 'L');
    	
    	//Al bucle, si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONTANT�.
    	printChar(chars);
    	System.out.println(" ");
    	//Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�
    	checkNumber(chars);

    }
    
    //Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
    static void printChar(List<Character> chars) {
    	for (char character: chars) {
    		if (isVocal(character)) {
        		System.out.println(character + " �s VOCAL");
        	} else if (Character.isDigit(character)) {
        		System.out.println(character + " Els noms de persones no contenen n�meros!");
        	} else {
        		System.out.println(character + " �s una CONSONANT");
        	}
    	}
    }
    
    
    //Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�
    static void checkNumber(List<Character> chars) {
    	for (char character: chars) {
    		if (Character.isDigit(character)) {
    			System.out.println("Els noms de persones no contenen n�meros!");
    			break;
    		} 
    	}
    }
    
    static boolean isVocal(char character) {
    	char [] vocals = {'A','E','I','O','U'};

		for (char vocal: vocals) {
			if (character == vocal) {
				return true;
			}
		}
		return false;
    }  
    
}
