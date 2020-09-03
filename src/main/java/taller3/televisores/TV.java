package taller3.televisores;

public class TV {
	private static int numTV;
	Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	
	public TV () {	
		numTV ++;
	}
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}	
	public void setControl (Control control) {
		this.control = control;
	}
	public Control getControl () {
		return control;
	}	
	public static int getNumTV () {
		return numTV;
	}	
	public static void setNumTV (int numTV) {
		TV.numTV = numTV;
	}	
	public boolean getEstado () {
		return this.estado;
	}	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}	
	public Marca getMarca () {
		return this.marca;
	}	
	public void setCanal (int canal) {
		if (estado && (canal > 0) && (canal <= 120)) {
			this.canal = canal;
		}
	}	
	public int getCanal () {
		return this.canal;
	}	
	public void setPrecio (int precio) {
		this.precio = precio;
	}	
	public int getPrecio () {
		return this.precio;
	}	
	public void setVolumen (int volumen) {
		if (estado && (volumen >= 0) && (volumen < 8)) {
			this.volumen = volumen;
		}	
	}	
	public int getVolumen () {
		return this.volumen;
	}	
	public void turnOff () {
		if (estado) {
			this.estado = false;
		}
	}	
	public void turnOn () {
		if (!estado) {
			this.estado = true;
		}
	}	
	public void volumenUp () {
		if (estado && (volumen < 7)) {
			this.volumen ++;
		}
	}	
	public void volumenDown () {
		if (estado && (volumen >= 0)) {
			this.volumen --;
		}
	}	
	public void canalUp () {
		if (estado && (canal < 120)) {
			this.canal ++;
		}	
	}	
	public void canalDown () {
		if (estado && (canal > 0)) {
			this.canal --;
		}	
	}
}
