public class Exercici1_Fase4 {
    public static void main(String[] args) throws Exception {
        

        String nom = "Iori";
        String cognom1 = "Yagami";
        String cognom2 = "Nu�ez";
        
        int dia = 07;
        int mes = 07;
        int any = 2020;
        
       
        //FASE 4
        System.out.printf("%nFASE 4 %n");
        /*
        Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada per â€œ/â€� (tot en una variable). Mostreu per consola les variables del nom complet, la data de naixement i si lâ€™any de naixement es de traspÃ s o no.
        Exemple de sortida per consola:
        El meu nom Ã©s Juan Perez Gonzalez
        Vaig nÃ©ixer el 01/01/1979
        El meu any de naixement Ã©s de traspÃ s.
        
        */
        
        String NomComplet = nom + " " + cognom1 + " " + cognom2;
        String data = dia+"/"+mes+"/"+any;
        
        String frase = "El meu nom �s " + NomComplet + "%n" 
                        + "Vaig n�ixer el " +  data + "%n"
                        +"El meu any de naixement no �s de trasp�s ";
    
        System.out.printf(frase);

        
    }
    
}
