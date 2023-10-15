package Practice12;
import java.util.*;
public class Stackcards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.next();
        String c2 = in.next();
        int turn = 0;
        Stack<Integer> cards1 = new Stack<>();
        Stack<Integer> cards2 = new Stack<>();
        for (int i = 0; i < c1.length(); i++) {
            cards1.push(Integer.parseInt(Character.toString(c1.charAt(i))));
        }
        for (int i = 0; i < c2.length(); i++) {
            cards2.push(Integer.parseInt(Character.toString(c2.charAt(i))));
        }
        Stack<Integer> cardsstack1 = new Stack<>();
        Stack<Integer> cardsstack2 = new Stack<>();
        while (true) {
            if (turn >= 106) {
                System.out.println("botva");
                break;
            }
            if (cards1.isEmpty()) {
                if (cardsstack1.isEmpty()) {
                    System.out.println("second "+turn);
                    break;
                }
                while (!cardsstack1.isEmpty()) {
                    cards1.push(cardsstack1.pop());
                }
            }
            if (cards2.isEmpty()) {
                if (cardsstack2.isEmpty()) {
                    System.out.println("first "+turn);
                    break;
                }
                while (!cardsstack2.isEmpty()) {
                    cards2.push(cardsstack2.pop());
                }
            }
            turn++;
            if ((cards1.peek() == 0) && (cards2.peek() == 9)) {
                cardsstack1.push(cards1.pop());
                cardsstack1.push(cards2.pop());
            }
            else if ((cards1.peek() == 9) && (cards2.peek() == 0)) {
                cardsstack2.push(cards2.pop());
                cardsstack2.push(cards1.pop());
            }
            else if (cards1.peek() > cards2.peek()) {
                cardsstack1.push(cards1.pop());
                cardsstack1.push(cards2.pop());
            }
            else {
                cardsstack2.push(cards2.pop());
                cardsstack2.push(cards1.pop());
            }
        }
    }
}
