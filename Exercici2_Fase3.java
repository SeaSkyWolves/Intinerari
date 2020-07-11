import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen

public class Exercici2_Fase3 {
    public static void main(String[] args) throws Exception {
        
    	Map<Character, Integer> map = new HashMap<>();
    	List<Character> word = Arrays.asList('M', 'A', 'R', 'C', 'E', 'L','L','O','B','O');
    	countCharacters(word, map);
    	System.out.println(map);
    }
    
    static void countCharacters(List<Character> word, Map<Character, Integer> map) {
    	for (Character key: word) {
    		if (map.containsKey(key)){
    			map.replace(key, map.get(key)+1);
    		} else {
    		map.put(key, 1);
    		}
    	}
    }
    
}