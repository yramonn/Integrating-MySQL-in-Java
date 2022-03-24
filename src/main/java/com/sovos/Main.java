package com.sovos;

import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final String fileName = "C:/Users/Ramon.Silva/Downloads>";

    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn;
       /* List<Empregado> listEmpregado = new LinkedList<Empregado>();
        try {
            Conexao c = new Conexao();

            conn = c.getNewConnection();

            stmt = conn.createStatement();
            stmt.execute("UPDATE `empregado` \n" +
                    "SET `nome` = CONCAT(idempregado,\" \", nome,\"  \", \"Sovos\")\n" +
                    " WHERE (`idEmpresa` = '1');");

            if (stmt.execute("SELECT  * FROM empregado" )) {
                rs = stmt.getResultSet();

            }

            while (rs.next())
            {   Empregado e = new Empregado();
                e.idempregado = rs.getInt("idempregado");
                e.nome = rs.getString("nome");

                e.setIdempregado(rs.getInt("idempregado"));
                e.setNome(rs.getString("nome"));

                e.idEmpresa = rs.getInt("idEmpresa");
                e.nome(rs.getString("nome"));

                e.setIdEmpresa(rs.getInt("idEmpresa"));
                e.nome(rs.getString("nome"));

                //listEmpregado.add(e);


                System.out.println(rs.getString("nome"));
               // System.out.println(rs.getString("idempregado"));
               // System.out.println(rs.getString("idEmpresa"));
            }

            for(Empregado emp: listEmpregado) {
                //System.out.println(emp.nome + " "  + emp.idempregado + " " + emp.idEmpresa);
                System.out.println(emp);
            }



        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } */


//------------------------------------------------------------------------------------------------


        List<Cliente> listCliente = new LinkedList<Cliente>();
        try {
            Conexao c = new Conexao();

            conn = c.getNewConnection();

            stmt = conn.createStatement();
            /*stmt.execute("UPDATE `empregado` \n" +
                    "SET `nome` = CONCAT(idempregado,\" \", nome,\"  \", \"Sovos\")\n" +
                    " WHERE (`idEmpresa` = '1');");*/

            if (stmt.execute("SELECT  * FROM cliente")) {
                rs = stmt.getResultSet();

            }

            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.id_cliente = rs.getInt("id_cliente");
                cl.nome = rs.getString("nome");
                cl.cpf = rs.getString("cpf");
                cl.telefone = rs.getString("Telefone");
                cl.dt_nasc = rs.getDate("dt_nasc");


                cl.setId_cliente(rs.getInt("id_cliente"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));
                cl.setTelefone(rs.getString("Telefone"));
                cl.setDt_nasc(rs.getDate("dt_nasc"));

                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("id_cliente"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("Telefone"));
                System.out.println(rs.getDate("dt_nasc"));
            }

            for (Cliente cli : listCliente) {
                System.out.println(cli.id_cliente + " " + cli.nome + " " + cli.cpf + " " + cli.telefone + " " + cli.dt_nasc);
                System.out.println(cli);

            }


        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());


        }


    }
}