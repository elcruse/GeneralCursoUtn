package inicio;

public class Programa {

	public static void main(String[] args) {
		String string1 = "Esta es una cadena creada por asignación.";
		String string2 = new String("Esta es otra cadena creada por asignación.");
		String string3;

		System.out.println(string1);
		System.out.println(string2);
		string3 = string1 + string2;

		System.out.println("El resultado de concatenar con + es :" + string3);
	}
}
