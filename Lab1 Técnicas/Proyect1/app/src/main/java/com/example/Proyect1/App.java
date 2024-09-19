package com.example.Proyect1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Queuee cola = new Queuee();
        cola.fillQueues();
        Queue<Article> shampoos = cola.getCategory1();
        Queue<Article> ceras = cola.getCategory2();
        Queue<Article> cremas = cola.getCategory3();
        Queue<Article> planchas = cola.getCategory4();
        Queue<Article> secadores = cola.getCategory5();

        String option = "";
        int valor = 0;
        int articulos[] = {0, 0, 0, 0, 0};
        Queue<Article> compras = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        while (!option.equals("6")) {
            System.out.println("========================================================");
            System.out.println("Seleccione una opcion:");
            System.out.println("");
            System.out.println("1. Comprar shampoo");
            System.out.println("2. Comprar cera para peinar");
            System.out.println("3. Comprar crema humectante");
            System.out.println("4. Comprar plancha para cabello");
            System.out.println("5. Comprar secador de pelo");
            System.out.println("6. Finalizar");
            System.out.println("");
            System.out.println("========================================================");
            System.out.print("Opcion: ");
            option = sc.next();

            switch (option) {
                case "1":
                    Article shampoo = shampoos.remove();
                    valor += shampoo.getPrice();
                    compras.add(shampoo);
                    System.out.println("Agregaste 1 shampoo a la lista");
                    System.out.println("");
                    articulos[0]++;
                    break;
                case "2":
                    Article cera = ceras.remove();
                    valor += cera.getPrice();
                    compras.add(cera);
                    System.out.println("Agregaste 1 cera a la lista");
                    System.out.println("");
                    articulos[1]++;
                    break;
                case "3":
                    Article crema = cremas.remove();
                    valor += crema.getPrice();
                    compras.add(crema);
                    System.out.println("Agregaste 1 crema a la lista");
                    System.out.println("");
                    articulos[2]++;
                    break;
                case "4":
                    Article plancha = planchas.remove();
                    valor += plancha.getPrice();
                    compras.add(plancha);
                    System.out.println("Agregaste 1 plancha a la lista");
                    System.out.println("");
                    articulos[3]++;
                    break;
                case "5":
                    Article secador = secadores.remove();
                    valor += secador.getPrice();
                    compras.add(secador);
                    System.out.println("Agregaste 1 secador a la lista");
                    System.out.println("");
                    articulos[4]++;
                    break;
                case "6":
                    System.out.println("");
                    System.out.println("========================================================");
                    System.out.println("Reporte de ventas:");
                    System.out.println("");
                    long valorShampoos = (long) shampoos.element().getPrice() * shampoos.size();
                    long valorCremas = (long) cremas.element().getPrice() * cremas.size();
                    long valorCeras = (long) ceras.element().getPrice() * ceras.size();
                    long valorPlanchas = (long) planchas.element().getPrice() * planchas.size();
                    long valorSecadores = (long) secadores.element().getPrice() * secadores.size();
                    System.out.println("Shampoos en inventario: " + shampoos.size() + " por un valor total de: $" + valorShampoos);
                    System.out.println("Ceras en inventario: " + ceras.size() + " por un valor total de: $" + valorCeras);
                    System.out.println("Cremas en inventario: " + cremas.size() + " por un valor total de: $" + valorCremas);
                    System.out.println("Planchas en inventario: " + planchas.size() + " por un valor total de: $" + valorPlanchas);
                    System.out.println("Secadores en inventario: " + secadores.size() + " por un valor total de: $" + valorSecadores);
                    System.out.println("");
                    System.out.println("Shampoos vendidos: " + articulos[0]);
                    System.out.println("Ceras vendidas: " + articulos[1]);
                    System.out.println("Cremas vendidas: " + articulos[2]);
                    System.out.println("Planchas vendida: " + articulos[3]);
                    System.out.println("Secadores vendidos: " + articulos[4]);
                    System.out.println("");
                        System.out.println("Articulos comprados:");
                    while (!compras.isEmpty()) {
                        System.out.println(compras.element().getCategory() + " " + compras.element().getDescription());
                        compras.remove();
                    }
                    System.out.println("");
                    System.out.println("Valor articulos vendidos: $" + valor);
                    long articulosPendientes = valorShampoos + valorCremas + valorCeras + valorPlanchas + valorSecadores;
                    System.out.println("Valor articulos por vender: $" + articulosPendientes);
                    System.out.println("Diferencia: $" + (articulosPendientes - valor));
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion entre 1 y 6");
                    break;
            }

        }
    }
}
