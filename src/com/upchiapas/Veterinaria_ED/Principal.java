package com.upchiapas.Veterinaria_ED;

import com.upchiapas.Veterinaria_ED.models.Veterinaria;

import java.util.Scanner;

public class Principal {
    private static Veterinaria veterinaria=new Veterinaria();
    private static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args){
        int opcion;
        do {
            System.out.println("|---------Menu---------|");
            System.out.println("|-1_Registrar mascota--|");
            System.out.println("|-2_Ordenar datos------|");
            System.out.println("|-3_Visualisar mascotas|");
            System.out.println("|-4_Salir--------------|");
            System.out.println("|----------------------|");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    veterinaria.registarMascota();
                    break;
                case 2:
                    veterinaria.ordenarDatos();
                    break;
                case 3:
                    veterinaria.visualizarMascotas();
                    break;
                case 4:
                    System.out.println("Gracias por la confianza asta luego");
                    break;
                default:
                    System.out.println("Valor no valido elija una opcion del menu");
            }
        }while (opcion!=4);
    }
}
