package com.tarea3.service;

import com.tarea3.dao.ConsultaDao;
import com.tarea3.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConsultaServicelmpl implements ConsultaService {

    @Autowired
    private ConsultaDao consultaDao;

    @Override
    @Transactional
    public void save(Consulta consulta) {
        consultaDao.save(consulta);
    }

}
