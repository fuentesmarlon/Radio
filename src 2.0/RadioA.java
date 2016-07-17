
import java.util.Random;

/**
 *
 * @author Marlon
 */
/*
Esta clase se encarga de la implementacion 
*/
public class RadioA implements Radio{
    private boolean estado;
    private boolean frecuencia;
    private double emisora;
    private double[] emisoraS;

    /**
     *
     */
    public RadioA() {
        emisoraS = new double[12];
        this.estado = estado;
        this.frecuencia=frecuencia;
        this.emisora=emisora;
    }

    public RadioA(boolean estado, boolean frecuencia, double emisora, double[] emisoraS) {
        this.estado = estado;
        this.frecuencia = frecuencia;
        this.emisora = emisora;
        this.emisoraS = emisoraS;
    }
    

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    /**
     *
     * @param emisoraS
     */
    public void setEmisoraS(double[] emisoraS) {
        this.emisoraS = emisoraS;
    }

    /**
     *
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     *
     * @return
     */
    public boolean isFrecuencia() {
        return frecuencia;
    }

    public double getEmisora() {
        return emisora;
    }

    /**
     *
     * @return
     */
    public double[] getEmisoraS() {
        return emisoraS;
    }
    
    public void saveEmisora(int btn, double emisoraS){
       this.emisoraS[btn]=emisoraS;
    }
    public double selectEmisora(int btn){
        /*Codigo aqui
        
        */
       return btn;
    }
    public boolean getFrecuencia(){
        return estado;
    }
    public boolean getEncendido(){
        return estado;
    }
    public void setEncendido(boolean estado){
        estado = false;

    }
    
}