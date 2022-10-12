
package POO4;


public  class Deporte
{
    private String nombre;
    private int numeroJugadores;
    private float medidaCancha;
    private double tiempo;
    private String instrumento;

    public Deporte()
    {
        this.nombre = "";
        this.numeroJugadores = 0;
        this.medidaCancha = 0;
        this.tiempo = 0;
        this.instrumento = "";
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNumeroJugadores(int numeroJugadores) 
    {
        this.numeroJugadores = numeroJugadores;
    }

    public int getNumeroJugadores()
    {
        return numeroJugadores;
    }

    public void setMedidaCancha(float medidaCancha) 
    {
        this.medidaCancha = medidaCancha;
    }

    public float getMedidaCancha()
    {
        return medidaCancha;
    }
    
    public void setTiempo(double tiempo) 
    {
        this.tiempo = tiempo;
    }

    public double getTiempo() 
    {
        return tiempo;
    }
    
    public void setInstrumento(String instrumento)
    {
        this.instrumento = instrumento;
    }
        
    public String getIntrumento() {
        return instrumento;
    }
    
}
