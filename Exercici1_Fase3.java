public class Exercici1_Fase3 {
    public static void main(String[] args) throws Exception {

        final int primerAnyTransicio = 1948;
        final int interval = 4;
        final int anyNeixement = 1990;
        int numeroTransicions = (anyNeixement - primerAnyTransicio)/4;
        
        //FASE 3
        System.out.printf("%nFASE 3 %n");

        //Forma 1.
        //Partint de lâ€™any 1948 heu de fer un bucle for i mostrar els anys de traspÃ s fins arriba al vostre any de naixement.
        System.out.println("Métode 1 - Els anys de transcició després del 1948 són: ");
        
        for (int i = 0; i < numeroTransicions; ++i){
            System.out.println(primerAnyTransicio + (i+1)*interval);
        }
        
        
        System.out.println("Métode 2 - Els anys de transcició són: ");
        
        
        for (int anysTransicions = primerAnyTransicio; anysTransicions < anyNeixement; anysTransicions += 4){
            System.out.println(anysTransicions);
        }
        
        //Creeu una variable bool que sera certa si lâ€™any de naixement Ã©s de traspÃ s o falsa si no ho Ã©s.
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
        
        
    }
    
}
