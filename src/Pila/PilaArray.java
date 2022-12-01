package Pila;

import javax.swing.JOptionPane;

public class PilaArray {
    int[] PILA;
    int TOPE;
    int MAX;

    public PilaArray() {
        this.TOPE = 0;
        this.MAX = 100;
        this.PILA = new int[this.MAX + 1];
    }

    public PilaArray(int MAX) {
        this.TOPE = 0;
        this.MAX = MAX;
        this.PILA = new int[this.MAX + 1];
    }

    public int GetTOPE() {
        return TOPE;
    }

    public void VaciarPila() {
        for (int i = 0; i < PILA.length; i++) {
            PILA[i] = 0;
        }
        this.TOPE = 0;
    }

    public boolean IsPilaLlena() {
        if (this.MAX == this.TOPE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsPilaVacia() {
        if (this.TOPE == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarPila() {
        if (this.IsPilaLlena()) {
            JOptionPane.showMessageDialog(null, "LA PILA ESTA LLENA");
        } else {
            int ITEM;
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null, "NUEVO DATO: "));
             if(this.Repetido(ITEM)== false){
                 this.TOPE++;
                 this.PILA[this.TOPE] = ITEM;
                 JOptionPane.showMessageDialog(null, "EL ITEM " + ITEM + " SE INSERTO A LA PILA");
             }else{
                 JOptionPane.showMessageDialog(null, "EL ITEM " + ITEM + " YA SE ENCUENTRA DENTRO DE LA PILA");

             }

        }
    }

    public boolean Repetido(int item){
        for (int i = 0; i < PILA.length; i++) {
            if(PILA[i] == item){
                return true;
            }
        }

        return false;
    }

    public void EliminarPila() {
        if (this.IsPilaVacia()) {
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
        } else {
            int ITEM = this.PILA[this.TOPE];
            PILA[this.TOPE] = 0;
            this.TOPE--;

            JOptionPane.showMessageDialog(null, "EL ITEM " + ITEM + " SE ELIMINO DE LA PILA");
        }
    }

    public void MostrarPila() {
        if (this.IsPilaVacia()) {
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA\n NO HAY DATOS QUE MOSTRAR", "MOSTRAR DATOS", JOptionPane.WARNING_MESSAGE);
        } else {
            int i;
            String MOSTRAR = "";

            for (i = this.TOPE; i >= 1; i--) {
                MOSTRAR = MOSTRAR + this.PILA[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "TOTAL ES : " + this.TOPE + "\n" + "LOS DATOS DE LA PILA SON : \n" + MOSTRAR, "MOSTRAR DATOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void BuscarDato() {
        if (this.IsPilaVacia()) {
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA\n NO HAY DATOS QUE MOSTRAR", "MOSTRAR DATOS", JOptionPane.WARNING_MESSAGE);
        } else {
            int ITEM;
            int count = 0;
            String posiciones = "";
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null, "DATO PARA BUSCAR: "));

            for (int i = 0; i < PILA.length; i++) {
                if (PILA[i] == ITEM) {
                    count++;
                    posiciones += "," + i;
                }
            }

            if(count != 0){
                JOptionPane.showMessageDialog(null, "EL DATO " + ITEM + "SE ENCUENTRA UN TOTAL DE: " + count + "VECES"
                                                                          +"\nESTE SE ENCUENTRA EN LAS SIGUIENTES POSICIONES: " + posiciones, "MOSTRAR DATO", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "EL DATO " + ITEM + "NO SE ENCUENTRA EN EL ARREGLO", "MOSTRAR DATO", JOptionPane.WARNING_MESSAGE);

            }


        }


    }
}

