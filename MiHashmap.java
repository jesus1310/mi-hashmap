import java.util.Arrays;

/**
 * Write a description of class MiHashmap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashmap
{
    // Array para almacenar las claves
    private String[] claves;
    // Array para almacenar los valores
    private int[] valores;

    /**
     * Constructor for objects of class MiHashmap
     */
    public MiHashmap()
    {
        claves = new String[0];
        valores = new int[0];
    }

    /**
     * Método para añadir claves y valores
     */
    public int put(String clave,int valor){
        int indice = 0;
        boolean repetida = false;
        while (indice<claves.length && !repetida ) {
            if (clave.equals(claves[indice])) {
                repetida = true;
                valores[indice] = valor;
            }
            indice++;
        }
        if (!repetida) {
            indice = -1;
            int cont = 0;
            String[] tempClaves = new String[claves.length + 1];
            int[] tempValores = new int[valores.length + 1];
            for (cont=0;cont<claves.length;cont++) {
                tempClaves[cont] = claves[cont];
                tempValores[cont] = valores[cont];
            }
            tempClaves[tempClaves.length - 1] = clave;
            tempValores[tempValores.length - 1] = valor;
            claves = tempClaves;
            valores = tempValores;
        }
        return indice;
    }
    
    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave){
        int valorDevuelto = -1;
        int indice = 0;
        boolean encontrado = false;
        while (indice<claves.length && !encontrado ) {
            if (clave.equals(claves[indice])) {
                encontrado = true;
                valorDevuelto = valores[indice];
            }
            indice++;
        }
        return valorDevuelto;
    }
}

