package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Main {
    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        Author author1=new Author("Nowak","PL");
        poems[0] = new Poem(author1, 300);
        Author author2=new Author("Black","UK");
        poems[1] = new Poem(author2, 234);
        Author author3=new Author("Schwarz","DE");
        poems[2] = new Poem(author3, 560);
        int maks=0;
        for (Poem poem:poems) {
            if(maks< poem.getStropheNumbers())
                maks= poem.getStropheNumbers();
        }
        System.out.println(maks);
        for (Poem poem:poems) {
            if(maks == poem.getStropheNumbers())
                System.out.println(poem);
        }



    }
}
