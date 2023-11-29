package com.administraciondeenviosydestinatarios.destinatarios.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnvioDTO {
    private Integer idEnvio;
    private LocalDate fechaCreacion;
    private String estadoProcesamiento;
    private String descripcion;
    private Integer idDestinatario;

    //le doy a un destinatario los valores de envio y los vinculo a traves de idDestinatario.
}
