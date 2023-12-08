package com.citas.apicitas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "paciente")
public class Paciente {

  @Id
  @Column(name = "id_numero_cedula")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idNumeroCedula;

  @Column
  private String nombre;

  @Column
  private String apellido;

  @Column
  private String telefono;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;

  @JsonIgnore
  @OneToMany(mappedBy = "paciente")
  private Set<Cita> citas = new HashSet<>();
}
