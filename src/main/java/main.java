
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar Tamaño Camión:");
        int tamanioCamion = sc.nextInt();

        if (tamanioCamion > 0) {
            System.out.println("Ingresar Cantidad de Paquetes:");
            int cantPaquetes = sc.nextInt();
            List<Integer> paquetes = new ArrayList<>();

            for (int i = 0; i < cantPaquetes; i++) {
                System.out.println("Ingresar Paquete Número " + (i+1) + ":");
                int paquete = sc.nextInt();
                paquetes.add(paquete);
            }

            System.out.println("Paquetes: " + paquetes);

            List<Integer> resultado = new ArrayList<>();

            for (int i = 0; i < paquetes.size(); i++) {
                int num1 = paquetes.get(i);

                for (int j = 0; j < paquetes.size(); j++) {
                    if (j != i) {
                        int num2 = paquetes.get(j);

                        if (tamanioCamion - (num1 + num2) == 30) {
                            resultado.add(num1);
                            resultado.add(num2);
                            break;
                        }
                    }
                }

                if (resultado.size() == 2) {
                    break;
                }
            }

            System.out.println("\nResultado: " + resultado);
        }
    }
}
