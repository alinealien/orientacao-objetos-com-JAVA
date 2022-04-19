package poo;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

        try { //tratamento de erros
        cliente.adcionarEndereco(endereco);

        System.out.println("Endereço adcionado com sucesso!");
    } catch (Exception e){
            System.err.println("Houve um erro ao adcionar o endereço: " +e.getMessage()
            );
        }
    }
}
