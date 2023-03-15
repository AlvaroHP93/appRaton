package ratonera;

/**
 * Vamos a comentar la clase Raton.
 * @author Alvaro Hernandez Perez
 * @version 2.0
 *
 */

public class Raton {
    /**
     * Aqui guardaremos la edad de cada raton, con un entero
     *
     */
    private int edad;
    /**
     * Aqui guardamos el peso de cada raton como un double.
     */
    private double peso;
    /**
     * Aqui guardamos el crecimiento diario de cada raton con un porcentaje con un double.
     */
    private double tasaCrecimiento;

    /**
     *Este es el constructor que permite crearlo vacio.
     * @since 1.0
     */
    public Raton(){
    }

    /**
     * Metodo que pide la edad y el peso
     * @since 2.0
     * @param edad
     * @param peso
     */

    public Raton(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Este metodo simula el crecimiento del raton en un dia.
     * No devuelve nada.
     * @since 1.0
     */
    public void desarollar() {
        crecida();
        this.setEdad(this.getEdad() + 1);
    }

    /**
     * @since 2.0
     */
    private void crecida() {
        this.setPeso(this.getPeso() + (this.getPeso() * this.getTasaCrecimiento() /100.0));
    }

    /**
     * Este metodo permite devolver la edad y el peso del raton.
     * @return Devuelve String.
     * @since 1.0
     */
    public String datos() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

    /**
     * Nos mostrará la edad del raton
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @since 2.0
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Nos permitira cambiar la edad del raton
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @since 2.0
     * @param edad
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Nos mostrara el peso del raton
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @since 2.0
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Nos permitiera cambiar el peso.
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @since 2.0
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Nos mostrara la tasa de crecimiento
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @since 2.0
     */
    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    /**
     * @since 2.0
     * Aqui podras ver la tasa de creciciemto {@link <a href="http://es.wikipedia.org/wiki/Rat%C3%B3n">...</a>} de laboratorio
     * @param tasaCrecimiento
     */
    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }
}
