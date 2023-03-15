

public class FinalCliente {
  public static void main(String[] args) {
    System.out.println("O cadastro final é do cliente:");
    
    Cliente Usuario = new Cliente();

    Usuario.Nome = "Raul ";
    Usuario.Sobrenome = "Floss";
    Usuario.Cpf = "073.324.421-16";
    Usuario.Endereco = "Rua Benedito Americo 259B";
    Usuario.Cidade = "Sinop-MT";
    Usuario.Telefone = "(00)0 0000-0000";

    System.out.println(Usuario.Dados());
  }

}
