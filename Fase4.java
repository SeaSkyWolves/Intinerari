import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        String nom = "Iori";
        String cognom1 = "Yagami";
        String cognom2 = "Nuñez";
        
        int dia = 07;
        int mes = 07;
        int any = 2020;
        
       
        //FASE 4
        System.out.printf("%nFASE 4 %n");
        /*
        Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet, la data de naixement i si l’any de naixement es de traspàs o no.
        Exemple de sortida per consola:
        El meu nom és Juan Perez Gonzalez
        Vaig néixer el 01/01/1979
        El meu any de naixement és de traspàs.
        
        */
        
        String NomComplet = nom + " " + cognom1 + " " + cognom2;
        String data = dia+"/"+mes+"/"+any;
        
        String frase = "El meu nom és " + NomComplet + "%n" 
                        + "Vaig néixer el " +  data + "%n"
                        +"El meu any de naixement no és de traspàs ";
    
        System.out.printf(frase);

        
    }
    
}
