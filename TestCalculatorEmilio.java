import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculatorEmilio {
    @Test
    public void seEspera27ConArreglo() {
        //arrange
        final Integer esperoUnValorde27 = 27; 
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String tipoDePila = "Arreglo"; 
        cadenaOperar.add("(1+2)*9");
        ArrayList<String> expresionPostFix = ConvertidorExpresiones.convertiraPostFix(cadenaOperar, tipoDePila); 
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(expresionPostFix, tipoDePila);  
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde27,resultado);
    }

    @Test
    public void seEspera27ConListaSimple() {
        //arrange
        final Integer esperoUnValorde27 = 27; 
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String tipoDePila = "Lista Simple"; 
        cadenaOperar.add("(1+2)*9");
        ArrayList<String> expresionPostFix = ConvertidorExpresiones.convertiraPostFix(cadenaOperar, tipoDePila); 
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(expresionPostFix, tipoDePila);  
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde27,resultado);
    }

    @Test
    public void seEspera27ConListaDoble() {
        //arrange
        final Integer esperoUnValorde27 = 27; 
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String tipoDePila = "Lista doble"; 
        cadenaOperar.add("(1+2)*9");
        ArrayList<String> expresionPostFix = ConvertidorExpresiones.convertiraPostFix(cadenaOperar, tipoDePila); 
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(expresionPostFix, tipoDePila);  
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde27,resultado);
    }

    @Test
    public void seEspera27ConVector() {
        //arrange
        final Integer esperoUnValorde27 = 27; 
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String tipoDePila = "Vector"; 
        cadenaOperar.add("(1+2)*9");
        ArrayList<String> expresionPostFix = ConvertidorExpresiones.convertiraPostFix(cadenaOperar, tipoDePila); 
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(expresionPostFix, tipoDePila);  
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde27,resultado);
    }

    @Test
    public void pruebaDeInstancia(){
        //arange
        IPostfixCalculator<String> myCalculator = CalculatorEmilio.getInstance(); 
        IPostfixCalculator<String> myCalculator2 = CalculatorEmilio.getInstance(); 

        
    }
    
}


