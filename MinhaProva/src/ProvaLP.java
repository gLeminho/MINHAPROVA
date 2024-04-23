import java.util.ArrayList;
import java.util.Scanner;

public class ProvaLP {
    public static void main(String[] args){
        cadastro();
        //votos();
    }


    public static  void cadastro() {
        ArrayList<Jogadores> jogadores = new ArrayList<Jogadores>();

        Jogadores objJOogador = new Jogadores("Alane Dias");
        Jogadores objJOogador2 = new Jogadores("Beatriz Reis");
        Jogadores objJOogador3 = new Jogadores("Davi Brito");
        Jogadores objJOogador4 = new Jogadores("Deniziane Ferreira");
        Jogadores objJOogador5 = new Jogadores("Fernanda Bande");
        Jogadores objJOogador6 = new Jogadores("Giovanna Lima");
        Jogadores objJOogador7 = new Jogadores("Giovanna Pitel");
        Jogadores objJOogador8 = new Jogadores("Isabelle Nogueira");
        Jogadores objJOogador9 = new Jogadores("Juninho");
        Jogadores objJOogador10 = new Jogadores("Leidy Elin");
        Jogadores objJOogador11 = new Jogadores("Lucas Henrique");
        Jogadores objJOogador12 = new Jogadores("Lucas Luigi");
        Jogadores objJOogador13 = new Jogadores("Lucas Pizane");
        Jogadores objJOogador14 = new Jogadores("Marcus Vinicius");
        Jogadores objJOogador15 = new Jogadores("Matteus Amaral");
        Jogadores objJOogador16 = new Jogadores("Maycon Cosmer");
        Jogadores objJOogador17 = new Jogadores("MC Bin Laden");
        Jogadores objJOogador18 = new Jogadores("Michel Nogueira");
        Jogadores objJOogador19 = new Jogadores("Nizam");
        Jogadores objJOogador20 = new Jogadores("Raquele Cardozo");
        Jogadores objJOogador21 = new Jogadores("Rodriguinho");
        Jogadores objJOogador22 = new Jogadores("Thalyta Alves");
        Jogadores objJOogador23 = new Jogadores("Vanessa Lopes");
        Jogadores objJOogador24 = new Jogadores("Vinicius Rodrigues");
        Jogadores objJOogador25 = new Jogadores("Wanessa Camargo");
        Jogadores objJOogador26 = new Jogadores("Yasmin Brunet");

        jogadores.add(objJOogador);
        jogadores.add(objJOogador2);
        jogadores.add(objJOogador3);
        jogadores.add(objJOogador4);
        jogadores.add(objJOogador5);
        jogadores.add(objJOogador6);
        jogadores.add(objJOogador7);
        jogadores.add(objJOogador8);
        jogadores.add(objJOogador9);
        jogadores.add(objJOogador10);
        jogadores.add(objJOogador11);
        jogadores.add(objJOogador12);
        jogadores.add(objJOogador13);
        jogadores.add(objJOogador14);
        jogadores.add(objJOogador15);
        jogadores.add(objJOogador16);
        jogadores.add(objJOogador17);
        jogadores.add(objJOogador18);
        jogadores.add(objJOogador19);
        jogadores.add(objJOogador20);
        jogadores.add(objJOogador21);
        jogadores.add(objJOogador22);
        jogadores.add(objJOogador23);
        jogadores.add(objJOogador24);
        jogadores.add(objJOogador25);
        jogadores.add(objJOogador26);

    }

    public void votos() {
        Scanner scn = new Scanner(System.in);

        String nome2 = String.valueOf(new Jogadores(""));

        do {
            System.out.println("Digite o nome da pessoa para receber o voto para sair digite sair");
            nome2 = scn.nextLine();




        } while (!nome2.equals("sair"));



    }



    public static void apurar(){


    }








}