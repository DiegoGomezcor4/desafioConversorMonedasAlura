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
            }

        }
    }
}