package dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private String contaCorrente;
    private String registro;
    private String cracha;
    private String usuario;
    private String senha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario() {
    }
    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String contaCorrente, String registro, String cracha, String usuario, String senha) {
        super(codigo, nome, email, telefone, dataNascimento);
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
        this.usuario = usuario;
        this.senha = senha;
    }
    
}
