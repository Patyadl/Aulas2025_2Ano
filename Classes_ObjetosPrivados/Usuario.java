public class Usuario {

  String nome;
  private String cpf;
  private int cep;
  private String cargo;

  public Usuario() {}

  public Usuario(String nome, String cpf, int cep, String cargo) {
    this.nome = nome;
    this.cpf = cpf;
    this.cep = cep;
    this.cargo = cargo;
  }

  public String getNome() {
    return nome;
  }

  public String getCargo() {
    return cargo;
  }

  public int getCep() {
    return cep;
  }

  public String getCpf() {
    return cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void setCep(int cep) {
    this.cep = cep;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
