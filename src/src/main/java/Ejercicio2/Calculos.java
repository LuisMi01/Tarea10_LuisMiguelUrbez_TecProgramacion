package Ejercicio2;

public interface Calculos {
    public int suma( ) throws DesbordaCapacidadExcepcion;
    public int resta() throws DesbordaCapacidadExcepcion;
    public int multiplicacion() throws DesbordaCapacidadExcepcion;
    public int division() throws DesbordaCapacidadExcepcion;
    public void preguntar() throws DesbordaCapacidadExcepcion;
    public int resto() throws DesbordaCapacidadExcepcion;
}
