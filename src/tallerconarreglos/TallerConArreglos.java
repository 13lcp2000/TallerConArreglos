package tallerconarreglos; //aqui creo el paquete (carpeta) que contendra mis clases y demas documentos 

import java.util.Random; //aqui estoy importando o pegando e codigo de toda la clase Random que voy a necesitar para resolver este taller y reutilizar asi el codigo de esa clase
import javax.swing.JOptionPane; //aqui estoy importando o pegando e codigo de toda la clase JOptionPane que voy a necesitar para reutilizar asi el codigo de esa clase.

public class TallerConArreglos {//aqui se esta iniciando la clase que contendra todo el codigo de esta aplicacion

    /*
            Realizar un proyecto en java que cree un arreglo unidimencional de 
            20 posiciones , el cual a de contener numeros aleatorios generado por la clase random
            Mostrar por pantalla el arreglo generado y ordenado de mayor a menor
    
        */
    public static void main(String[] args) { //aqui es donde llamo a los otros metodos que necesito para poder ejecutar el programa

        JOptionPane.showMessageDialog(null, "Programa que construye un arreglo unidimensional \n y lo rellena automaticamente"); 
        /*como vamos a pedir una entrada por teclado entonces lo que hacemos es llamar a la clase JOptionPane para 
                   que nos ayude a pedir los datos por teclado de una manera mas sencilla*/
        
        int ni = Integer.parseInt(JOptionPane.showInputDialog("numero inicial del intervalo")); //aqui estamos demarcando desde donde iniciaremos nuestros numeros aleatorios 
        int nf = Integer.parseInt(JOptionPane.showInputDialog("numero final del intervalo")); //aqui estamos delimitando el tope maximo de los numeros aleatorios que se  elegirán
        int[] arregloMain = ordenamientoBurbuja(llenarArrayAleatorio(ni, nf));
        /*
                    en esta parte lo que se esta haciendo es creando un nuevo arreglo ( int[] arregloMain ) que contendra a su vez el resultado de aver 
                   instanciado dentro de ese mismo metodo, (cual metodo?  el metodo de ordenamientoBurbuja)  a otro metodo que se encarga de llenarme 
                   el arreglo aleatoreamente llamado (llenarArrayAleatorio(ni, nf))
                */
        
        for(int num: arregloMain){ // este pequeño bloque de codigo lo que hace es que va amostrarme el arreglo que ya ordene previamente, diciendo que para cada numero dentro del arreglo "arregloMain" ejecute un comprtamiento que esta debajo en el ciclo for
            System.out.print(num + " "); // el comportamiento lo que hace es mostrar por pantalla el numero mas un espacio para que se pueda diferencia los diferentes numeros.
        }//fin "for"
            
        
    }

    public static int[] llenarArrayAleatorio(int desde, int hasta) {// Este es el metodo de ordenamiento que en este caso es el de Burbuja.
        int[] numeros = new int[20]; //aqui lo que hacemos es delimitar de una vez al momento de instanciar el arreglo que tenga un tañamo de 20 numeros.
        Random rnd = new Random(); //aqui estamos instaciando un objeto de la clase Random que me permitira generar numeros aleatorios
        for (int i = 0; i < numeros.length; i++) { // aqui estamos declarando un for que utilize la propiedad length para ver el tamaño del arreglo y asi me puedan 
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde; // en esta parte del codigo generar numeros aleatorios desde el anterior inicio y tope declarado.
            
        }//fin "for"
        System.out.print(hasta - desde + 1);
        return numeros; // luego le digo que como el metodo entrega el arreglo ya organizado lo devualva ya para terminar y asi se finalice el metodo.
    }// fin metodo

    public static int[] ordenamientoBurbuja(int[] arreglo) { //y este es el ordenamiento burbuja...
        boolean intercambiado = true; // aqui creamos una variable que me servira para saber si se cambio o no la variable
        int j = 0; // luego aqui lo que haremos sera instanciar un indice que me permita controlar 
        int variableTemporal;
        while (intercambiado) { // preguntamos que mientras haya sido "intercambiado" el numero
            intercambiado = false; //que lo cambie a falso para controlar el intercambio y
            j++; // el indice del arreglo que se supone que "j" es el numero a cambiar por eso le digo, hey aumente el indice "j"
            for (int i = 0; i < arreglo.length - j; i++) { //luego de eso declaro un for que me permita, como antes mirar el tamaño del arreglo y controlar que no se salga
                if (arreglo[i] > arreglo[i + 1]) { // preguntamos aqui que si el siguiente numero (arreglo[i + 1])  es menor que el actual numero evaluado (arreglo[i])
                    variableTemporal = arreglo[i]; //entonces que lo que debe de hacer es poner el numero actual, en una variable temporal para poder efectuar el cambio.
                    arreglo[i] = arreglo[i + 1]; // y que el actual numero ahora pase a ser el que habia una posicion adelante de este el arreglo 
                    arreglo[i + 1] = variableTemporal; //y que la posicion que estaba delante del numero actualmente comparado este ahora en la variable temporal
                    intercambiado = true; //y decimos aqui que el cambio se efectuo y por eso cambiamos el estado de la variable a true,.
                }//fin "if"
            }//fin "for"
        }
        return arreglo; // aqui le decimos que como ya terminamos organizar el arreglo que lo devuelva como finalizacion para este metodo.
    }//fin metodo

}//fin clase
