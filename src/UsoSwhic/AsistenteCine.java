package UsoSwhic;

public class AsistenteCine {

    public AsistenteCine() {
    }

    public void ejecutar(int edad) {
        int categoria = 0;

        // Clasificamos la edad para el Switch
        if (edad >= 0 && edad < 7) {
            categoria = 1;
        } else if (edad >= 7 && edad <= 17) {
            categoria = 2;
        } else if (edad >= 18 && edad <= 30) {
            categoria = 3;
        } else if (edad > 30) {
            categoria = 4;
        } else {
            System.out.println("ERROR: Edad no valida.");
            return;
        }

        switch (categoria) {
            case 1:
                System.out.println("Recomendacion: Peliculas animadas y educativas.");
                break;
            case 2:
                System.out.println("Recomendacion: Animaciones, aventuras y comedias familiares.");
                break;
            case 3:
                System.out.println("Recomendacion: Accion, drama, comedia y ciencia ficcion.");
                break;
            case 4:
                System.out.println("Recomendacion: Peliculas clasicas y dramas.");
                break;
        }
    }
}
