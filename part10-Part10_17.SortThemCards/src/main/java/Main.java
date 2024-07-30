
public class Main {

    public static void main(String[] args) {
        // test your code here
        Hand hand1 = new Hand();
        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        System.out.println("Hand 1:");
        hand1.print();

        Hand hand2 = new Hand();
        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        System.out.println("\nHand 2:");
        hand2.print();

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("\nBetter hand is:");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("\nBetter hand is:");
            hand1.print();
        } else {
            System.out.println("\nHands are equal");
        }

        System.out.println("\nSorted Hand 1:");
        hand1.sort();
        hand1.print();

        System.out.println("\nSorted Hand 1 by Suit:");
        hand1.sortBySuit();
        hand1.print();
    }
}

