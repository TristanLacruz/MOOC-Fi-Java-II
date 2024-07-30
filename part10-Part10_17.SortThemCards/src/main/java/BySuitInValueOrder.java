
import java.util.Comparator;


/**
 *
 * @author trist
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit() != c2.getSuit()) {
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        } else {
            return c1.getValue() - c2.getValue();
        }
    }
}
