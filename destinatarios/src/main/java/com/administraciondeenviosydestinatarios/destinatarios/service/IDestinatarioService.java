package com.administraciondeenviosydestinatarios.destinatarios.service;

import com.administraciondeenviosydestinatarios.destinatarios.dto.EnvioDTO;
import com.administraciondeenviosydestinatarios.destinatarios.model.Destinatario;

import java.util.List;

public interface IDestinatarioService {

    public List<Destinatario> getDestinatarios();
    public void crearDestinatario(Destinatario destinatario);

    List<EnvioDTO> getDestinatarioById(Integer idDestinatario);
}
