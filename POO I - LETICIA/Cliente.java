

public class Cliente {
  String Nome;
  String Sobrenome;
  String Cpf;
  String Endereco;
  String Cidade;
  String Telefone;


  String Dados(){
    return 
    
    ("\n") 
    +"Nome: " + Nome  + ("\n") 
    + "Sobrenome: " + Sobrenome + ("\n")
    + "CPF: " + Cpf + ("\n")
    + "Endereço: " + Endereco + ("\n")
    + "Cidade: " + Cidade + ("\n")
    + "Telefone: " + Telefone + ("\n");
  }
  CadCliente cliente = new CadCliente();
}
