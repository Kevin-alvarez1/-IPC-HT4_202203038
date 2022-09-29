/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.Scanner;


public class Empresa {


    public static void main(String[] args) {
    System.out.println("""
                           porfavor ingrese el numero 2 
                            para confirmar que quiere ver la lista
                           de empleados""");
Scanner verificacion = new Scanner(System.in);
int reviso = verificacion.nextInt();
    
if(reviso == 2){
clientes mano = new clientes(
        "juan pablo",
        "21",
        "10000",
        "Directivo",
        "2",
        "mario perez",
        "23",
        "23145123"
);
mano.mostrar();    
clientes man = new clientes(
        "pablo perez",
        "23",
        "6000",
        "subordinado",
        "0",
        "mario rivera",
        "18",
        "82934910"
);
man.mostrar();   
clientes ma = new clientes(
        "Manu Mar",
        "30",
        "2000",
        "subordinado",
        "0",
        "Felipe Cuarz",
        "23",
        "89890101"
);
ma.mostrar();   
clientes m = new clientes(
        "Maria Jose",
        "19",
        "20000",
        "Directivo",
        "3",
        "Juana maria",
        "20",
        "21213020"
);
m.mostrar();   
clientes mas = new clientes(
        "Jose Maria",
        "50",
        "20000",
        "Directivo",
        "5",
        "Rivera Karla",
        "30",
        "50504021"
);
mas.mostrar();   
}
else 
{
    System.out.println("No ingreso el numero 2");
}
        System.out.println("Nose porque se corrieron los datos hacia abajo");
    
}
}
