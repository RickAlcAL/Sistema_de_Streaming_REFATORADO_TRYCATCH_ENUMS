package Entities.Emuns;

public enum Avisos {
    //Enums com respostas pre programadas
    CONFIRMADO ("Seu processo foi confirmado..."),
    FINALIZADO ("Seu processo foi finalizado !!!"),
    ERRO ("Erro... Tente novamente");
    //Usando final, pois so será usado aqui
    private final String mensagemUsuario;
    //Construtor para inicializar a mensagem do usuario
    Avisos (String mensagemUsuario) {
        this.mensagemUsuario = mensagemUsuario;
    }
    //Método get usado para ativar a exibição lá no menu
    public String getMensagemUsuario() {
        return mensagemUsuario;
    }
}
