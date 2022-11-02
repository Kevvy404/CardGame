import java.util.*;

public class Player implements Runnable
{
    private static int players = 0;
    private LinkedList<Card> playersHand;
    private CardDeck l_deck, r_deck;
    private int playerNumber;

    Player(int players, CardDeck l_deck, CardDeck r_deck)
    {
        this.l_deck = l_deck;
        this.r_deck = r_deck;
        this.playerNumber = ++players;
        playersHand = new LinkedList<Card>();
    }

    public LinkedList<Card> reveal() {
        return playersHand;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

}