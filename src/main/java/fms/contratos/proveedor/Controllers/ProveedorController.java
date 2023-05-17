package fms.contratos.proveedor.Controllers;

import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fms.contratos.proveedor.DTOs.ApiErrorDTO;
import fms.contratos.proveedor.DTOs.ApiResponseDTO;
import fms.contratos.proveedor.DTOs.ProveedorDTO;
import fms.contratos.proveedor.Entities.Proveedor;
import fms.contratos.proveedor.Services.ProveedorService;
import fms.contratos.proveedor.Utils.AppMessages;
import fms.contratos.proveedor.Utils.Meta;

@RestController
public class ProveedorController {
    
    @Autowired
    private ProveedorService service;

    private static final Logger LOGGER = LogManager.getLogger(ProveedorController.class.getName());
    private final Meta meta = new Meta(UUID.randomUUID().toString(), "OK", 200);
    private final Meta metaError = new Meta(UUID.randomUUID().toString(), "INTERNAL_SERVER_ERROR", 500);
    private static final String FORMATO = "%s - %s";

    @GetMapping("/proveedores")
    public ApiResponseDTO getProveedores(){
        try {
            List<Proveedor> list = service.getAll();
            return new ApiResponseDTO(meta,list);

        } catch (Exception e) {

            LOGGER.log(Level.ERROR, String.format(FORMATO, AppMessages.MENSAJE, e.getMessage()));
            ApiErrorDTO error = new ApiErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            return new ApiResponseDTO(metaError,error);

        }
    }

    @PostMapping("/proveedores")
    public ApiResponseDTO SaveProveedor(@RequestBody Proveedor dto){

        try {

            Proveedor prv = service.Save(dto);
            return new ApiResponseDTO(meta,prv);

        } catch (Exception e) {

            LOGGER.log(Level.ERROR, String.format(FORMATO, AppMessages.MENSAJE, e.getMessage()));
            ApiErrorDTO error = new ApiErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            return new ApiResponseDTO(metaError,error);
        }
    }

    @DeleteMapping("/proveedore")
    public void Delete(@RequestParam Long id) throws Exception{
        try {
            service.delete(id);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, String.format(FORMATO, AppMessages.MENSAJE, e.getMessage()));
            throw new Exception(e.getMessage());
        }
    }
}
