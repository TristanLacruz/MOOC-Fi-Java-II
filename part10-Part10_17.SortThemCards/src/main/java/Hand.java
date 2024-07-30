
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author trist
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand other) {
        int thisValueSum = this.cards.stream().mapToInt(Card::getValue).sum();
        int otherValueSum = other.cards.stream().mapToInt(Card::getValue).sum();
        return thisValueSum - otherValueSum;
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
