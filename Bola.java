import java.lang.Math;

public class Bola {
    
    private double jarijari;

    public void setjarijari(double jarijari){
        this.jarijari=jarijari;
    }

    public void showdiameter(){
        double diameter = 2 * jarijari;
        System.out.println("Diameter : "+diameter);
    }

    public void showluas(){
        double showluaspermukaan = 4 * Math.PI * Math.pow(jarijari,2 );
        System.out.println("Luas Permukaan : "+showluaspermukaan);
    }

    public void showvolume(){
        double volume = (4.0/3.0) * Math.PI * Math.pow(jarijari, 3);
        System.out.println("Volume : "+volume);
    }


}
