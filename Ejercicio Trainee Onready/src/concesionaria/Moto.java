package concesionaria;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String getText() {
        String s = super.getText();
        s += "Cilindrada: " + cilindrada + "cc // Precio: $" + getPriceForm(getPrecio());
        return s;
    }
}
