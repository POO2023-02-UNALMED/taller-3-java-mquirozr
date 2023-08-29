package taller3.televisores;

public class TV {
    private static int numTV;
    
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV++;
    }

    // Getters and setters for marca, canal, precio, volumen, control

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }
    

    public void setControl(Control control) {
        this.control = control;
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }
}

