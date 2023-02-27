public class App {
    public static void main(String[] args) throws Exception {
        Pelicula pelicula = new Pelicula("Piratas del Caribe", 120, 18, "Nose", 15.80);
        Asiento sala = new Asiento();

        sala.crearAsientos(pelicula);
        //sala.getAsientos();

        Espectador alex = new Espectador("Alex", 20, 150);
        Espectador omar = new Espectador("Omar", 19, 19);
        Espectador aaron = new Espectador("Aaron", 20, 150);
        Espectador diego = new Espectador("Diego", 19, 19);
        Espectador alex2 = new Espectador("Alex2", 20, 150);
        Espectador mario = new Espectador("Mario", 19, 19);
        Espectador javi = new Espectador("Javi", 20, 150);
        Espectador guillermo = new Espectador("Guille", 19, 19);
        Espectador anton = new Espectador("Anton", 20, 150);
        Espectador pablo = new Espectador("Pablo", 19, 19);
        sala.setAsientoIndividual(alex);
        sala.setAsientoIndividual(omar);
        sala.setAsientoIndividual(aaron);
        sala.setAsientoIndividual(diego);
        sala.setAsientoIndividual(alex2);
        sala.setAsientoIndividual(mario);
        sala.setAsientoIndividual(javi);
        sala.setAsientoIndividual(guillermo);
        sala.setAsientoIndividual(anton);
        sala.setAsientoIndividual(pablo);
        //System.out.println(alex.getAsiento());
        //System.out.println(omar.getAsiento());
        sala.getAsientosOcupados();
        sala.getAsientos();
    }
}
