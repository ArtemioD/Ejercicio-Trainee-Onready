package concesionaria;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto() {
    }

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String getText() {
        String s = super.getText();
        s += "Puertas: " + puertas + " // Precio: $" + getPriceForm(getPrecio());
        return s;
    }

}
