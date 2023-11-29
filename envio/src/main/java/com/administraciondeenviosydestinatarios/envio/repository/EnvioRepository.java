package com.administraciondeenviosydestinatarios.envio.repository;

import com.administraciondeenviosydestinatarios.envio.model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Integer> {

    //@Query("SELECT env FROM Envio env WHERE :destinatario MEMBER OF env.destinatarios")
    //List<Envio> findEnvioByDestinatario(String destinatario);
}
