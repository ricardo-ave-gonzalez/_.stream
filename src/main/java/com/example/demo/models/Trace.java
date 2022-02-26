package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "trace")
public class Trace {

    @Id
    @Column(name = "ts")
    public long ts = Calendar.getInstance().getTimeInMillis();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha", nullable = false)
    public LocalDateTime fecha;

    @Column(name = "descripcion")
    public String descripcion;

    @Column(name = "creadoPor")
    public String creadoPor;

    @Column
    public String rolDeUsuario;

    @OneToMany(mappedBy="acciones")
    public List<Accion> acciones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trace)) return false;
        Trace trace = (Trace) o;
        return ts == trace.ts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ts);
    }
}
