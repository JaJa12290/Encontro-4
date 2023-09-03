import java.time.LocalDate;

import dominio.*;

public class App{ 
    public static void main(String[] args) throws Exception {
        
        Funcionario f1 = new Funcionario();
        f1.setCodigo(1);
        f1.setNome("Fulano Perreira de Tal");
        f1.setContaCorrente("31623");
        f1.setCracha("13f1");
        f1.setDataNascimento(LocalDate.of(2000, 07, 27));
        f1.setEmail("fulanodetal@email.com");
        f1.setRegistro("1786hha1");
        f1.setTelefone("987654321");
        f1.setUsuario("Fulano1234");
        f1.setSenha("Tal0987");

        Passageiro p1 = new Passageiro();
        p1.setCodigo(3214);
        p1.setNome("Zezinho da Massa");
        p1.setDataNascimento(LocalDate.of(2004, 12, 31));
        p1.setDocumento("897124813");
        p1.setEmail("zezinho_massa@email.com");
        p1.setNumeroCartao("17813");
        p1.setTelefone("912345678");

        MostraFuncionario(f1);
        MostraPassageiro(p1); 
    }
    public static void MostraFuncionario(Funcionario funcionario){
        System.out.println("Informacoes do Funcionario:\n");
        System.out.println("Codigo: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Conta Corrente: " + funcionario.getContaCorrente());
        System.out.println("Cracha: " + funcionario.getCracha());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Registro: " + funcionario.getRegistro());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("Usuario: " + funcionario.getUsuario());
        System.out.println("Senha: " + funcionario.getSenha());
        System.out.println("\n");
    }
    public static void MostraPassageiro(Passageiro passageiro){
        System.out.println("Informacoes do Passageiro: \n");
        System.out.println("Codigo: " + passageiro.getCodigo());
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Email: " + passageiro.getEmail());
        System.out.println("Data de Nascimento: " + passageiro.getDataNascimento());
        System.out.println("Documento: " + passageiro.getDocumento());
        System.out.println("Numero do Cartao: " + passageiro.getNumeroCartao());
        System.out.println("Telefone: " + passageiro.getTelefone());
    }
}