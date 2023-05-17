package fms.contratos.proveedor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fms.contratos.proveedor.Entities.Proveedor;
import java.util.List;


public interface ProveedorRepository extends JpaRepository<Proveedor,Long>{
    
}
