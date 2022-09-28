package pl.sdacademy.java.basic.exercises.day3.Task8;

import java.util.Objects;

public class Author {
    private String surname;
    private String nationality;

    public Author (String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, nationality);
    }
}
