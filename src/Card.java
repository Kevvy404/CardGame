public class Card 
{
    private int card;

    Card(int card)
    {
        this.card = card;
    }

    public int getCard()
    {
        return card;
    }

    public String toString()
    {
        return "Card: " + card;
    }
}