import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercici2_Fase4 {
    public static void main(String[] args) throws Exception {
        
    	List<Character> nom = Arrays.asList('N', 'O', 'M');
    	List<Character> cognom = Arrays.asList('C','O','G','N', 'O', 'M');

    	List<Character> fullName = fullName(nom, cognom);
    	System.out.println(fullName);
    }
    
    static List<Character> fullName(List<Character> nom, List<Character> cognom) {
    	List<Character> fullName = new ArrayList<Character>(0);
    	fullName.addAll(nom);
    	fullName.add(' ');
    	fullName.addAll(cognom);
    	return fullName;
    }
    
}
