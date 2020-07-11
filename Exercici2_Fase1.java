public class Exercici2_Fase1 {
    public static void main(String[] args) throws Exception {
        
    	//Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
    	char[] javaCharArray = {'M', 'A', 'R', 'C', 'E', 'L'};
        System.out.println(javaCharArray);
        printChar(javaCharArray);
    }
    
    //Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
    static void printChar(char[] charList) {
    	for (char character: charList)
			System.out.println(character);
    	}
    
}

