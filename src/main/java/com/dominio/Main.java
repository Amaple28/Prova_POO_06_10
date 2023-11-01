package com.dominio;

public class Main {

    private static final Cliente cliente = new Cliente();
    public static void main(String[] args) {
        //objeto cliente
        var idCliente = 10;
        var nomeCliente = "Cliente";
        var endereco = "Avenida Carlos Luz, Número 220";
        var telefone = "(31) 00000-0000";
        var cep = "00-000.000";
        var email = "cliente@email.com";
        Cliente.novoCliente(idCliente, nomeCliente, endereco, telefone, cep, email);
    }
}
