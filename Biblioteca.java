/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.Scanner;

public class Biblioteca {
    
    public static void main(String[] args) {


        
Scanner lista = new Scanner(System.in);
        System.out.println("""
                           Hola Nuevo Usuario
                            porfavor ingrese el numero de identificador del libro
                            el identidificador es del 1 al 5""");
int numerolibro = lista.nextInt();
Scanner chances = new Scanner(System.in);
        System.out.println("Porfavor ingrese cuantos libros lleva prestados"
                + " recuerde que tiene maximo 3 libros para tener prestados");
int intentos = chances.nextByte();
if (intentos > 0 && intentos <= 2){
    
if (numerolibro == 1){
libro mano = new libro("Brayan Risas",
        "Guatemala",
        "20/03/2003",
        "Los tres caballos",
        "cuento infantil",
        "EA libros",
        "20/01/2022",
        "1"
,"en reparacion");
mano.mostrar();    
}
else if (numerolibro == 2){
    libro mano = new libro("Risas Maria",
        "Guatemala",
        "20/02/2002",
        "Harry popoter y la hierba filosofal",
        "Historia de accion",
        "EA libros",
        "20/01/2023",
        "2",
    "con retraso");
mano.mostrar();    
}
else if (numerolibro == 3){
    libro mano = new libro("Samuel Marcos",
        "Mexico",
        "10/04/2000",
        "La Rata",
        "Historia de terror",
        "Apex libros",
        "10/01/2022",
        "3"
    ,"prestada");
mano.mostrar();    
}
else if (numerolibro == 4){
    libro mano = new libro("Miguel Nehemias",
        "Venezuela",
        "20/03/2003",
        "Medicamentos caseros",
        "Medicina",
        "Rucus libros",
        "20/01/2018",
        "4",
    "en reparacion");
mano.mostrar();    
}
else if (numerolibro == 5){
    libro mano = new libro("Juan Newton",
        "Peru",
        "10/03/2023",
        "El pollo salvaje de las montañas",
        "cuento",
        "Maria Libros",
        "20/12/2023",
        "5",
    "prestada");
mano.mostrar();    
}
else if (numerolibro<0){
    System.out.println("Usuario metio un identificador incorrecto");
}
else if (numerolibro>5){
        System.out.println("Usuario metio un identificador incorrecto");

}
System.out.println("""
                           Cada libro se presta un maximo de 30 dias, por cada
                           dia de retraso, se impone una multa de dos dias sin posibilidad de agarrar
                           un nuevo libro.""");
}
else if(intentos>=3){
    System.out.println("Lo lamento no se encuentra en el limite adecuado, o ya no puede prestar otro libro");
System.out.println("""
                           Cada libro se presta un maximo de 30 dias, por cada
                           dia de retraso, se impone una multa de dos dias sin posibilidad de agarrar
                           un nuevo libro.""");
}
        
    }
}
