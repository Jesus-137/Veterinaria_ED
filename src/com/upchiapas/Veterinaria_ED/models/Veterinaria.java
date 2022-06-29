package com.upchiapas.Veterinaria_ED.models;

import java.util.Objects;
import java.util.Scanner;

public class Veterinaria {
    Scanner entrada=new Scanner(System.in);
    public Mascota [] listaMascota;
    private Mascota mascota;
    public void registarMascota(){
        int opcion;
        do {
            System.out.println("Ingrese la cantidad de mascotas que desea ingresar");
            opcion = entrada.nextInt();
        }while (opcion>5);
        listaMascota=new Mascota[opcion];
        for (int i=0; i<opcion;i++) {
            mascota=new Mascota();
            System.out.println("Ingrese el nombre de la mascota");
            mascota.setNombre(entrada.next());
            do {
                System.out.println("Ingrese el tipo de mascota");
                mascota.setTipo(entrada.next());
            } while (!Objects.equals(mascota.getTipo(), "Gato") && !Objects.equals(mascota.getTipo(), "Perro"));
            do {
                System.out.println("Ingrese el id de la mascota");
                mascota.setId(entrada.nextInt());
            } while (mascota.getId() < 1000 || mascota.getId() > 9999);
            listaMascota[i] = mascota;
        }
    }
    public void ordenarDatos(){
        Mascota aux;
        for (int i=0; i<listaMascota.length;i++)
            for (int j=i+1; j<listaMascota.length;j++)
                if (listaMascota[i].getId()>listaMascota[j].getId()){
                    aux=listaMascota[i];
                    listaMascota[i]=listaMascota[j];
                    listaMascota[j]=aux;
                }
    }
    public void visualizarMascotas(){
        for (int i=0;i<listaMascota.length;i++){
            System.out.println(i+1+" Nombre: "+listaMascota[i].getNombre()+"\nTipo de mascota: "+listaMascota[i].getTipo());
        }
    }
}
