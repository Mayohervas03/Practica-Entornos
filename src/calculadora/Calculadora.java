package calculadora;
 
import java.util.Scanner;
 
public class Calculadora {
	static int a;
	static int b;
	static double c;
	static double d;
 
	
	public static void main(String[] args) {
		
		
		int menu;
		
		System.out.println("Bienvenido al menu, elige un numero:");  
        System.out.println("============================================================ ");    
        System.out.println("1. Suma ");    
        System.out.println("2. Resta ");  
        System.out.println("3. Multiplicacion ");  
        System.out.println("4. Division");  
        System.out.println("5. Potencia");
        System.out.println("6. Raiz");
        System.out.println("7. Logritmo Natural");
        System.out.println("============================================================ ");
        
        Scanner scanner = new Scanner (System.in);
 
		menu = scanner.nextInt();
        
        switch (menu) {
		case 1: {
			System.out.println("Dime el primer numero");  
			a = scanner.nextInt();
	        System.out.println("Dime el segundo numero");  
	    	b = scanner.nextInt();
	
			 System.out.println(a  + " + " + b +  " = " + suma(a,b));
			break;
		}
		case 2: {
			System.out.println("Dime el primer numero");  
			a = scanner.nextInt();
	        System.out.println("Dime el segundo numero");  
	    	b = scanner.nextInt();
	    	
			
			System.out.println(a  + " - " + b +  " = " + resta(a,b));
			break;
		}
		case 3: {
			System.out.println("Dime el numero a multiplicar");  
			a = scanner.nextInt();
	        System.out.println("Dime el numero con el que multiplicamos");  
	    	b = scanner.nextInt();
	    	
			
			System.out.println(a  + " * " + b +  " = " + multiplica(a,b));
			break;
		}
		case 4: {
			System.out.println("Dime el dividendo");  
			a = scanner.nextInt();
	        System.out.println("Dime el divisor");  
	    	b = scanner.nextInt();
	    	
	    	System.out.println(a  + " / " + b +  " = " + divide(a,b));
			
			break;
		}
		case 5: {
			System.out.println("Dime la base");  
			c = scanner.nextInt();
	        System.out.println("Dime el explonente");  
	    	d = scanner.nextInt();
	    	
	    	System.out.println(c  + " ^ " + d +  " = " + potencia(c,d));
			
			break;
		}
		case 6: {
			System.out.println("Dime un numero");  
			c = scanner.nextInt();
			
			System.out.println(c  + " ^ 2" +  " = " + raizCuadrada(c));
			break;
		}
		case 7: {
			System.out.println("Dime un numero");  
			c = scanner.nextInt();
			
			System.out.println(c  + " log " +  " = " + logaritmoNatural(c));
			break;
		}
		default:
			throw new IllegalArgumentException("No es un numero del menu");
		}
	}
	
	
		    public static int suma(int a, int b) {
		        return a + b;
		    }
		
		    public static int resta(int a, int b) {
		        return a - b;
		    }
		
		    public static int multiplica(int a, int b) {
		        return a * b;
		    }
		
		    public static int divide(int a, int b) {
		        if (b == 0) {
		            throw new IllegalArgumentException("No se puede dividir por cero");
		        }
		        return a / b;
		    }
		
		    public static double potencia(double base, double exponente) {
		        return Math.pow(base, exponente);
		    }
		
		    public static  double raizCuadrada(double numero) {
		        if (numero < 0) {
		        	throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
		        }
		        return Math.sqrt(numero);
		    }
		    
		    public static double logaritmoNatural(double numero) {
				if (numero <= 0) {
					throw new IllegalArgumentException("El logaritmo natural solo está definido para números positivos");
				}
			return Math.log(numero);
		}
	}