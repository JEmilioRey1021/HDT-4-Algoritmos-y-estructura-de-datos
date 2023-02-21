/**
 * @author Jose Emilio Reyes Paniagua 22674
 */

import java.util.ArrayList;
public class CalculatorEmilio implements IPostfixCalculator{


    /**
     * Creo la calculadora
     * 
     */
    private CalculatorEmilio(){


    }

 

    /**
     * Este metodo sirve para obtener una unica instancia de la calculadora
     * @return instancia unica de la calculadora usando el patron singleton
     */
    public static CalculatorEmilio getInstance(){
        if(instance == null){
            instance = new CalculatorEmilio(); 
        }
        return instance; 
    }
    private static CalculatorEmilio instance; 
    private IStack<Integer> pila; 
    /* Calculate toma el valor de la postfix expression y el tipo de pila que solicito el usuario.Y hace el reconocimiento de las expresiones, para saber como calcularlas. 
     * @see IPostfixCalculator#Calculate(java.util.ArrayList, java.lang.String)
     */
    @Override
    public int Calculate(ArrayList postfix_expression, String tipoDePila) throws Exception {
        Integer resultadoFinal = 0; 
        for (int i = 0; i<postfix_expression.size(); i++){
            
            String cadena = postfix_expression.get(i).toString(); 
            char[] expresion = cadena.toCharArray();
            if(expresion.length < 5){
                throw new Exception("Valores insuficientes para realizar la operacion."); 
            }

            pila = new PilaFactory<Integer>().create(tipoDePila); 
            for (int j = 0; j<expresion.length; j++){

                if(expresion[j] == '+'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    Integer resultadoDeSuma = operandoA+operandoB; 
                    System.out.println("El resultado de la suma es " + resultadoDeSuma);
                    pila.push(resultadoDeSuma);
                }
                else if(expresion[j] == '-'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    Integer resultadoDeResta = operandoA-operandoB; 
                    System.out.println("El resultado de la resta es " + resultadoDeResta);
                    pila.push(resultadoDeResta);
                }
                else if(expresion[j] == '*'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    pila.push(operandoA*operandoB);
                    Integer resultadoDeMultiplicacion = operandoA*operandoB; 
                    System.out.println("El resultado de la multiplicacion es " + resultadoDeMultiplicacion);
                    pila.push(resultadoDeMultiplicacion);
                }
                else if(expresion[j] == '/'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    if(operandoB == 0){
                        throw new Exception("No se puede ejecutar la division entre 0."); 
                    }
                    Integer resultadoDivisionEntero = Math.floorDiv(operandoA, operandoB); 
                    System.out.println("El resultado entero de la division es " + resultadoDivisionEntero);
                    pila.push(resultadoDivisionEntero);
                    
                }
                else if(expresion[j] == '^'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    if(operandoB == 0){
                        throw new Exception("No se puede ejecutar la division entre 0."); 
                    }
                    Integer resultadoPotenciaEntero = (operandoA^operandoB); 
                    System.out.println("El resultado entero de la potencia es " + resultadoPotenciaEntero);
                    pila.push(resultadoPotenciaEntero);
                    
                }
                else if(expresion[j] != ' '){

                    String cadena2 = Character.toString(expresion[j]); 
                    Integer operando = Integer.parseInt(cadena2); 
                    pila.push(operando);
                }
            }
            resultadoFinal = pila.pop(); 
            System.out.println("El resultado de la operacion completa es  " + resultadoFinal);


        }
    return resultadoFinal; 
}
}
