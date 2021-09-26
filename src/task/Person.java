package task;

public class Person {
    // attribute
    private String firstName;
    private String lastName;
    private String address;
    private int birthYear;

    // default constructor
    public Person() {
    }

    public Person(String firstName, String lastName, String address, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthYear = birthYear;
    }

    // methods - setter getter untuk nilai private
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String namaBelakang) {
        this.lastName = namaBelakang;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public void getDetail(){
        System.out.println("Nama lengkap " + getFullName());
        System.out.println("Domisili " + getAddress());
        System.out.println("Usia " +  (2021 - getBirthYear()));
    }
}