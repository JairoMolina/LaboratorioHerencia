package umg;

import umg.lab.Conductor_Coche;
import umg.lab.Conductor_Moto;
import umg.vehiculos.Coche;
import umg.vehiculos.Moto;
import umg.vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo toyota = new Coche("Toyota", "Corolla", 2020, 5);
        toyota.mostrarDetalles();

        Vehiculo yamaha = new Moto("Yamaha", "MT-07", 2021, true);
        yamaha.mostrarDetalles();

        Conductor_Coche conductorDeCoche = new Conductor_Coche("Jairo Molina", "777omg", 30);
        conductorDeCoche.mostrarInformacion();

        Conductor_Moto conductorDeMoto = new Conductor_Moto("Naser Martinez", "888omg", true);
        conductorDeMoto.mostrarInformacion();
    }
}