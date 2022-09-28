package pl.sdacademy.java.basic.exercises.day3.Task8P;

public class Main {

    public static void main(String[] args) {
       Poem[] poems = new Poem[3];
       Author author1=new Author("Nowak","PL");
       poems[0] = new Poem(author1, 300);
       Author author2=new Author("Black","UK");
       poems[1] = new Poem(author2, 234);
       Author author3=new Author("Schwarz","DE");
       poems[2] = new Poem(author3, 560);
        System.out.println(getSurnameWithMaxStropheNumbers(poems));
        System.out.println(getSurnameWithMaxStropheNumbers1(poems));
    }
     private static String getSurnameWithMaxStropheNumbers(Poem[] poems){
        int max = 0;
        String surname =null;
         for (Poem poem:poems) {
             if (max< poem.getStropheNumbers()){
                 max= poem.getStropheNumbers();
                 surname = poem.getCreator().getSurname();
             }
         }
         return surname;
     }
    private static Author getSurnameWithMaxStropheNumbers1(Poem[] poems){
        int max = 0;
        Author surname =null;
        for (Poem poem:poems) {
            if (max< poem.getStropheNumbers()){
                max= poem.getStropheNumbers();
                surname = poem.getCreator();
            }
        }
        return surname;
    }
}
