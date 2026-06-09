package Entities.PlanoPadrao;

import Entities.ContaStreaming.ContaStreaming;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo = "Full HD";
    private int quantidadeTelas = 2;
    private double precoBase = 30.00;
    private boolean permissaoDeDownload = false;
    //COnstrutor geral que recebe os atributos da classe pai e atual
    public PlanoPadrao(String nomeUsuario, String emailUsuario, String qualidadeVideo, int quantidadeTelas, double precoBase, boolean permissaoDeDownload) {
        super(nomeUsuario, emailUsuario);
        this.qualidadeVideo = qualidadeVideo;
        this.quantidadeTelas = quantidadeTelas;
        this.precoBase = precoBase;
        this.permissaoDeDownload = permissaoDeDownload;
    }
    //Construtor padrão que só receberá os atributos da classe pai
    public PlanoPadrao (String nomeUsuario, String emailUsuario){
        super(nomeUsuario, emailUsuario);
    }
    //Construtor para iniciar a atribuição de dados
    public PlanoPadrao() {

    }
    //toString usado para exibição do usuario o valor retornado de seus dados
    @Override
    public String toString () {
        return "======== Plano Padrão selecionado =========" +
                "\nQualidade de video: " + qualidadeVideo +
                "\nQuantidade de tela: " + quantidadeTelas +
                "\nPermissao para baixar: " + (permissaoDeDownload ? "Permitido" : "Não permitido") +
                "\nUsuario cadastrado: " + getNomeUsuario() +
                "\nEmail registrado: " +getEmailUsuario() +
                String.format("\nPreço do plano: R$ %.2f", precoBase) +
                "\n======== // ================= // =========";

    }
}
