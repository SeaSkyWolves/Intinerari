import java.util.Arrays;
import java.util.Scanner; 


//FASE 1 (2 punts)

public class Exercici3_CIUTATS_Fase4 {
    public static void main(String[] args) throws Exception {
    	
    	

        String nom1, nom2, nom3, nom4, nom5, nom6;
        nom1 = nom2 = nom3 = nom4 = nom5 = nom6 = "";
        
        //Demana per consola que s’introdueixin els noms. (0,5 punts)1


        //Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. (0,5 punts)

        nom1 = readNom();
        nom2 = readNom();
        nom3 = readNom();
        nom4 = readNom();
        nom5 = readNom();
        nom6 = readNom();
         
        //Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)

     	String[] arrayCiutats = {nom1, nom2, nom3, nom4, nom5, nom6};
         
     	
     	//FASE 3 (3 punts)

     	
     	//Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
     	Arrays.sort(arrayCiutats);
     	System.out.println("Nom de les ciutats ordenades: " + Arrays.toString(arrayCiutats));
     	
     	//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)     	
     	//Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
     	
     	
     	String ArrayCiutatsModificades = Arrays.toString(replaceLetters(arrayCiutats,'a','4'));
     	System.out.printf("Ciutats modificades: %s %n", ArrayCiutatsModificades);
     	
     	
     	
     	//FASE 4 (3 punts)

//     	● Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)

  //   	● Ompliu els nous arrays lletra per lletra.(2 punts)

    // 	● Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
     	
     	
     	
     	for(String ciutat: arrayCiutats) {
     		System.out.println(Arrays.toString(toInverseArray(ciutat)));
     	}
    }

    
    
    static String [] replaceLetters(String [] arrayCiutats, char oldChar, char newChar) {
    	String[] ArrayCiutatsModificades = new String[arrayCiutats.length];
    	
    	for (int i = 0; i < arrayCiutats.length; ++i) {
    		ArrayCiutatsModificades[i] = arrayCiutats[i].toLowerCase().replace(oldChar, newChar);
    	}
    	
    	//Les reordenem tenint en compte que ara hem posat números.
    	Arrays.sort(ArrayCiutatsModificades);
    	return ArrayCiutatsModificades;
    }
    
    
    //Ompliu els nous arrays lletra per lletra.(2 punts)
    //Inverteix els arrays

    static char[] toInverseArray(String word) {
    	char[] array = new char[word.length()];
    	
    	for (int i = 0; i < word.length(); ++i) {
    		array[word.length()-1-i] = word.charAt(i);
    	}
		return array;
    }
    
    
    static String readNom() {
        Scanner in = new Scanner(System.in); 
        System.out.print("Escriu un nom: ");
        //System.out.println("You entered string "+nom1);
        return in.nextLine(); 
    }
}