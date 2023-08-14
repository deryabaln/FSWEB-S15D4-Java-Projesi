import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("tenet"));

    }

    public static boolean checkForPalindrome(String text) {

        LinkedList<Character> stack = new LinkedList<>();
        Queue<Character> queue = new LinkedList<>();
        String lowerCase = text.toLowerCase(Locale.ENGLISH);

        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                queue.add(c);
                stack.add(c);
            }
        }
        // System.out.println(queue);
       // System.out.println(stack);

        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.remove())){
                return false;
            }
        }

        return true;

    }

}
