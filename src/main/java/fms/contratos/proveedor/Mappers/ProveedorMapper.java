package fms.contratos.proveedor.Mappers;

import org.modelmapper.ModelMapper;

import fms.contratos.proveedor.DTOs.ProveedorDTO;
import fms.contratos.proveedor.Entities.Proveedor;

public class ProveedorMapper {
    public ProveedorMapper() {
        throw new IllegalStateException("No existe un constructor para la clase");
    }

    private static final ModelMapper MAPPER = new ModelMapper();

    public static ProveedorDTO mapProveedor(Proveedor proveedor){
        return MAPPER.map(proveedor, ProveedorDTO.class);
    }
    public static Proveedor mapCodigosRopaDTO(ProveedorDTO proveedorDTO){
        return MAPPER.map(proveedorDTO, Proveedor.class);
    }
}
