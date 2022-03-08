package com.tarea3.service;

import com.tarea3.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
   public List<Cliente> getClientes(); 
   
   public void save(Cliente cliente);/* Si viene un id MODIFICA sino agrega nuevo registro*/
   
   public void delete(Cliente cliente);
   
   public Cliente getCliente(Cliente cliente);
}
