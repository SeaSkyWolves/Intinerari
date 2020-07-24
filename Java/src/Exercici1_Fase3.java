public class Exercici1_Fase3 {
    public static void main(String[] args) throws Exception {

        final int primerAnyTransicio = 1948;
        final int interval = 4;
        final int anyNeixement = 1990;
        int numeroTransicions = (anyNeixement - primerAnyTransicio)/4;
        
        //FASE 3
        System.out.printf("%nFASE 3 %n");

        //Forma 1.
        //Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement.
        System.out.println("M�tode 1 - Els anys de transcici� despr�s del 1948 s�n: ");
        
        for (int i = 0; i < numeroTransicions; ++i){
            System.out.println(primerAnyTransicio + (i+1)*interval);
        }
        
        
        System.out.println("M�tode 2 - Els anys de transcici� s�n: ");
        
        
        for (int anysTransicions = primerAnyTransicio; anysTransicions < anyNeixement; anysTransicions += 4){
            System.out.println(anysTransicions);
        }
        
        //Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
        boolean transicio = false;
        //Creeu dues variables string per guardar les frases
        String fraseCerta = "�s un any de transici�. ";
        String fraseFalsa = "No �s un any de transici�. ";
        
        //Complin amb l'enunciat
        System.out.println("M�tode 3 - Fent cas a l'enunciat: ");
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
