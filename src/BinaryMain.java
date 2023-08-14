import java.util.Stack;

public class BinaryMain {
    public static void main(String[] args) {

        System.out.println(convertDecimalToBinary(13));
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(75));
    }
    public static String convertDecimalToBinary(int num){
        final int base = 2;
        Stack digits = new Stack();

        while(num > 0){
            digits.push(num % base);
            num = num / base;
        }

        String bits = "";
        while (!digits.isEmpty()){
            bits += digits.pop();
        }

        return bits;
    }
}
