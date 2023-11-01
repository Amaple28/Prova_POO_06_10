package com.dominio;

import java.util.Objects;

public class Animal {
    //atributos
    private Integer id;
    private String nome;
    private String dataNascimento;
    private Character sexo;
    private String especie;

    //constructor
    public Animal() {
    }

    public Animal(Integer id, String nome, String dataNascimento, Character sexo, String especie) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.especie = especie;
    }

    //metodos
    //..

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id) && Objects.equals(nome, animal.nome) && Objects.equals(dataNascimento, animal.dataNascimento) && Objects.equals(sexo, animal.sexo) && Objects.equals(especie, animal.especie);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataNascimento, sexo, especie);
    }

    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", especie='" + especie + '\'' +
                '}';
    }
}
