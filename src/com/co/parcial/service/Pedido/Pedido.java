package com.co.parcial.service.Pedido;

import com.co.parcial.service.Plato.Plato;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pedido implements Carta {
    private int numeroMesa;
    private List<Plato> platos;

    public Pedido(int numeroMesa, List<Plato>platos){
        this.numeroMesa = numeroMesa;
        this.platos = platos;
    }

    @Override
    public Map<String, List<Plato>> getPlatos() {
        return platos.stream().collect(Collectors.groupingBy(Plato::getCategoria));
    }

    @Override
    public double calcularTotal() {
        double suma = 0;
        for (Plato plato : platos){
            suma += plato.getPrecio();
        }
        return suma;
    }

    @Override
    public void cerrarPedido() {
    }

    @Override
    public void agregarPlato() {
    }

    @Override
    public void cancelarPedido() {
    }

    @Override
    public String toString() {
        StringBuilder detallePlatos = new StringBuilder();

        for (Plato plato : platos) {
            detallePlatos.append(plato.getNombre())
                    .append(": $")
                    .append(plato.getPrecio())
                    .append("\n");
        }

        return "Pedido{" +
                "numeroMesa=" + numeroMesa +
                ", detallePlatos=\n" + detallePlatos +
                "Total=" + calcularTotal() +
                '}';
    }

}
