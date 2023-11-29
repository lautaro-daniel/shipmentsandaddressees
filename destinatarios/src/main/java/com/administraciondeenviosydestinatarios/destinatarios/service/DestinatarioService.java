package com.administraciondeenviosydestinatarios.destinatarios.service;

import com.administraciondeenviosydestinatarios.destinatarios.dto.EnvioDTO;
import com.administraciondeenviosydestinatarios.destinatarios.model.Destinatario;
import com.administraciondeenviosydestinatarios.destinatarios.repository.EnvioAPI;
import com.administraciondeenviosydestinatarios.destinatarios.repository.IDestinatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinatarioService implements IDestinatarioService{

    @Autowired
    private IDestinatarioRepository iDestinatarioRepository;

    @Autowired
    private EnvioAPI envioAPI;

    @Override
    public List<Destinatario> getDestinatarios() {
        return iDestinatarioRepository.findAll();
    }

    @Override
    public void crearDestinatario(Destinatario destinatario) {
        iDestinatarioRepository.save(destinatario);
    }

    @Override
    public List<EnvioDTO> getDestinatarioById(Integer idDestinatario) {
        List<EnvioDTO> enviosPersona = new ArrayList<>();
            for (EnvioDTO envio : envioAPI.getEnvioInfo()){
                if (envio.getIdDestinatario().equals(idDestinatario)){
                    enviosPersona.add(envio);
                }
            }
            return enviosPersona;
        }
}
