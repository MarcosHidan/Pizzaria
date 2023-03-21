package br.newtonpaiva;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String op = JOptionPane.showInputDialog("Informe seu pedido pelo número correspondente: " + "1-br.newtonpaiva.Hamburguer " + "2-br.newtonpaiva.Pizza " + "3-Sair ");

        if (op.equals("1")) {
            String preco = JOptionPane.showInputDialog("Digite um valor");
            Double preco01 = Double.parseDouble(preco);

            String pergunta = JOptionPane.showInputDialog("Artezanal? " + "SIM/NÃO");
            if (pergunta.equals("sim")) {
                Hamburguer hb = new Hamburguer();
                System.out.println(nome + "  " + "O seu pedido ficou no valor de: " + hb.calcular(preco01) + " Reais");
            }
            else
                System.out.println(nome + "  " + "O seu pedido ficou no valor de: " + preco01 + " Reais");
        } else if (op.equals("2")) {
            String preco = JOptionPane.showInputDialog("Digite um valor");
            Double preco01 = Double.parseDouble(preco);

            String pergunta = JOptionPane.showInputDialog("Deseja borda? " + "SIM/NÃO");
            if (pergunta.equals("sim")) {
                Pizza p = new Pizza();
                System.out.println(nome + "  " + "O seu pedido ficou no valor de: " + p.calcular(preco01) + " Reais");
            }
            else
                System.out.println(nome + "  " + "O seu pedido ficou no valor de: " + preco01 + " Reais");
        }
    }
}
