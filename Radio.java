/**
   Interfaz que describe el funcionamiento de una radio.
   @author Marlon Fuentes Seccion 30. Algoritmos y Estructuras de Datos, Universidad del Valle de Guatemala.
   @version 1.0.3
 */
public interface Radio {
/*
    En esta clase se encuentran las funciones que se usaran como contrato para el resto del programa
    */
    void setEncendido(boolean estado);

 

    void setFrecuencia(boolean frecuencia);


    void setEmisora(double emisora);


    void saveEmisora(int btn, double emisora);

 
    double selectEmisora(int btn);

 

    boolean getEncendido();

 

    boolean getFrecuencia();

    
    double getEmisora();
}