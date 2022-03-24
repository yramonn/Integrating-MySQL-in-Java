package com.sovos;

public class Empresa {
    int idEmpresa;
    String nome;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa(int idEmpresa, String nome) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
    }
}
