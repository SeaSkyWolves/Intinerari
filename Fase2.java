public class Fase2 {
    public static void main(String[] args) throws Exception {


        //FASE 2
        System.out.printf("%nFASE 2 %n");

        //Creeu una constant amb el valor de l’any (1948).
        final int primerAnyTransicio = 1948;
        
        //Creeu una variable que guardi cada quan hi ha un any de traspàs.
        final int interval = 4;

        //Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
        final int anyNeixement = 1990;
        
        int numeroTransicions = (anyNeixement - primerAnyTransicio)/interval;
        
        //Mostreu per pantalla el resultat del càlcul.
        System.out.printf("Resposta: Des de l'any, %d fins l'any %d han passat %d anys de transici� sense comptar el de l'any 1948. %n", primerAnyTransicio, anyNeixement, numeroTransicions);


       
        
    }
    
}
