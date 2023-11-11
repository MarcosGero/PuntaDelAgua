package com.pda;

import com.pda.models.Producto;
import com.pda.models.Renglon;

import java.util.*;

// Implementación concreta para Productos
public class RenglonIterador implements Iterador<Renglon> {
    private Iterator<Renglon> iterator;

    public RenglonIterador(List<Producto> productos) {
        Map<String, Renglon> renglonMap = new HashMap<>();

        for (Producto producto : productos) {
            Renglon renglon = renglonMap.get(producto.getNombre());
            if (renglon == null) {
                renglon = new Renglon(producto.getNombre(), 1, producto.getPrecioMinorista());
                renglonMap.put(producto.getNombre(), renglon);
            } else {
                renglon.setCantidad(renglon.getCantidad() + 1);
            }
        }

        this.iterator = renglonMap.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Renglon next() {
        return iterator.hasNext() ? iterator.next() : null;
    }
}
