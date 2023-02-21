/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

 public class main {
    /**
     * @param Se muestra el menu, y el directorio de donde esta guardado el archivo .txt Se solicita que ingrese con que quiere trabajar.
     */
    public static void main(String[] args) {
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 

	  System.out.println("Ingrese la ruta del archivo ej C:\\codigo\\SEMESTRE 3\\Hoja de Trabajo 4 Emilio Reyes\\datos.txt Presione enter.");
	  Scanner in = new Scanner(System.in);
	  String rutaArchivo= in.nextLine();
	  if(rutaArchivo == ""){
        rutaArchivo = "C:\\codigo\\SEMESTRE 3\\Hoja de Trabajo 4 Emilio Reyes\\datos.txt"; 
    }
    System.out.println("Escoga el tipo de pila de la que quiere evaluar la expresion infix.");
    String menu = "\n1. Arreglo. \n2. Lista Simple. \n3. Lista Doble. \n4. Vector. \n5. Salir \nIndica lo que quieres realizar aquí: ";
    int opcion = 1;
    String tipoDePila = ""; 
           
    while(opcion >= 1 && opcion < 5){
        System.out.print(menu);
        try{
            in = new Scanner(System.in);
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                tipoDePila = "Arreglo"; 
                break; 
                case 2: 
                tipoDePila = "Lista Simple"; 
                break; 
                case 3: 
                tipoDePila = "Lista doble"; 
                break; 
                case 4: 
                tipoDePila = "Vector"; 
                break;
                case 5: 
                break; 
            }
            if(tipoDePila != ""){
                ArrayList<String> listaDeCadenas = ManejoArchivo.leer(rutaArchivo); 
                ArrayList<String> expresionPostFix = ConvertidorExpresiones.convertiraPostFix(listaDeCadenas, tipoDePila); 
            
                try{
                    int resultado = myCalculator.Calculate(expresionPostFix, tipoDePila);  
                    System.out.println(resultado);
                  }
                  catch(Exception e){
                    System.out.println(e.getMessage());
                  }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
  }
}   
    

