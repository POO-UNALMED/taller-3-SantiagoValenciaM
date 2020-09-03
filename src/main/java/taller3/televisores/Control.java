package taller3.televisores;

public class Control {
	TV tv;
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public TV getTv() {
		return tv;
	}
	public void enlazar(TV tv) {
		setTv(tv);
		getTv().setControl(this);
	}
	public void turnOn() {
		getTv().turnOn();
	}
	public void turnOff() {
		getTv().TurnOff();
	}
	public void canalUp() {
		getTv().canalUp();
	}
	public void canalDown() {
		getTv().canalDown();
	}
	public void volumenUp() {
		getTv().volumenUp();
	}
	public void volumenDown() {
		getTv().volumenDown();
	}
	public void setCanal(int canal) {
		getTv().setCanal(canal);
	}
}
