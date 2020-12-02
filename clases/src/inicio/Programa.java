package inicio;

import constructor.defecto.Ejemplo;

public class Programa {
	public static void main(String[] args) {
		Ejemplo obj1 = new Ejemplo();
        obj1.setVar1(33); 
        System.out.println(obj1.getVar1());
        // Se usa el nombre completo para evitar la ambigüedad porque las
        // clases se llaman igual
        constructor.Ejemplo obj2 = new constructor.Ejemplo(8);
        int aux = 0;
        aux = obj2.getVar1();
        System.out.println(aux);
        // Se usa el nombre completo para evitar la ambigüedad porque las
        // clases se llaman igual
        constructor.sobrecargado.Ejemplo obj3 = new constructor.sobrecargado.Ejemplo('a', 10);
        constructor.sobrecargado.Ejemplo obj4 = new constructor.sobrecargado.Ejemplo(30);
        aux = 0;
        aux = obj3.getAtrib1();
        System.out.println(aux);
        obj3.metodo();
        System.out.println(obj3.getAtrib2());	
        System.out.println(obj4.getAtrib1());	
        }
}
