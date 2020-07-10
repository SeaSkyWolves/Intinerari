public class Main {
    public static void main(String[] args) throws Exception {
        
        // FASE 1
        System.out.printf("FASE 1 %n");

        
        
        //Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
        String nom = "Iori";
        String cognom1 = "Yagami";
        String cognom2 = "Nuñez";
        
        //Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
        int dia = 07;
        int mes = 07;
        int any = 2020;
        
        //Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom)
        System.out.printf("Resposta: %s %s %s %n" , nom, cognom1, cognom2);
        
        //Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
    
        System.out.printf("Resposta: %d/%d/%d %n", dia, mes, any);


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
        System.out.printf("Resposta: Des de l'any, %d fins l'any %d han passat %d anys de transició sense comptar el de l'any 1948. %n", primerAnyTransicio, anyNeixement, numeroTransicions);


        //FASE 3
        System.out.printf("%nFASE 3 %n");

        //Forma 1.
        //Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement.
        System.out.println("Mètode 1 - Els anys de transcició després del 1948 són: ");
        
        for (int i = 0; i < numeroTransicions; ++i){
            System.out.println(primerAnyTransicio + (i+1)*4);
        }
        
        
        System.out.println("Mètode 2 - Els anys de transcició són: ");
        
        
        for (int anysTransicions = primerAnyTransicio; anysTransicions < anyNeixement; anysTransicions += 4){
            System.out.println(anysTransicions);
        }
        
        //Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
        boolean transicio = false;
        //Creeu dues variables string per guardar les frases
        String fraseCerta = "És un any de transició. ";
        String fraseFalsa = "No és un any de transició. ";
        
        //Complin amb l'enunciat
        System.out.println("Mètode 3 - Fent cas a l'enunciat: ");
        for (int anys = primerAnyTransicio; anys <= anyNeixement; ++anys){
            System.out.print("Any: " + anys + ". ");

            for (int anysTransicio = primerAnyTransicio; anysTransicio <= anyNeixement; anysTransicio += 4){
                if (anys == anysTransicio){
                    transicio = true;
                    break;
                } else {
                    transicio = false;
                }
            }
                            if (transicio){
                    System.out.println(fraseCerta);
                }
                else{
                    System.out.println(fraseFalsa);
                }
        }
        
        
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
