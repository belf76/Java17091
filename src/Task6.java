public class Task6 {
    public static void main(String[] args) {
    printMultiplicationTable(6,2,5);
    }
    private static void printMultiplicationTable (int multiplier, int minMultiplicand, int maxMultiplicand){
        for(int i=minMultiplicand;i<=maxMultiplicand;i++){
            System.out.println(multiplier+" x "+ i + " = " + (multiplier*i));
        }
    }
}
