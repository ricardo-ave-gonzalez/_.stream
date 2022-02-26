package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "accion")
public class Accion {

    @Id
    @Column(name = "ts")
    public long ts = Calendar.getInstance().getTimeInMillis();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha", nullable = false)
    public LocalDateTime fecha;

    @Column(name = "descripcion")
    public String descripcion;

    @Column(name = "modificadoPor")
    public String modificadoPor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accion)) return false;
        Accion accion = (Accion) o;
        return ts == accion.ts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ts);
    }
}
