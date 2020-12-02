package inicio;

import ocultar.Persona;

public class Programa {

	public static void main(String[] args) {
        Persona p = new Persona();
        p.setPrimerNombre("Juan");
        p.setSegundoNombre("Pedro");
        p.setApellido("Liján");
        p.setDocumento("11111111");

        System.out.println("Nombre: " + p.getPrimerNombre() + " " + p.getSegundoNombre() + " " + p.getApellido());
        System.out.println("DN.N.I.: " + p.getDocumento());

        encapsulado.Persona p2 = new encapsulado.Persona();
        p2.setPrimerNombre("Inés");
        p2.setSegundoNombre("Verónica");
        p2.setApellido("Tillad");
        p2.setDocumento("22222222");

        System.out.println(p2.getDetalles());
	}

}
