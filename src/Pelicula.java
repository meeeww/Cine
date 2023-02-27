public class Pelicula extends Asiento{
    private String m_nombre;
    private double m_duracion;
    private int m_edad;
    private String m_director;
    private double m_precio;

    public Pelicula(String s_nombre, double s_duracion, int s_edad, String s_director, double s_precio){
        setNombre(s_nombre);
        setDuracion(s_duracion);
        setEdad(s_edad);
        setDirector(s_director);
        setPrecio(s_precio);
    }

    //nombres
    public void setNombre(String s_nombre){
        this.m_nombre = s_nombre;
    }

    public String getNombre(){
        return this.m_nombre;
    }

    //duracion
    public void setDuracion(double s_duracion){
        this.m_duracion = s_duracion;
    }

    public double getDuracion(){
        return this.m_duracion;
    }

    //edad
    public void setEdad(int s_edad){
        this.m_edad = s_edad;
    }

    public int getEdad(){
        return this.m_edad;
    }

    //director
    public void setDirector(String s_director){
        this.m_director = s_director;
    }

    public String getDirector(){
        return this.m_director;
    }

    //precio
    public void setPrecio(double s_precio){
        this.m_precio = s_precio;
    }

    public double getPrecio(){
        return this.m_precio;
    }
}
