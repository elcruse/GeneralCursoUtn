package inicio;

public class Programa {

	public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;
        boolean resultado;
        resultado = a == b;
        System.out.println("Si a=2 y b=2, a == b : " + resultado);
        resultado = a == c;
        System.out.println("Si a=2 y c=3, a == c : " + resultado);
        System.out.println("-----------------------------------------------");
        resultado = a != b;
        System.out.println("Si a=2 y b=2, a != b : " + resultado);
        resultado = a != c;
        System.out.println("Si a=2 y c=3, a != c : " + resultado);
        System.out.println("-----------------------------------------------");
        resultado = a < b;
        System.out.println("Si a=2 y b=2, a < b : " + resultado);
        resultado = a < c;
        System.out.println("Si a=2 y c=3, a < c : " + resultado);
        System.out.println("-----------------------------------------------");
        resultado = a <= b;
        System.out.println("Si a=2 y b=2, a <= b : " + resultado);
        resultado = a <= c;
        System.out.println("Si a=2 y c=3, a <= c : " + resultado);
        System.out.println("-----------------------------------------------");
        resultado = a > b;
        System.out.println("Si a=2 y b=2, a > b : " + resultado);
        resultado = a > c;
        System.out.println("Si a=2 y c=3, a > c : " + resultado);
        System.out.println("-----------------------------------------------");
        resultado = a >= b;
        System.out.println("Si a=2 y b=2, a >= b : " + resultado);
        resultado = a >= c;
        System.out.println("Si a=2 y c=3, a >= c : " + resultado);	}

}
