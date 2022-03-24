package com.sovos;

public class Empregado {
    int idempregado;
    String nome;
    int idade;
    int telefone;
    int idEmpresa;

    public int getIdempregado() {
        return idempregado;
    }

    public void setIdempregado(int idempregado) {
        this.idempregado = idempregado;
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public  Empregado() {

    }

    @Override
    public String toString() {
        return "Empregado{" +
                "idempregado=" + idempregado +
                ", nome='" + nome + '\'' +
                '}';


    }

    public void nome(String nome) {
    }
}
