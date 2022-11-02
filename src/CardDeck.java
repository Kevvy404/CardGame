import java.util.*;

public class CardDeck 
{
    private Queue<Card> deck;

    CardDeck()
    {
        deck = new LinkedList<Card>();
    }

    public void add(Card card)
    {
        deck.add(card);
    }

    public void draw(Card card)
    {
        deck.remove(card);
    }

    public void shuffle()
    {
        Collections.shuffle((LinkedList<Card>) deck);
    }

    public String toString()
    {
        return deck.toString();
    }
}
