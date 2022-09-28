package pl.sdacademy.java.basic.exercises.day3.task7;

import java.util.Objects;

public class Cat {
    private String name;
    public Cat(String name){//konstruktor nic nie zwraca i ma nazwę klasy
        this.name = name; // sam napis this odwołuje nas do całego obiektu
    }

    public void makeSound(){
        System.out.println("miau miau");
    }
    public void eatMice( int mice){
        System.out.println("i ate "+ mice +" mice");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
