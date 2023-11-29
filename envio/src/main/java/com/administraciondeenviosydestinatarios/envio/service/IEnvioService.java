package com.administraciondeenviosydestinatarios.envio.service;

import com.administraciondeenviosydestinatarios.envio.model.Envio;

import java.util.List;

public interface IEnvioService {

    public List<Envio> getEnvios();
    public void saveEnvio(Envio envio);
    public void getEnvio(Integer idEnvio);
}
