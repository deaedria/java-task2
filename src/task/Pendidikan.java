package task;

import java.util.Arrays;

public class Pendidikan extends Person {
    private String[] mataKuliah;
    private int[] sks;

    public Pendidikan(){

    }

    public Pendidikan(String[] mataKuliah, int[] sks) {
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }   

    public String[] getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int[] getSks() {
        return sks;
    }

    public void setSks(int[] sks) {
        this.sks = sks;
    }

    public String getFullMataKuliah(){
        return Arrays.toString(this.mataKuliah);
    }

    public String getFullSks(){
        return Arrays.toString(this.sks);
    }

    public int hitungSks(){
        int sum = 0;
        for (int i = 0; i < this.sks.length; i++) {
            sum += this.sks[i];
        }
        return sum;
    }

    public String checkGelar(){
        if(hitungSks() >= 144){
            return "Graduate";
        }
        return "Student";
    }

    @Override
    public String getFullName() {
      return super.getFullName();
    }
}