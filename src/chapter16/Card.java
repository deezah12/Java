package chapter16;

public class Card {
    public enum Face{Ace, Deuce, Three, Four, Five, Six,
                Seven, Eight, Nine, Ten, Jack, Queen, King};
    public  enum  Suit{Clubs, Diamonds, Shades, Hearts};
    private  final Face face;

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
       return  String.format("%s of %s " , face, suit);
    }
}

