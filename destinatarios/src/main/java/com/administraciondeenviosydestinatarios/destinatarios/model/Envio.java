package com.administraciondeenviosydestinatarios.destinatarios.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Envio {

    private Long idEnvio;
    private LocalDate fechaCreacion;
    private String estadoProcesamiento;
    private String descripcion;
    private Integer idDestinatario;
}
