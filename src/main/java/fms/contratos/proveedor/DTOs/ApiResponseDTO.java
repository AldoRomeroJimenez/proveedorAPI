package fms.contratos.proveedor.DTOs;



import fms.contratos.proveedor.Utils.Meta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ApiResponseDTO
 */
@AllArgsConstructor
@NoArgsConstructor
@Data public class ApiResponseDTO {

    private Meta meta;
    private Object data;

}
