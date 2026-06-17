package UsoSwhic;

public class CampeonatoDeportivo {

    public CampeonatoDeportivo() {
    }

    public void ejecutar(String resultado) {
        int puntos = 0;

        switch (resultado.toLowerCase()) {
            case "ganado":
                puntos = 3;
                System.out.println("¡Victoria! Se otorgan 3 puntos.");
                break;
            case "empatado":
                puntos = 1;
                System.out.println("Empate. Se otorga 1 punto.");
                break;
            case "perdido":
                puntos = 0;
                System.out.println("Derrota. Se otorgan 0 puntos.");
                break;
            default:
                System.out.println("ERROR: Resultado invalido. Use 'ganado', 'perdido' o 'empatado'.");
                return;
        }

        System.out.println("Clasificacion Actualizada: +" + puntos + " puntos agregados al equipo.");
    }
}
