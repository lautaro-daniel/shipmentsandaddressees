package com.administraciondeenviosydestinatarios.destinatarios.controller;

import com.administraciondeenviosydestinatarios.destinatarios.dto.EnvioDTO;
import com.administraciondeenviosydestinatarios.destinatarios.model.Destinatario;
import com.administraciondeenviosydestinatarios.destinatarios.service.IDestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinatario")
public class DestinatarioController {

    @Autowired
    private IDestinatarioService iDestinatarioService;

    @GetMapping("/traer")
    public List<Destinatario> getDestinatarios(){
        return iDestinatarioService.getDestinatarios();
    }

    @PostMapping("/crear")
    public String crearDestinatario(@RequestBody Destinatario destinatario){
        iDestinatarioService.crearDestinatario(destinatario);

        return "Destinatario creado correctamente.";
    }

    @GetMapping("/ver/{idDestinatario}")
    public List<EnvioDTO> getDestinatarioById(@PathVariable("idDestinatario") Integer idDestinatario){
        return iDestinatarioService.getDestinatarioById(idDestinatario);
    }
}
