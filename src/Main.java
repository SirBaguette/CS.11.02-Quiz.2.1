public class Main {

    public static void main(String[] args) {
        int resultOne = add(1, 1);
        String resultTwo = greeting("Baguette");
        int resultThree = add(1,2,3,4);

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);

        printMe("sosf");

    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour, " + name +"!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne, numTwo), add(numThree, numFour));
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }

}
