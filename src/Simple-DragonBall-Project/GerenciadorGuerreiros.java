package DragonBallProject;

import java.util.ArrayList;

public class GerenciadorGuerreiros {
    ArrayList<Guerreiro> lista = new ArrayList<Guerreiro>();

    public void addGuerreiro(Guerreiro g) {
        for (Guerreiro guerreiro: lista) {
            if (g.getNome() == guerreiro.getNome()) {
                System.out.println("Matrícula já existente.");
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
    
    public void treinar(String nome, int dias) {
        for (Guerreiro g: lista) {
            if (nome == g.getNome()) {
                //f.realizarPagamento(cargaHoraria, mes, ano, descricao);
                return;
            }
        }
        System.out.println("A matrícula informada não existe");
    } 

    public void buscarGuerreiro(String nome) {
        for (Guerreiro g: lista) {
            if (nome == g.getNome()) {
                //System.out.println(g.imprimir()); 
            }
        }
        System.out.println("A matrícula informada não existe");
    }

    public void imprimirTodos() {
        for (Guerreiro g: lista) {
            System.out.println("Nome do Guerreiro:"+ g.getNome()
            + "\nAtaque: "+ g.getAtk());
            System.out.println("\n");
        }
    }
}
