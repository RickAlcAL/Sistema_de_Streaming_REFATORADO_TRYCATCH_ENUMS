package Entities.ContaStreaming;


public class ContaStreaming {
    protected String nomeUsuario;
    protected String emailUsuario;

    //Construtor apenas para chamar a atribuição
    public ContaStreaming() {

    }
    //Construtor principal
    public ContaStreaming(String nomeUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
    }
    //Getters e setters
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    //toString para exibir o cadastro do usuario
    @Override
    public String toString () {
        return "===================================" +
                "Cadastro encontrado com sucesso" +
                "Seu nome: " + getNomeUsuario() +
                "\nSeu email: " + getEmailUsuario();
    }

}
