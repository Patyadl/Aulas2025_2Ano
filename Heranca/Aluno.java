package Heranca;
public class Aluno extends Usuario {

  String matricula;
  String curso;

  public Aluno() {
    
 super();
}

  public Aluno(String nome, String cpf,  int cep, String cargo, 
  String matricula,
   String curso) {

    super(nome, cpf, cep, cargo);
  
    this.matricula = matricula;
    this.curso = curso;
  }
}

