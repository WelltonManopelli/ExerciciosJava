package br.com.java.exercicio1;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {

        String nome;

        nome= JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
        
    }
}
