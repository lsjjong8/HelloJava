package chapter03;

public class Example {
    public static void main(String[] args) {
        String abStr = String.valueOf(9) + String.valueOf(91);
        String baStr = "" + 91 + 9;

        int abIntValue = Integer.parseInt(abStr);
        int baIntValue = Integer.parseInt(baStr);

        int answer = abIntValue > baIntValue ? abIntValue : baIntValue;
    }
}
