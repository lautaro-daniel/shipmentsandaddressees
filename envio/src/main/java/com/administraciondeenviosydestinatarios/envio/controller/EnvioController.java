package com.administraciondeenviosydestinatarios.envio.controller;

import com.administraciondeenviosydestinatarios.envio.model.Envio;
import com.administraciondeenviosydestinatarios.envio.service.IEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/envio")
public class EnvioController {

    @Autowired
    private IEnvioService iEnvioService;

    @GetMapping("/ver/{idEnvio}")
    public void getEnvio(@PathVariable("idEnvio") Integer idEnvio){
        iEnvioService.getEnvio(idEnvio);
    }

    @PostMapping("/crear")
    public String saveEnvio(@RequestBody Envio envio){
        iEnvioService.saveEnvio(envio);

        return "Envio guardado correctamente.";
    }

    @GetMapping("/ver")
    public List<Envio> getEnvios(){
        return iEnvioService.getEnvios();
    }
}
