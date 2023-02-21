/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
public class PilaFactory<T> {
    /**
     * @param tipoDePila
     * @return se crea un arraylist, una lista simple o doble o un vector segun lo que ingrese el usuario. 
     */
    public IStack<T> create(String tipoDePila) {

        if(tipoDePila == null){
            return null; 
        }

        if(tipoDePila.equalsIgnoreCase("Arreglo")){
           return new ArrayListPila<T>(); 
        }

        if(tipoDePila.equalsIgnoreCase("Lista simple")){
            return new ListaEncadenadaPila<T>(); 
        }


        if(tipoDePila.equalsIgnoreCase("Lista doble")){
            return new ListaDoblePila<T>(); 
        }
        
        if(tipoDePila.equalsIgnoreCase("Vector")){
            return new VectorPila<T>(); 
        }

        
        

        return null; 
    }
}
