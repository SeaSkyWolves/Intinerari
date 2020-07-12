import java.util.Arrays;
import java.util.Scanner; 

public class Exercici3_CIUTATS_Fase2 {
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
         
     	//Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
     	Arrays.sort(arrayCiutats);
     	System.out.println("Nom de les ciutats ordenades: " + Arrays.toString(arrayCiutats));
    }


    
    static String readNom() {
        Scanner in = new Scanner(System.in); 
        System.out.print("Escriu un nom: ");
        //System.out.println("You entered string "+nom1);
        return in.nextLine(); 
    }
}