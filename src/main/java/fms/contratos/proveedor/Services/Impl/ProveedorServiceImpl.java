package fms.contratos.proveedor.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fms.contratos.proveedor.Entities.Proveedor;
import fms.contratos.proveedor.Repository.ProveedorRepository;
import fms.contratos.proveedor.Services.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

    @Autowired
    private ProveedorRepository repository;

    @Override
    public List<Proveedor> getAll() {
       return repository.findAll();
    }

    @Override
    public Proveedor getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Proveedor Save(Proveedor prv) {
       return repository.save(prv);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
