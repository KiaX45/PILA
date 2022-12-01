package Pila;

import javax.swing.JOptionPane;

public class PilaArreglo
{
    public static PilaArray Pila;

    public static void main(String[] ARGUMENTOS)
    {
        int MAX;

        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA PILA"));
        Pila = new PilaArray(MAX);

        MenuPila();
    }

    public static void MenuPila()
    {
        int Opcion;

        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                            "2. SACAR DATOS\n"+
                            "3. LISTAR PILA\n"+
                            "4. VACIAR PILA\n"+
                            "5. BUSCAR DATO\n"+
                            "6. SALIR\n"+
                            "--------------------------------------------------------\n"+
                            "INGRESE LA OPCION [1 - 6]","MENU PILA",JOptionPane.QUESTION_MESSAGE));

            switch(Opcion)
            {
                case 1: Pila.InsertarPila();break;
                case 2: Pila.EliminarPila();break;
                case 3: Pila.MostrarPila();break;
                case 4: Pila.VaciarPila();break;
                case 5: Pila.BuscarDato();break;
                case 6: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}