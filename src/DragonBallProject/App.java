package DragonBallProject;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GerenciadorGuerreiros gerenG = new GerenciadorGuerreiros();
        Luta luta = new Luta();

        // Guerreiros padrão pré-cadastrados
        Sayajin sj01 = new Sayajin("Goku", 1000, 10, 50, 50, 50, 0);
        Sayajin sj02 = new Sayajin("Vegeta", 1000, 15, 50, 45, 45, 0);
        FreezaClan fz01 = new FreezaClan("Freeza", 900, 20, 50, 40, 40, 0);
        Humano hm01 = new Humano("Kuririn", 500, 10, 30, 50, 40);

        // Adicionando guerreiros na lista
        gerenG.addGuerreiro(sj01);
        gerenG.addGuerreiro(sj02);
        gerenG.addGuerreiro(fz01);
        gerenG.addGuerreiro(hm01);

        Scanner sc = new Scanner(System.in);

        gerenG.imprimirTodos();
        
        System.out.println("\nBuscar guerreiro: ");
        gerenG.buscarGuerreiro(sc.next());

        System.out.println("\nRemover guerreiro: ");
        if ( gerenG.removerGuerreiro(sc.next()) ) {
            System.out.println("Guerreiro removido!");
        } else {
            System.out.println("Guerreiro não encontrado");
        }

        System.out.println("\nBuscar guerreiro: ");
        

        if ( ! gerenG.buscarGuerreiro(sc.next()) ) {
            System.out.println("Guerreiro não encontrado");
        }
        
        gerenG.imprimirTodos();

/*       
        String nome01 = sc.next("Nome do primeiro guerreiro: ");
        String nome02 = sc.next("Nome do segundo guerreiro: ");
        if (luta.selecionarConfronto(nome01, nome02)) {
            luta.iniciarLuta();
        }
 */



        sc.close();
    }
    
}