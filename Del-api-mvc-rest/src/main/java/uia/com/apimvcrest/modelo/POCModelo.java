package uia.com.apimvcrest.modelo;

public class POCModelo extends InfoComprasUIAModelo {


    public POCModelo()
    {
        super();
    }

    public POCModelo(int id, String name, String codigo, int vendedor, int clasificacionVendedor, double total, int entrega)
    {
        super(id, name, codigo, vendedor, clasificacionVendedor, total, entrega);
    }
}
