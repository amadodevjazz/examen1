
public class Calcular {
	
	private double pi = 3.141516;
	
	/**
	 * @author Amado
	 */
	
	/**
	 * 
	 * This method calculates the factorial of different numbers, which are going to be used in the next method
	 * 
	 */
	
	public double factorial(int number) {
		
		if(number == 0) {
			return 1;
		}
		
		else {
			return number * factorial(number - 1);
		}
	}
	
	
	/*
	 * Calculates PI with the specified quantity of decimals
	 */
	public double calcularPi(int cantidadDigitos) {
		
		double ecuacion = ( Math.pow(-1,cantidadDigitos)* factorial(6 * cantidadDigitos)*(13591409+(545140134*cantidadDigitos)))/(factorial(3*cantidadDigitos)*Math.pow(factorial(cantidadDigitos),3)*Math.pow(640320,((3*cantidadDigitos)+3/2)));
		if(cantidadDigitos == 0) {
			return pi;
		}
		
		else {
			ecuacion  +=  calcularPi(cantidadDigitos - 1);
			ecuacion *= 12;
			ecuacion = 1/ ecuacion;
			return ecuacion;
			
		}
	}

}
