package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.ItemPOCModelo;
import uia.com.apimvcrest.modelo.POCModelo;

import java.util.ArrayList;

public interface IPOCServicio {
    ArrayList<ItemPOCModelo> getPOC();
    ItemPOCModelo getPOC(int id);
    void print();
}
