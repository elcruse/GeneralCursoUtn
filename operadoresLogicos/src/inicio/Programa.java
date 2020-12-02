package inicio;

public class Programa {

@SuppressWarnings("unused")
	public static void main(String[] args) {

        boolean resultado;
        System.out.println("-----------------------------------------------");
        System.out.println("Tabla de verdad del AND (Y)");
        System.out.println("-----------------------------------------------");
        resultado = true && true;
        System.out.println("Verdadero Y Verdadero = " + resultado);
        resultado = true && false;
        System.out.println("Verdadero Y Falso = " + resultado);
        resultado = false && true;
        System.out.println("Falso Y Verdadero = " + resultado);
        resultado = false && false;
        System.out.println("Falso Y Falso = " + resultado);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println("Tabla de verdad del OR (O incluyente)");
        System.out.println("-----------------------------------------------");
        resultado = true || true;
        System.out.println("Verdadero O Verdadero = " + resultado);
        resultado = true || false;
        System.out.println("Verdadero O Falso = " + resultado);
        resultado = false || true;
        System.out.println("Falso O Verdadero = " + resultado);
        resultado = false || false;
        System.out.println("Falso O Falso = " + resultado);
        System.out.println("-----------------------------------------------");
	}

}
