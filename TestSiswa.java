import java.util.Scanner;

public class TestSiswa {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        encapSiswa siswa = new encapSiswa();
        String nama = s.nextLine();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddres("Malang");

            System.out.println("Nama : "+siswa.getName()  +"Alamat : "+siswa.getAddres()+" Berumur "+siswa.getAge()+" Tahun");

    }

}


//nsdd-3000