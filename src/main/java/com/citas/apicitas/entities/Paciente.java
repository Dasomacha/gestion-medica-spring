package com.citas.apicitas.entities;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
  @JsonManagedReference
  private Set<Cita> citas = new HashSet<>();
}
