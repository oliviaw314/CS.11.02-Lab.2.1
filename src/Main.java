import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int result1 = add(5,7);
        System.out.println(result1);
        int result2 = add(5,7,6,6);
        System.out.println(result2);
        String result3 = morningGreeting("Toby Fox");
        System.out.println(result3);
        String result4 = afternoonGreeting("Mac Miller");
        System.out.println(result4);
        String result5 = triple("oohbaby");
        System.out.println(result5);
        Double result6 = half(19);
        System.out.println(result6);
        int round1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(round1);
        int round2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(round2);
        int round3 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(round3);
        int round4 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(round4);
    }
    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        int sum1 = add(a,b);
        int sum2 = add(sum1,c);
        int sum3 = add(sum2,d);
        return sum3;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name+"!";
    }

    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }

    // 6. half
    public static double half(int number) {
        return (double) number/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(Double positive) {
        return (int) (positive+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(Double negative) {
        return (int) (negative-0.5);
    }
}