package exceptions;

import javax.swing.*;

public class UncheckedExcepetions {

    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro");
                //e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero");
            } finally {
                System.out.println("Chegou ao Finally");
            }
        } while (continueLooping);
        
        System.out.println("O Código continua...");
    }

    public static int dividir(int a, int b) { return a / b;}
}
