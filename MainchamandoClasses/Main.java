package MainchamandoClasses;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite os dados da pessoa:");

    System.out.print("Nome: ");
    String nome = input.nextLine();

    System.out.print("CPF: ");
    String cpf = input.nextLine();

    System.out.print("CEP: ");
    int cep = input.nextInt();

        System.out.print("Cargo: ");
    String cargo = input.next();

    Usuario pessoaUsuario = new Usuario();
    pessoaUsuario.nome = nome;
    pessoaUsuario.cpf = cpf;
    pessoaUsuario.cep = cep;
    pessoaUsuario.cargo = cargo;

    //Formato usando o construtor
    Usuario pessoaUsuario2 = new Usuario("Patrícia" , 
    "123456789-10", 2300101 , "Docente" );

    // Mostrando os dados inseridos
    System.out.println("\nDados da Pessoa Inserida:");
    System.out.println("Nome: " + pessoaUsuario.nome);
    System.out.println("CPF: " + pessoaUsuario.cpf);
    System.out.println("CEP: " + pessoaUsuario.cep);
       System.out.println("Cargo: " + pessoaUsuario.cargo);
    input.close();
  }
}
