/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors



public class ManejoArchivo{
    public static ArrayList<String> leer(String rutaArchivo) {
        ArrayList<String> listaDeCadenas = new ArrayList<String>();
        
        try {
            File myObj = new File(rutaArchivo);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              listaDeCadenas.add(data); 
              System.out.println(data);
            }
            myReader.close();
            return listaDeCadenas; 
      
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return listaDeCadenas; 
        }
    }
}
