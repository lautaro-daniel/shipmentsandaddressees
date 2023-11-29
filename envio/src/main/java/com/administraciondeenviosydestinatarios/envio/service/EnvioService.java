package com.administraciondeenviosydestinatarios.envio.service;

import com.administraciondeenviosydestinatarios.envio.model.Envio;
import com.administraciondeenviosydestinatarios.envio.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioService implements IEnvioService{

    @Autowired
    private EnvioRepository envioRepository;

    @Override
    public List<Envio> getEnvios() {
        return envioRepository.findAll();
    }

    @Override
    public void saveEnvio(Envio envio) {
        envioRepository.save(envio);
    }

    @Override
    public void getEnvio(Integer idEnvio) {
        envioRepository.findById(idEnvio);
    }
}
