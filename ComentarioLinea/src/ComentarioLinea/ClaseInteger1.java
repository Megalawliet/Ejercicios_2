package ComentarioLinea;

//import sun.jvm.hotspot.memory.SystemDictionary;

public class ClaseInteger1 {

	public static void main(String[] args) {
		//Creación de un objeto Integer usando el segundo constructor
	    Integer num1 = Integer.valueOf("125");
	    //Creación de un objeto Integer usando el primer constructor
	    Integer num2 = Integer.valueOf("20");
	    //Obtención del entero que alamcena cada objeto Integer.
	    //Si no se hace esto, las lineas siguientes causarían error
	    //de compilación
	    int n1=num1.intValue();
	    int n2=num2.intValue();
	    System.out.println("La suma de "+n1+" y "+n2+" vale "+(n1+n2));
	    if (n1+n2>130){
	    	n1++;
			
		} else {
			n1--;
			System.out.println(n1);

		}
	}

}