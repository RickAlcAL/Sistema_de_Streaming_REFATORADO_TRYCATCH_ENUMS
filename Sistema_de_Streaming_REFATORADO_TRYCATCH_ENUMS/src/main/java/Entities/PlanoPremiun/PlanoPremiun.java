package Entities.PlanoPremiun;

import Entities.ContaStreaming.ContaStreaming;


public class PlanoPremiun extends ContaStreaming {
    private String qualidadeVideo = "4k Ultra HD";
    private int limiteDeTela = 4;
    private boolean permissaoDeDownload = true;
    private double precoBase = 50.00;
    //Construtor geral que recebe os atributos da classe pai e desta classe filho
    public PlanoPremiun(String nomeUsuario, String emailUsuario, String qualidadeVideo, int limiteDeTela, boolean permissaoDeDownload, double precoBase) {
        super(nomeUsuario, emailUsuario);
        this.qualidadeVideo = qualidadeVideo;
        this.limiteDeTela = limiteDeTela;
        this.permissaoDeDownload = permissaoDeDownload;
        this.precoBase = precoBase;
    }
    //Construtor padrão que só receberá os atributos da classe pai
    public PlanoPremiun(String nomeUsuario, String emailUsuario) {
        super(nomeUsuario, emailUsuario);
    }
    //Construtor para iniciar a atribuição de dados

    public PlanoPremiun() {

    }
    //toString usado para exibição do usuario o valor retornado dos seus dados
    @Override
    public String toString () {
        return "======== Plano Premium selecionado =========" +
                "\nQualidade de video: " + qualidadeVideo +
                "\nQuantidade de tela: " + limiteDeTela +
                "\nPermissao para baixar: " + (permissaoDeDownload ? "Permitido" : "Não permitido") +
                "\nUsuario cadastrado: " + getNomeUsuario() +
                "\nEmail registrado: " +getEmailUsuario() +
                String.format("\nPreço do plano: R$ %.2f", precoBase) +
                "\n======== // ================= // =========";

    }
}
