package fms.contratos.proveedor.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import fms.contratos.proveedor.Entities.Proveedor;

@Service
public interface ProveedorService {
    List<Proveedor> getAll();
    Proveedor getById(Long id);
    Proveedor Save(Proveedor prv);
    void delete(Long id);
}
