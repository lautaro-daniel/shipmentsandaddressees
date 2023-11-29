package com.administraciondeenviosydestinatarios.destinatarios.model;

import com.administraciondeenviosydestinatarios.destinatarios.dto.EnvioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Destinatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDestinatario;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numTelefono;
    @JdbcTypeCode(SqlTypes.JSON)
    private List<EnvioDTO> lista_envios;
}
