import ratonera.Raton;

public class Main {
    public static void main(String[] args) {
        Raton mickey=new Raton();
        mickey.setEdad(1);
        mickey.setPeso(10);
        mickey.setTasaCrecimiento(0.5);

        Raton ratatouille=new Raton();
        ratatouille.setEdad(1);
        ratatouille.setPeso(8);
        ratatouille.setTasaCrecimiento(0.2);

        while(ratatouille.getPeso() <= mickey.getPeso()){
            System.out.printf("%s->%s   %s->%s\n","Ratatouille",ratatouille.datos(),"Mickey",mickey.datos());
            evolucion(mickey, ratatouille);
            if(ratatouille.getEdad() >=60) ratatouille.setTasaCrecimiento(ratatouille.getTasaCrecimiento() +1);
        }
    }

    private static void evolucion(Raton a, Raton b) {
        b.desarollar();
        a.desarollar();
    }
}