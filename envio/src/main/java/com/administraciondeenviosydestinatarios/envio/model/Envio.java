package com.administraciondeenviosydestinatarios.envio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEnvio;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaCreacion;
    private String estadoProcesamiento;
    private String descripcion;
    private Integer idDestinatario;
}
