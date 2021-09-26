package task;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    Integer menuInput;
    String opsi;
    Integer jumlahMatkul;

    public void input() {
        System.out.println("Menu :");
        System.out.println("1. Biodata");
        System.out.println("2. Mata Kuliah");
        System.out.println("Pilih opsi (1 atau 2) : ");
        this.menuInput = in.nextInt();
    }

    public void output() {
        do {
            input();
            switch (this.menuInput) {
                case 1:
                    System.out.print("Input nama depan : ");
                    String firstName = in.next();
                    System.out.print("Input nama belakang : ");
                    String lastName = in.next();
                    System.out.print("Input tempat tinggal : ");
                    String address = in.next();
                    System.out.print("Input tahun lahir : ");
                    int birthYear = in.nextInt();
                    Person person = new Person(firstName, lastName, address, birthYear);
                    person.getDetail();
                    break;

                case 2:
                    System.out.println();
                    Register register = new Register();
                    System.out.print("First Name: ");
                    String firstName2 = in.next();
                    System.out.print("Last Name: ");
                    String lastName2 = in.next();
                    System.out.print("Card Identitas: ");
                    String identitas = in.next();
                    register.studentRegistration(firstName2 + " " + lastName2, "password");
                    register.regisSuccess(identitas);

                    System.out.println("Ingin input berapa matakuliah?");
                    this.jumlahMatkul = in.nextInt();
                    System.out.println();

                    String[] mataKuliah = new String[this.jumlahMatkul];
                    int[] sks = new int[this.jumlahMatkul];
                    for (int i = 0; i < this.jumlahMatkul; i++) {
                        System.out.print("Input nama matakuliah : ");
                        mataKuliah[i] = in.next();
                        System.out.print("Input sks : ");
                        sks[i] = in.nextInt();
                    }
                    System.out.println();
                    Pendidikan pendidikan = new Pendidikan(mataKuliah, sks);
                    String[] matkul = pendidikan.getMataKuliah();
                    int[] sksMatkul = pendidikan.getSks();                

                    pendidikan.setFirstName(firstName2);
                    pendidikan.setLastName(lastName2);
                    System.out.println("Nama : " + pendidikan.getFullName());
                    System.out.println("Ringkasan Matakuliah yang Diambil : ");
                    for (int i = 0; i < matkul.length; i++) {
                        System.out.println((i+1) + ") " + matkul[i] + ", sks : " + sksMatkul[i]);
                    }
                    System.out.println("Jumlah sks : " + pendidikan.hitungSks());
                    System.out.println("Status : " + pendidikan.checkGelar());
                    break;

                default:
                    break;
            }

            System.out.println();
            System.out.println("Ingin menjalankan kembali? Y/N");
            this.opsi = in.next();
            System.out.println();
        } while (opsi.equals("Y") || opsi.equals("y"));

        System.out.println("Selesai. Terimakasih!");
        System.out.println();
    }

    public static void main(String[] args) {
        new Main().output();
    }
}
