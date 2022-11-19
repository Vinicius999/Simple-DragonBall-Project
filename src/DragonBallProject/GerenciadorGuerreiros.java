package DragonBallProject;

import java.util.ArrayList;

public class GerenciadorGuerreiros {
    ArrayList<Guerreiro> lista = new ArrayList<Guerreiro>();

    // Getters e Setters
    public ArrayList<Guerreiro> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Guerreiro> lista) {
        this.lista = lista;
    }

    public void addGuerreiro(Guerreiro g) {
        for (Guerreiro guerreiro: lista) {
            if (g.getNome() == guerreiro.getNome()) {
                System.out.println("Já há um guerreiro chamado "+g.getNome());
                break;
            }
        }
        lista.add(g);
    }

    public void removerGuerreiro(String nome) {
        for (Guerreiro g: lista) {
            if (nome == g.getNome()) {
                lista.remove(g);
                return;
            }
        }
        System.out.println("Guerreiro não encontrado");
    }
    
    // Implementar futuramente
    public void treinar(String nome, int dias) {
        for (Guerreiro g: lista) {
            if (nome == g.getNome()) {
                System.out.println("Alguma coisa");
                
            }
        }
        System.out.println("Guerreiro não encontrado");
    } 

    public void buscarGuerreiro(String nome) {
        for (Guerreiro g: lista) {
            System.out.println(nome.toUpperCase() +" vs "+g.getNome().toUpperCase());
            if ( nome.toUpperCase() == g.getNome().toUpperCase() ) {
                System.out.println(g.imprimir());
                return;
            }
        } 
        System.out.println("Não há um guerreiro chamado "+ nome);
    }

    public void imprimirTodos() {
        for (Guerreiro g: lista) {
            System.out.println("Nome do Guerreiro: "+ g.getNome()
            + "\nAtaque: "+ g.getAtk());
        }
    }
}
