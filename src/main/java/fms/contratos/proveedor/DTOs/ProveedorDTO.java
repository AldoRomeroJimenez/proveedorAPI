package fms.contratos.proveedor.DTOs;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ApiResponseDTO
 */
@AllArgsConstructor
@NoArgsConstructor
@Data public class ProveedorDTO {
    public Long Id;
    public String Nombre;
    public String RFC;
    public String RazonSocial;
    public String Direccion;
    public String Telefono;
    public String Encargado;    
    public String Email; 
    public String FechaRegistro;
}
