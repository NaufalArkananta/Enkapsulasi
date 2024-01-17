public class tampilbola {
    
    public static void main(String[] args) {
        Bola bola = new Bola();

        System.out.println("Hasil Alhir");
        bola.showdiameter();
        bola.showluas();
        bola.showvolume();

        bola.setjarijari(14);

        System.out.println("Hasil : ");
        bola.showdiameter();
        bola.showluas();
        bola.showvolume();
    }
}
