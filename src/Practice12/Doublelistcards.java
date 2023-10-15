package Practice12;

import java.util.LinkedList;
import java.util.Scanner;

public class Doublelistcards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.next();
        String c2 = in.next();
        int turn = 0;
        LinkedList<Integer> cards1 = new LinkedList<>();
        LinkedList<Integer> cards2 = new LinkedList<>();
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
            if ((cards1.get(0) == 0) && (cards2.get(0) == 9)) {
                cards1.add(cards1.remove(0));
                cards1.add(cards2.remove(0));
            }
            else if ((cards1.get(0) == 9) && (cards2.get(0) == 0)) {
                cards2.add(cards2.remove(0));
                cards2.add(cards1.remove(0));
            }
            else if (cards1.get(0) > cards2.get(0)) {
                cards1.add(cards1.remove(0));
                cards1.add(cards2.remove(0));
            }
            else {
                cards2.add(cards2.remove(0));
                cards2.add(cards1.remove(0));
            }
        }
    }
}
