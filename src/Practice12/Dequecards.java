package Practice12;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Dequecards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.next();
        String c2 = in.next();
        int turn = 0;
        ArrayDeque<Integer> cards1 = new ArrayDeque<>();
        ArrayDeque<Integer> cards2 = new ArrayDeque<>();
        for (int i = 0; i < c1.length(); i++) {
            cards1.add(Integer.parseInt(Character.toString(c1.charAt(i))));
        }
        for (int i = 0; i < c2.length(); i++) {
            cards2.add(Integer.parseInt(Character.toString(c2.charAt(i))));
        }
        while (true) {
            if (turn >= 106) {
                System.out.println("botva");
                break;
            }
            if (cards1.isEmpty()) {
                System.out.println("second "+turn);
                break;
            }
            if (cards2.isEmpty()) {
                System.out.println("first "+turn);
                break;
            }
            turn++;
            if ((cards1.peek() == 0) && (cards2.peek() == 9)) {
                cards1.add(cards1.remove());
                cards1.add(cards2.remove());
            }
            else if ((cards1.peek() == 9) && (cards2.peek() == 0)) {
                cards2.add(cards2.remove());
                cards2.add(cards1.remove());
            }
            else if (cards1.peek() > cards2.peek()) {
                cards1.add(cards1.remove());
                cards1.add(cards2.remove());
            }
            else {
                cards2.add(cards2.remove());
                cards2.add(cards1.remove());
            }
        }
    }
}
