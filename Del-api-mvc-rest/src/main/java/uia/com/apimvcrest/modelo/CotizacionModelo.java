package uia.com.apimvcrest.modelo;


import java.util.ArrayList;

public class CotizacionModelo extends InfoComprasUIAModelo {
    public CotizacionModelo()
    {
        super();
    }
    public CotizacionModelo(int id, String name, String codigo, int vendedor, int clasificacionVendedor, double total, int entrega)
    {
        super(id, name, codigo, vendedor, clasificacionVendedor, total, entrega);
    }
}
