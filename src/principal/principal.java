package principal;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {

        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();

        while(true){
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda","Conversor de Temperatura"},"Seleccion")).toString();
            switch (opciones){
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad a convertir: ");
                    if (Validar(input) == true){
                        double Minput = Double.parseDouble((input));
                        monedas.ConvertirMonedas(Minput);
                    }
                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(Validar(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if((respuesta == 0) && (Validar(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }

        }
    }

    public static boolean Validar(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}