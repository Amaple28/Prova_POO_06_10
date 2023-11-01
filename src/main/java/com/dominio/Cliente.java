package com.dominio;

import java.util.Objects;

public class Cliente {
    //atributos
    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String email;

    //constructor
    public Cliente() {
    }

    public Cliente(Integer id, String nome, String endereco, String telefone, String cep, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
    }

    //metodos
    public static Cliente novoCliente(Integer id, String nome, String endereco, String telefone, String cep, String email){
        var cliente = new Cliente(id, nome, endereco, telefone, cep, email);
        return cliente;
    }

    //criando objeto animal
    public static Animal novoAnimal(Integer id, String nome, String dataNascimento, Character sexo, String especie){
        var animal = new Animal(11, "Luke", "11/07/2004", 'F',"cachorro");
        return animal;
    }

    //getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(endereco, cliente.endereco) && Objects.equals(telefone, cliente.telefone) && Objects.equals(cep, cliente.cep) && Objects.equals(email, cliente.email);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, telefone, cep, email);
    }

    //toString
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
