package constructor;

public class Ejemplo {
	public Ejemplo(int v) {
		var1 = v;
	}

	private int var1;
	private int var2;

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int getVar1() {
		return var1;
	}
}
