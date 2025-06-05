import java.util.*;

public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = generateMagicHand(7);

        System.out.println("Pick a card from the deck!");

        int userValue = getUserCardValue(input);
        String userSuit = getUserCardSuit(input);

        boolean isFound = isCardInMagicHand(magicHand, userValue, userSuit);

        System.out.println();
        if (isFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card was not found in the magic hand.");
        }

        displayMagicHand(magicHand);
    }

    public static Card[] generateMagicHand(int size) {
        Card[] hand = new Card[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            Card card = new Card();
            card.setValue(rand.nextInt(13) + 1);
            card.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            hand[i] = card;
        }
        return hand;
    }

    public static int getUserCardValue(Scanner input) {
        int value;
        while (true) {
            System.out.print("Enter the card value (1 to 13): ");
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 1 && value <= 13) break;
            } else {
                input.next(); // skip invalid input
            }
            System.out.println("Invalid input. Please enter a number from 1 to 13.");
        }
        return value;
    }

    public static String getUserCardSuit(Scanner input) {
        input.nextLine(); // consume newline
        String suit;
        while (true) {
            System.out.print("Enter the suit (Hearts, Diamonds, Spades, Clubs): ");
            suit = input.nextLine().trim();
            for (String valid : Card.SUITS) {
                if (valid.equalsIgnoreCase(suit)) {
                    return valid;
                }
            }
            System.out.println("Invalid suit. Choose from: Hearts, Diamonds, Spades, Clubs.");
        }
    }

    public static boolean isCardInMagicHand(Card[] hand, int value, String suit) {
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }

    public static void displayMagicHand(Card[] hand) {
        System.out.println("\nThe Magic Hand was:");
        for (Card card : hand) {
            System.out.println(" - " + card.getValue() + " of " + card.getSuit());
        }
    }
}
