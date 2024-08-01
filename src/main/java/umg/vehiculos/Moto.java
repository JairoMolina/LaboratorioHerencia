package umg.vehiculos;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = false;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }
}