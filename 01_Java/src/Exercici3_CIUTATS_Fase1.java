import java.util.Scanner; 


//FASE 1 (2 punts)

public class Exercici3_CIUTATS_Fase1 {
    public static void main(String[] args) throws Exception {
    	
    	
    	//Crea sis variables tipu string buides. (0,5 punts)

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

        //Mostra per consola el nom de les 6 ciutats.
         System.out.printf("Els noms de les ciutats són: %s, %s, %s, %s, %s, %s", nom1, nom2, nom3, nom4, nom5, nom6);

    }
    
    

    
    static String readNom() {
        Scanner in = new Scanner(System.in); 
        System.out.print("Escriu un nom: ");
        return in.nextLine(); 
    }
}
