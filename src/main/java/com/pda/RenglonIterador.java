package com.pda;

import com.pda.models.Producto;
import com.pda.models.Renglon;
import com.pda.models.Venta;

import java.util.*;

public class RenglonIterador implements Iterador<Renglon> {
    private List<Renglon> renglonesAgrupados;
    private int currentIndex = 0;

    public RenglonIterador(List<Renglon> renglonesOriginales) {
        Map<Long, Renglon> renglonMap = new HashMap<>();

        for (Renglon renglon : renglonesOriginales) {
            Long productId = renglon.getProducto().getId();
            Renglon renglonExistente = renglonMap.get(productId);

            if (renglonExistente == null) {
                renglonMap.put(productId, renglon);
            } else {
                renglonExistente.setCantidad(renglonExistente.getCantidad() + renglon.getCantidad());
                renglonExistente.setMonto(renglonExistente.getMonto() + renglon.getMonto());
            }
        }

        this.renglonesAgrupados = new ArrayList<>(renglonMap.values());
    }


    @Override
    public boolean hasNext() {
        return currentIndex < renglonesAgrupados.size();
    }

    @Override
    public Renglon next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en el iterador");
        }
        return renglonesAgrupados.get(currentIndex++);
    }

    public double sumarMontos() {
        double total = 0;
        for (Renglon renglon : renglonesAgrupados) {
            total += renglon.getMonto();
        }
        return total;
    }

    public int contarElementos() {
        return renglonesAgrupados.size();
    }
}
