package uia.com.apimvcrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.ItemPOCModelo;
import uia.com.apimvcrest.modelo.POCModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;
import uia.com.apimvcrest.servicio.POCServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class POCController {
    private POCServicio servicioPOC = new POCServicio();

    public POCController() throws IOException {
    }

    @GetMapping("/poc")
    public ArrayList<ItemPOCModelo> cotizaciones()
    {
        return servicioPOC.getPOC();
    }

    @GetMapping("/poc/{id}")
    public ResponseEntity<POCModelo> cotizacionById(@PathVariable int id)
    {
        return null; //(ResponseEntity<POCModelo>) servicioPOC.getPOC(id);
    }
}
