package com.pda.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class GestorDeConexion {

    @Autowired
    private DataSource dataSource;

    public Connection obtenerConexion() throws SQLException {
        return dataSource.getConnection();
    }

    // Cualquier otra lógica adicional que desees agregar
}
