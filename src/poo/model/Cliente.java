package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
  private List<Endereco> enderecos;

  //Aqui ele valida para não ser nulo.
  public void adcionarEndereco(Endereco endereco) {
      if (endereco == null) {
          throw new NullPointerException("O Endereço não pode ser nulo!");
      }
      if (endereco.cep == null) {
          throw new NullPointerException("O Cep não pode ser nulo!");
      }
      getEnderecos().add(endereco);
  }

 private List<Endereco> getEnderecos(){
     if(enderecos == null){
         enderecos = new ArrayList<Endereco>();
     }
      return enderecos;
 }

}
