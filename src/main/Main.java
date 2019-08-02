package main;

import static constantes.ParafiscalesString.*;
import impuestos.ParafiscalesLogicas;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args) {
        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);
        ParafiscalesLogicas parafiscalesLogicas = new ParafiscalesLogicas();

        String nombre = JOptionPane.showInputDialog(null, CC1.getValolar());

        String salario = JOptionPane.showInputDialog(null, CC2.getValolar());

        parafiscalesLogicas.setNombre(nombre);

        parafiscalesLogicas.setSalario(Double.parseDouble(salario));


        JOptionPane.showMessageDialog(null, C1.getValolar() + parafiscalesLogicas.getNombre() + "\n" +
                C2.getValolar()+ formateador.format(parafiscalesLogicas.getSalario()) + "\n" +
                C3.getValolar() + formateador.format(parafiscalesLogicas.caluclarPension()) + "\n" +
                C4.getValolar() + formateador.format(parafiscalesLogicas.calcularSalud()) + "\n" +
                C5.getValolar() + formateador.format(parafiscalesLogicas.totalSalario()));
    }

}
