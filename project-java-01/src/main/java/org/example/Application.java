package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Indique o dia (1 a 7): ");

        int diaMes = leitor.nextInt();
        String nomeDia = null;

        switch (diaMes) {
                case 1:
                nomeDia = "Domingo";
                break;
                case 2:
                nomeDia = "Segunda";
                break;
                case 3:
                nomeDia = "Terça";
                break;

                case 4:
                nomeDia = "Quarta";
                break;

                case 5:
                nomeDia = "Quinta";
                break;

                case 6:
                nomeDia = "Sexta";
                break;

                case 7:
                nomeDia = "Sábado";
                break;
        }

        System.out.println("Hoje é: " + nomeDia);
        leitor.close();
    }
}
