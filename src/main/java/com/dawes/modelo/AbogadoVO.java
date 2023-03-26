package com.dawes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="abogados", uniqueConstraints = @UniqueConstraint(columnNames = "nif"))
public class AbogadoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idabogado;
	private String nombre;
	private String nif;
	private String direccion;
	public AbogadoVO(String nombre, String nif, String direccion) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.direccion = direccion;
	}
	
	

}
