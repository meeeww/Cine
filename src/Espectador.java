public class Espectador {
    private String m_nombre;
    private int m_edad;
    private double m_dinero;
    private String m_asiento;
    private boolean m_asientoAsignadoCheck = false;

    public Espectador(String s_nombre, int s_edad, double s_dinero){
        setNombre(s_nombre);
        setEdad(s_edad);
        setDinero(s_dinero);
    }
    //nombre
    public void setNombre(String s_nombre){
        this.m_nombre = s_nombre;
    }

    public String getNombre(){
        return this.m_nombre;
    }

    //edad
    public void setEdad(int s_edad){
        this.m_edad = s_edad;
    }

    public int getEdad(){
        return this.m_edad;
    }

    //dinero
    public void setDinero(double s_dinero){
        this.m_dinero = s_dinero;
    }

    public double getDinero(){
        return this.m_dinero;
    }

    //asiento
    public void setAsiento(String s_asiento){
        this.m_asiento = s_asiento;
        this.m_asientoAsignadoCheck = true;
    }

    public String getAsiento(){
        if(this.m_asiento != null){
            return this.m_asiento;
        } else {
            return "No tiene asiento";
        }
    }

    public boolean getCheckAsiento(){
        return m_asientoAsignadoCheck;
    }

}
