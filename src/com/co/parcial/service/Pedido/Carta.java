package com.co.parcial.service.Pedido;

import com.co.parcial.service.Plato.Plato;

import java.util.List;
import java.util.Map;

public interface Carta {
    Map<String, List<Plato>> getPlatos();
    void agregarPlato();
    double calcularTotal();
    void cancelarPedido();
    void cerrarPedido();

}
