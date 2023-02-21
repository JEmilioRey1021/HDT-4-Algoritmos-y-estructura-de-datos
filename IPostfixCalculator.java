/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
public interface IPostfixCalculator<T> {
	
	public int Calculate(java.util.ArrayList<T> postfix_expression, String tipoDePila) throws Exception;
	
}