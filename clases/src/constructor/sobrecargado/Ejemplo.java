package constructor.sobrecargado;

public class Ejemplo{
	private int atrib1;
	private char atrib2;

	public Ejemplo(int a){ atrib1 = a;}
	public Ejemplo(char b){ atrib2 = b;}
	public Ejemplo (char atrib2,int atrib1){
		this.atrib1 = atrib1;
		this.atrib2 = atrib2; 
	}
	
	public void metodo(){
		//[sentencias;]
		atrib2 = 'a';
	}
	
	public int getAtrib1() {
		return atrib1;
	}
	
	public char getAtrib2() {
		return atrib2;
	}
}

