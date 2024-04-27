package ushtrimi19;

public class Author {

    private String surname;
    private String nationality;

    public Author(String surname, String nationality){
       this.surname = surname;
       this.nationality = nationality;
    }

    void write(){}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null){
            return;
        }
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
