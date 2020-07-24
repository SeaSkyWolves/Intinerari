



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 


//FASE 1 (2 punts)

public class Exercici4_Restaurant_Fase1 {
    public static void main(String[] args) throws Exception {
    	
    	//FASE 1 (2 punts)

    	//Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre variable per guardar el preu total del menjar. (1 punt)

    	final int CINC = 5;
    	final int DEU = 10;
    	final int VINT = 20;
    	final int CINQUANTA = 5;
    	final int CENT = 100;
    	final int CINCENTS = 500;
    	
    	int preuTotal = 0;
    	
    	
    	//Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada plat. (1 punt)
    	
    	String[] menu = {"Plato1", "Plato2", "Plato3","Plato4","Plato5"};
    	int[]  menuPrices = {25,30,15,10,25};
    	
    	//FASE 2 (3 punts)
    	
    	//Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. Afegirem el nom del plat i després el preu. (1 punt)
    	//??? Té sentit això?
    	
    	//Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la informació en una List fent servir un bucle while. (1 punt)
    	System.out.println("Menu del dia");
    	
    	
    	
    	List<Integer> platsSeleccionats = new ArrayList<Integer>(5);
    	
    	//Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant haureu de crear un altre variable int per guardar la informació. (1 punt)
    	int demanarMes = 1;
    	while(demanarMes == 1) {
	    	
    		printMenu(menu,menuPrices);
    		
    		
    		//Selecciona els plats que vol
	        Scanner in = new Scanner(System.in); 
	    	
	    	
	    	boolean error = true;
	    	while(error) {
	    		try {
	    			System.out.print("Quin plat t'agradaria menjar? (escriu el número del plat)");
	    			int selection = Integer.valueOf(in.nextLine().toString())-1;
	    			if ((selection <0) | (selection >= 5)) {
	    				error = true;
		    			System.out.println("El plat seleccionat no està a la llista");

	    			} else {
	    				platsSeleccionats.add(selection);
		    			error = false;
	    			}
	    			
	    		} catch (NumberFormatException e) {
	    			System.out.println("No has escrit un número");
	    		}
	    	}

	    	System.out.println("Has demanat: ");
	    	for(int i: platsSeleccionats) {
	    		System.out.println(menu[i]+" -> "+menuPrices[i]);
	    	}

	    	int input = 2;
	        while ((input!= 1) & (input !=0)) {
		    	System.out.println("Vols demanar més? (1:Si / 0:No): ");

	        	try {
	        		input = Integer.valueOf(in.nextLine().toString());
	        	} catch (NumberFormatException e) {
	        		System.out.println("No has escrit un número");
	        	}
	        }
	        if (input == 0) {
	        	demanarMes = input;
	        }
	    }

    	//FASE 3 (5 punts)

    	//Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al principi. En el cas que la informació que hem introduït a la List coincideixi amb la del array, haurem de
    	//sumar el preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui que el producte que hem demanat no existeix.
    	
		for (int i: platsSeleccionats) {
			preuTotal += menuPrices[i];
		}
    	System.out.println("Preu final a pagar: " + preuTotal);
    	
    	

    }
    static void printMenu(String[] menu, int [] menuPrices) {
    	//Ensenya els plats
    	System.out.println("Nº Plat    Preu");
		for (int i = 0; i < menu.length ; ++i) {
	    	System.out.printf("0%d: %s: %d %n",i+1 ,menu[i], menuPrices[i] );
		}
    }
}


