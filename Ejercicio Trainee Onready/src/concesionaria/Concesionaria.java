package concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Concesionaria {

    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public void cargarLista() {
        listaVehiculos.add(new Auto("Peugeot", "206", 4,200000.00));
        listaVehiculos.add(new Moto("Honda", "Titan", 125, 60000.00));
        listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        listaVehiculos.add(new Moto("Yamaha", "YBR",160, 80500.50));

    }

    public void imprimirLista() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(listaVehiculos.get(i).getText());
        }
    }

    public void masCaro() {
        Vehiculo vehiculoCaro = listaVehiculos.get(0);
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPrecio() > vehiculoCaro.getPrecio()) {
                vehiculoCaro = listaVehiculos.get(i);
            }
        }
        System.out.println("Vehículo más caro: "+ vehiculoCaro.getMarca() + " "
                + vehiculoCaro.getModelo());
    }

    public void masBarato() {
        Vehiculo vehiculoBarato = listaVehiculos.get(0);
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPrecio() < vehiculoBarato.getPrecio()) {
                vehiculoBarato = listaVehiculos.get(i);
            }
        }
        System.out.println("Vehículo más barato: " + vehiculoBarato.getMarca() + " "
                + vehiculoBarato.getModelo());
    }

    public void letraY() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            char[] letraBuscada = listaVehiculos.get(i).getModelo().toCharArray();
            for (int j = 0; j < letraBuscada.length; j++) {
                if (letraBuscada[j] == 'Y') {
                    System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " +
                            listaVehiculos.get(i).getMarca() + " "  +
                            listaVehiculos.get(i).getModelo() + " $" +
                            listaVehiculos.get(i).getPriceForm(listaVehiculos.get(i).getPrecio()));
                }
            }
        }
    }

    public void ordenados() {
        // comparamos los precios
        Collections.sort(listaVehiculos, new Comparator<Vehiculo>() {
            public int compare(Vehiculo v2, Vehiculo v1) {
                return new Double(v1.getPrecio()).compareTo(new Double(v2.getPrecio()));
            }
        });
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(listaVehiculos.get(i).getMarca() + " " +
                    listaVehiculos.get(i).getModelo());
        }
    }
}
