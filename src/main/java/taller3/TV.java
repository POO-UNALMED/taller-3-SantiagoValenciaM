package taller3.televisores;

public class TV {
	Control control;
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado= estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public void setVolumen(int volumen) {
		if(estado==true) {
			if(volumen > 0 && volumen <7) {
				this.volumen=volumen;
			}
		}	
	}
	
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal>0 && canal<120) {
				this.canal=canal;
			}
		}
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static void  setNumTV(int numTV) {
		 TV.numTV=numTV;
		 
	}
	public  int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado=true;
	}
	public void TurnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;  
	}
	public void canalUp() {
		if(estado==true) {
			if(canal>1 && canal < 120) {
				canal=canal+1;
			}
		}	
	}
	public void canalDown() {
		if(estado==true) {
			if(canal>1 && canal < 120) {
				canal=canal-1;
			}
		}
	}
	public void volumenUp() {
		if(estado==true) {
			if(volumen>0 && volumen <7) {
				volumen=volumen+1;
			}
		}
	}
	public void volumenDown() {
		if(estado==true) {
			if(volumen>0 && volumen<7) {
				volumen=volumen-1;
			}
		}
	}
}
