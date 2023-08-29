package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    // Getters and setters for tv

    public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    public void canalUp() {
        if (tv != null && tv.getEstado()) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null && tv.getEstado()) {
            tv.canalDown();
        }
    }

    public void volumenUp() {
        if (tv != null && tv.getEstado()) {
            tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (tv != null && tv.getEstado()) {
            tv.volumenDown();
        }
    }
}
