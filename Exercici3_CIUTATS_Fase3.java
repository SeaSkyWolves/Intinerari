import java.util.Arrays;
import java.util.Scanner; 


//FASE 1 (2 punts)

public class Exercici3_CIUTATS_Fase3 {
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
         
        //FASE 2 (2 punts)

        //Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)

     	String[] arrayCiutats = {nom1, nom2, nom3, nom4, nom5, nom6};
         
     	
     	
     	
     	
     	//FASE 3 (3 punts)

     	
     	//Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
     	Arrays.sort(arrayCiutats);
     	System.out.println("Nom de les ciutats ordenades: " + Arrays.toString(arrayCiutats));
     	
     	//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)     	
     	//Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
     	
     	
     	String ArrayCiutatsModificades = Arrays.toString(replaceLetters(arrayCiutats,'a','4'));
     	System.out.printf("Ciutats modificades: %s", ArrayCiutatsModificades);
     	
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
    
    
    
    static String readNom() {
        Scanner in = new Scanner(System.in); 
        System.out.print("Escriu un nom: ");
        //System.out.println("You entered string "+nom1);
        return in.nextLine(); 
    }
}