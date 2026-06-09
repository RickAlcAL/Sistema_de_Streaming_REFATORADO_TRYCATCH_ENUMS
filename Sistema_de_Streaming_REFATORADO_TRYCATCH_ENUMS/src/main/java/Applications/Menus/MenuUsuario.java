package Applications.Menus;

import Entities.Emuns.Avisos;
import Entities.PlanoPadrao.PlanoPadrao;
import Entities.PlanoPremiun.PlanoPremiun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUsuario {

    public void menuInterface () {
        //Instanciando as subclasses
        PlanoPadrao pD = new PlanoPadrao();
        PlanoPremiun pP = new PlanoPremiun();
        Scanner sc = new Scanner(System.in);
        boolean confirmacao = false;
        //instanciando as variaveis que serão modificadas no fluxo do sistema
        String receberNomeUsuario = "";
        String receberEmailUsuario = "";
        do {
            System.out.println("Boas vindas ao serviço de streaming SenaiCinematics");
            try {
                //Usando o try para capturar exeções do usuario
                System.out.println("Insira seu nome: ");
                receberNomeUsuario = sc.nextLine().trim();
                //Verificando se esta vazio
                if (receberNomeUsuario.isEmpty()){
                    System.out.println(Avisos.ERRO.getMensagemUsuario());
                }
                //Atribuindo valor com o set nas 2 subclasses
                pD.setNomeUsuario(receberNomeUsuario);
                pP.setNomeUsuario(receberNomeUsuario);
                System.out.println(Avisos.CONFIRMADO.getMensagemUsuario());
                System.out.println("Digite seu email: ");
                receberEmailUsuario = sc.nextLine().trim();
                //Verificando se está vazio
                if (receberEmailUsuario.isEmpty() || !receberEmailUsuario.contains("@") ){
                    System.out.println(Avisos.ERRO.getMensagemUsuario());
                }
                pD.setEmailUsuario(receberEmailUsuario);
                pP.setEmailUsuario(receberEmailUsuario);
                System.out.println(Avisos.CONFIRMADO.getMensagemUsuario());
                confirmacao = true;
            } catch (IllegalArgumentException e) {
                System.out.println(Avisos.ERRO.getMensagemUsuario());
            }
        }while (!confirmacao);


        char resp = '0';
        do {
            try {
                System.out.println("Digite o seu plano que desejas");
                System.out.println("1. Plano Padrão");
                System.out.println("2. Plano Premium");
                System.out.println("0. Para sair");
                resp = sc.next().charAt(0);

                switch (resp){
                    case '1':
                        System.out.println(pD.toString());
                        break;
                    case '2':
                        System.out.println(pP.toString());
                        break;
                    case '0':
                        System.out.println(Avisos.FINALIZADO.getMensagemUsuario());
                        break;
                    default:
                        System.out.println(Avisos.ERRO.getMensagemUsuario());
                }
            } catch (InputMismatchException e) {
                System.out.println(Avisos.ERRO.getMensagemUsuario());
            }

        }while (resp != '1' && resp != '2' && resp != '0');

    }
}
