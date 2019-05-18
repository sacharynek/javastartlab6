package userprogram;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    private String fname, lname, pesel;
    private int age;
    private LocalDate birthDate;

    public User() {
    }

    public User(String fname, String lname, String pesel, int age, LocalDate birthDate) {
        this.fname = fname;
        this.lname = lname;
        this.pesel = pesel;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    public static class UserBuilder{
        private String fname, lname, pesel;
        private int age;
        private LocalDate birthDate;

        public UserBuilder setFName(String fname){
            this.fname = fname;
            return this;
        }

        public UserBuilder setLName(String lname){
            this.lname = lname;
            return this;
        }

        public UserBuilder setPesel(String pesel){
            this.pesel = pesel;
            return this;
        }

        public UserBuilder setLAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setLBirthDate(LocalDate dob){
            this.birthDate = dob;
            return this;
        }

        public User build(){
            return new User(this.fname, this.lname, this.pesel, this.age, this.birthDate);
        }

    }

    public static UserBuilder getBuilder(){
        return new UserBuilder();
    }
}
