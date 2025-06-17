package Classes_simples;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite os dados da pessoa:");

    System.out.print("Nome: ");
    String nome = input.nextLine();

    System.out.print("Idade: ");
    int idade = input.nextInt();
    input.nextLine(); 

    System.out.print("CPF: ");
    String cpf = input.nextLine();

    System.out.print("Salário: ");
    float salario = input.nextFloat();

    System.out.print("CEP: ");
    int cep = input.nextInt();

    // Mostrando os dados inseridos
    System.out.println("\nDados da Pessoa Inserida:");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + cpf);
    System.out.println("Salário: " + salario);
    System.out.println("CEP: " + cep);

    input.close();
  }
}
