import java.sql.Time;

public class Professor extends Usuario {
    
String materia;
private Float salario;
String turma;
Time horario;

public Professor(){
    super();
}
public Professor(String nome, String cpf, int cep, String cargo, 
String materia, Float salario, String turma, 
Time horario ){
    super(nome, cpf, cep, cargo);
    this.materia = materia;
    this.salario = salario;
    this.turma = turma;
    this.horario = horario;
}
@Override
public String getNome(){
    return nome;
}
public String getTurma(){
    return turma;
}
@Override 
public void setNome(String nome) {
    this.nome = nome;
}
public void setTurma(String turma) {
    this.turma = turma;
}
}
