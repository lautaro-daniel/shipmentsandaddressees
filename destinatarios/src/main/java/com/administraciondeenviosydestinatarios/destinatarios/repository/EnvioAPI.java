package com.administraciondeenviosydestinatarios.destinatarios.repository;

import com.administraciondeenviosydestinatarios.destinatarios.dto.EnvioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "envioapi", url = "http://localhost:9002/envio")
public interface EnvioAPI {

    @GetMapping("/ver")
    List<EnvioDTO> getEnvioInfo();
}
