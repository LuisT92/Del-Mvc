package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.ItemDelModelo;
import uia.com.apimvcrest.modelo.ItemPOCModelo;

import java.util.ArrayList;

public class DelServicio {
    @Override
    public ArrayList<ItemDelModelo> getPOC() {
        return miGestorCompras.getPOC();
    }

    @Override
    public ItemDelModelo getPOC(int id) {
        return null;
    }

    @Override
    public void print() {

    }
}
