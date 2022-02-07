package uia.com.apimvcrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import uia.com.apimvcrest.modelo.ItemDelModelo;
import uia.com.apimvcrest.modelo.ItemPOCModelo;
import uia.com.apimvcrest.modelo.POCModelo;
import uia.com.apimvcrest.servicio.POCServicio;

import java.io.IOException;
import java.util.ArrayList;

public class DelController {private POCServicio servicioPOC = new POCServicio();

    public DelController() throws IOException {
    }

    @GetMapping("/poc")
    public ArrayList<ItemDelModelo> cotizaciones()
    {
        return servicioPOC.getPOC();
    }

    @GetMapping("/poc/{id}")
    public ResponseEntity<POCModelo> cotizacionById(@PathVariable int id)
    {
        return null; //(ResponseEntity<POCModelo>) servicioPOC.getPOC(id);
    }
}
