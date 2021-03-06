
import java.util.*;   
public class deckOfCards 
{
  public enum Suit
{
  HEARTS,
  SPADES,
  CLUBS,
  DIAMONDS;
}
  public enum Rank
  {
      TWO(2),
      THREE(3),
      FOUR(4),
      FIVE(5),
      SIX(6),
      SEVEN(7),
      EIGHT(8),
      NINE(9),
      TEN(10),
      JACK(11),
      QUEEN(12),
      KING(13),
      ACE(14);
    
    private final int rank;
    
    private Rank(int rank)
    {
      this.rank = rank;
    }
    
    public int rank() {
      return this.rank;
    }
  }
  public class Card 
  {
    private Suit suit;
    private Rank rank;
    
    public Card(Rank rank, Suit suit)
    {
      this.rank =rank;
      this.suit =suit;
    }
    public void setRank(Rank rank)
    {
      this.rank=rank;
    }
    public Rank getRank()
    {
      return rank;
    }
    public void setSuit(Suit suit)
    {
      this.suit = suit;
    }
    public Suit getSuit()
    {
      return suit;
    }
    
    
   /* public card(suit,ranked)
    { card.suit=Spades; card.rank= 10;}*/
  }
}