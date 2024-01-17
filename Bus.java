public class Bus {
    
    private double penumpang, maxpenumpang, counter,penumpangbaru;

    //komstruktor
    public Bus(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    //method mutator
    public void pluspenumpang(double penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload Penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }

    public void getPassword(double password){
        if (password==90){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
        }
    }

    public void cetak(){
        System.out.println("Penupang Sekarang : "+penumpang);
        System.out.println("Penumpang Seharusnya : "+maxpenumpang);
    }

}    