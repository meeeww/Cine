public class Asiento {
    private String[][] m_arrayAsientos = new String[8][9];
    private Pelicula m_pelicula;
    private int m_asientosMaximos;
    private int m_asientosOcupados = 0;

    public void crearAsientos(Pelicula s_peli) {
        for (int i = 0; i < m_arrayAsientos.length; i++) {
            for (int j = 0; j < m_arrayAsientos[i].length; j++) {
                char a = 'A';
                a += j;
                m_arrayAsientos[i][j] = ((i + 1) + "" + a);
            }
        }
        m_asientosMaximos = m_arrayAsientos.length * m_arrayAsientos[0].length;
        this.m_pelicula = s_peli;
    }

    public void getAsientos() {
        for (int i = 0; i < m_arrayAsientos.length; i++) {
            for (int j = 0; j < m_arrayAsientos[i].length; j++) {
                System.out.print(m_arrayAsientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setAsientoIndividual(Espectador s_espectador) {
        if (m_asientosOcupados <= m_asientosMaximos) {
            System.out.println(s_espectador.getNombre() + " - " + s_espectador.getAsiento());
            if (s_espectador.getDinero() >= this.m_pelicula.getPrecio()
                    && s_espectador.getEdad() >= this.m_pelicula.getEdad()
                    && s_espectador.getCheckAsiento() == false) {

                int fila = (int) (Math.random() * this.m_arrayAsientos.length);
                int columna = (int) (Math.random() * this.m_arrayAsientos[fila].length);

                if (m_arrayAsientos[fila][columna] != "XX") {
                    s_espectador.setAsiento(m_arrayAsientos[fila][columna]);
                    System.out.println("Entramos con " + s_espectador.getNombre() + " en el asiento "
                            + this.m_arrayAsientos[fila][columna]);
                    this.m_arrayAsientos[fila][columna] = "XX";
                    System.out.println("Entramos con " + s_espectador.getNombre() + " en el asiento "
                            + this.m_arrayAsientos[fila][columna]);
                    m_asientosOcupados = m_asientosOcupados + 1;
                } else {
                    while (m_arrayAsientos[fila][columna] != "XX") {
                        int newFila = (int) (Math.random() * this.m_arrayAsientos.length);
                        int newColumna = (int) (Math.random() * this.m_arrayAsientos[fila].length);
                        s_espectador.setAsiento(m_arrayAsientos[newFila][newColumna]);
                        System.out.println("Entramos con " + s_espectador.getNombre() + " en el asiento "
                                + this.m_arrayAsientos[newFila][newColumna]);
                        this.m_arrayAsientos[newFila][newColumna] = "XX";
                        System.out.println("Entramos con " + s_espectador.getNombre() + " en el asiento "
                                + this.m_arrayAsientos[newFila][newColumna]);
                        m_asientosOcupados = m_asientosOcupados + 1;
                        fila = newFila;
                        columna = newColumna;
                    }
                }
            } else {
                System.out.println("El espectador no tiene suficiente dinero o la suficiente edad");
            }
        } else {
            System.out.println("No quedan asientos libres");
        }
    }

    public void getAsientosOcupados() {
        System.out.println(m_asientosOcupados + "/" + m_asientosMaximos + " asientos ocupados");
    }
}
