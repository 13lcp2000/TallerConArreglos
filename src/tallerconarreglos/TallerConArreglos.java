package tallerconarreglos;

import java.util.Random;
import javax.swing.JOptionPane;

public class TallerConArreglos {

    /*
    
     Realizar un proyecto en java que cree un arreglo unidimencional de 
     20 posiciones , el cual a de contener numeros aleatorios generado por la clase random
     Mostrar por pantalla el arreglo generado y ordenado de mayor a menor
    
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Programa que construye un arreglo unidimensional \n y lo rellena automaticamente");
        int ni = Integer.parseInt(JOptionPane.showInputDialog("numero inicial del intervalo"));
        int nf = Integer.parseInt(JOptionPane.showInputDialog("numero final del intervalo"));
        int[] arregloMain = ordenamientoBurbuja(llenarArrayAleatorio(ni, nf));
        
        
        for(int num: arregloMain){
            System.out.print(num + " ");
        }
            
        
    }

    public static int[] llenarArrayAleatorio(int desde, int hasta) {
        int[] numeros = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }

        return numeros;
    }

    public static int[] ordenamientoBurbuja(int[] arreglo) {
        boolean intercambiado = true;
        int j = 0;
        int variableTemporal;
        while (intercambiado) {
            intercambiado = false;
            j++;
            for (int i = 0; i < arreglo.length - j; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    variableTemporal = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = variableTemporal;
                    intercambiado = true;
                }
            }
        }
        return arreglo;
    }

}
