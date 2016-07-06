/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class RadioA implements Radio {

    private boolean encendidoApagado;
    private String estacion;
    private double emisora;

    public RadioA(boolean encendidoApagado, String estacion, double emisora) {
        this.encendidoApagado = encendidoApagado;
        this.estacion = estacion;
        this.emisora = emisora;
    }

    public void setEncendidoApagado(boolean encendidoApagado) {
        this.encendidoApagado = encendidoApagado;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    public boolean isEncendidoApagado() {
        return encendidoApagado;
    }

    public String getEstacion() {
        return estacion;
    }

    public double getEmisora() {
        return emisora;
    }

    @Override
    public void encendidoApagado() {
        
    }

    @Override
    public void cambiarEmisora() {
       
    }

    @Override
    public void cambiarEstacion() {
    }

    @Override
    public void almacenar() {

    }

}
