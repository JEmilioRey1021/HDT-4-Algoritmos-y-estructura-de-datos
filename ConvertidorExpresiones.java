/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.ArrayList;

public class ConvertidorExpresiones {
    /**
     * @param listaDeCadenas
     * @param tipoDePila
     * @return regresa la expresion convertida a postfix. Ademas, hacce los push para los simbolos de la expresion. Los guarda para saber como operar los numeros
     */
    public static ArrayList<String> convertiraPostFix(ArrayList<String> listaDeCadenas, String tipoDePila){
        ArrayList<String> cadenaPostFix = new ArrayList<String>(); 
        IStack<String> pila = new PilaFactory<String>().create(tipoDePila); 
        for (int i = 0; i<listaDeCadenas.size(); i++){
            String cadena = listaDeCadenas.get(i).toString();
            String postFix = ""; 

            char[] expresion = cadena.toCharArray();

            
            for (int j = 0; j<expresion.length; j++){
                char caracter = expresion[j]; 
                if(Character.isLetterOrDigit(caracter)){
                    String cadena2 = String.valueOf(caracter);
                    postFix += cadena2; 
                }
                else if(caracter == '('){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == '^'){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == '+'){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == '-'){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == '/'){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == '*'){
                    String cadena2 = String.valueOf(caracter);
                    pila.push(cadena2);
                }
                else if(caracter == ')'){
                    while(pila.isEmpty() == false && pila.peek().equals("(")==false){
                        String elemento = pila.pop();
                        postFix += elemento; 
                    }
                    pila.pop(); 
                }
                else{
                    Integer valorCaracter = valorPrecedencia(caracter); 
                    char top = pila.peek().charAt(0); 
                    Integer valorTop = valorPrecedencia(top); 
                    while(pila.isEmpty() == false && valorCaracter <= valorTop){
                        String elemento = pila.pop();
                        if(elemento != "("){
                            postFix += elemento; 
                        }
                    }
                }
            }
            while(pila.isEmpty() == false){
                String elemento = pila.pop();
                postFix += elemento; 
            }
            cadenaPostFix.add(i, postFix);
        }
        return cadenaPostFix; 

    }

    /**
     * @param caracter
     * @return esto es para que sepa la jerarquia de las operaciones.
     */
    public static Integer valorPrecedencia(char caracter){ 
        Integer valor = 0; 
        if(caracter == '(' || caracter == ')'){
            valor = 4; 
        }
        else if(caracter == '^'){
            valor = 3; 
        }
        else if(caracter == '*' || caracter == '/'){
            valor = 2;
        }
        else if (caracter == '+' || caracter == '-'){
            valor = 1; 
        }
        return valor; 
    }
}
