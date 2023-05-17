package fms.contratos.proveedor.Entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Proveedor")
@NoArgsConstructor
@AllArgsConstructor
@Data public class Proveedor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nombre")
    private String Nombre;

    @Column(name = "rfc")
    private String RFC;

    @Column(name = "razonsocial")    
    private String RazonSocial;

    @Column(name = "direccion")
    private String Direccion;

    @Column(name = "telefono")
    private String Telefono;

    @Column(name = "encargado")
    private String Encargado;

    @Column(name = "correo")    
    private String Email;

    @Column(name = "fecha")
    private String FechaRegistro;
}
