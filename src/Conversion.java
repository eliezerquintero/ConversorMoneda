public class Conversion {
    String monedaOrigen;
    String monedaDestino;
    double cantidad;
    public Conversion(String monedaOrigen, String monedaDestino){
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }
    public Conversion(){};
    public double RealizaroConversion(double cantidad){
        double tasaConversion = 0;
        return cantidad * tasaConversion;

    }
}
