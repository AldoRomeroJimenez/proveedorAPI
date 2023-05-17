package fms.contratos.proveedor.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiErrorDTO {
    private HttpStatus status;
    private String message;

}