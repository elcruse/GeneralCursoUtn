package inicio;

public class Programa {

	public static void main(String[] args) {
        int a = 4, b = 5, c = 8, d = 0;
        d = a + b;
        System.out.println("Con a = 4 y b = 5. Valor de d = a + b: " + d);
        System.out.println("----------------------------------------------");
        d = a - b;
        System.out.println("Con a = 4 y b = 5. Valor de d = a - b: " + d);
        System.out.println("----------------------------------------------");
        d = 0;
        d = a * b;
        System.out.println("Con a = 4 y b = 5. Valor de d = a * b: " + d);
        System.out.println("----------------------------------------------");
        d = 0;
        d = c / a;
        System.out.println("Con a = 4 y c = 8. Valor de d = c / a: " + d);
        System.out.println("----------------------------------------------");
        d = 0;
        d = b % a;
        System.out.println("Con a = 4 y b = 5. Valor de d = b % a: " + d);
        System.out.println("----------------------------------------------");
        d = 0;
        d = a % b;
        System.out.println("Con a = 4 y b = 5. Valor de d = a % b: " + d);
	}
}
