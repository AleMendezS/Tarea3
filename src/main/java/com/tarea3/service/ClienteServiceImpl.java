package com.tarea3.service;

import com.tarea3.dao.ClienteDao;
import com.tarea3.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    public List<Cliente> getClientes() {
       throw new UnsupportedOperationException("Not supported yet."); /*return (List<Cliente>) clienteDao.findAll();*/
    }

    @Override
    public void save(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
