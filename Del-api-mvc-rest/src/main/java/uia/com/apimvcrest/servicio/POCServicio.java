package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.ItemPOCModelo;
import uia.com.apimvcrest.modelo.POCModelo;

import java.io.IOException;
import java.util.ArrayList;

public class POCServicio implements IPOCServicio {
    private GestorCompras miGestorCompras = new GestorCompras();

    public POCServicio() throws IOException {
    }

    @Override
    public ArrayList<ItemPOCModelo> getPOC() {
        return miGestorCompras.getPOC();
    }

    @Override
    public ItemPOCModelo getPOC(int id) {
        return null;
    }

    @Override
    public void print() {

    }
}
