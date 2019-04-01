import java.awt.Image;
import java.util.Objects;

import javax.swing.ImageIcon;
/**
 * A Card represents a playing card in a standard deck of 52 cards.
 * A Card has fields for its value, its suit, its color and an image.
 * The Card class has methods associated for setting these fields but 
 * the constructor handles these tasks.
 * @author Nick Stauffer
 * @author kazuma2448@protonmail.com
 */
public class Card {
	private final int width = 150;		//width of the card image
	private final int height = 218;		//height of the card image
	
	private String value;				//the card's value
	private String suit;				//the card's suit
	private String color;				//the card's color
	private ImageIcon icon;				//the ImageIcon associated with this card
	/**
	 * The constructor is responsible for taking an int parameter for determining the
	 * value of the card. It also takes a string value to set the suit of the card.
	 * The color is set according to the suit of the card. Also sets the Icon for the
	 * card by reading the image location in the class Images.
	 * @param value	an integer value representing the value of the card
	 * @param suit a string value representing the suit of the card
	 */
	public Card(int value, String suit) {
		
		if(value == 0) {
			this.value = "Ace";
		}else if(value == 10) {
			this.value = "Jack";
		}else if(value == 11) {
			this.value = "Queen";
		}else if(value == 12) {
			this.value = "King";
		}else {
			this.value = Integer.toString(value + 1);
		}
		
		this.suit = suit;
		
		setIcon(this);
		
		if(suit.equals("clubs") || suit.equals("spades")) {
			this.color = "black";
		}else {
			this.color = "red";
		}
	}
	/**
	 * Getter for the field value
	 * @return a string representing the value of the card
	 */
	public String getValue() {
		return value;
	}
	/**
	 * toString method that prints the value field and suit field
	 */
	public String toString() {
		return this.value + " of " + this.suit; 
	}
	/**
	 * Setter for field value
	 * @param value A string representing the value of the card
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * Getter for the field suit
	 * @return a string representing the suit of the card
	 */
	public String getSuit() {
		return suit;
	}
	/**
	 * Setter for the field suit
	 * @param suit a String representing the suit of the card
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}
	/**
	 * Getter for the field color
	 * @return a String representing the color of the card
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Setter for the field color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Getter for the field icon
	 * @return an ImageIcon representing the field icon. 
	 * (A picture associated with the card)
	 */
	public ImageIcon getIcon() {
		return this.icon;
	}
	/**
	 * Equals method to decide if the input card is the same as
	 * the calling card
	 */
	public final boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Card)) {
			return false;
		}
		Card card = (Card) o;
		
		return Objects.equals(value, card.getValue()) 
				&& Objects.equals(suit, card.getSuit())
				&& Objects.equals(color, card.getColor());
	}
	private void setIcon(Card card) {
		if(card.getValue().equals("Ace") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.aceOfSpades, width, height);
		}else if(card.getValue().equals("2") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.twoOfSpades, width, height);
		}else if(card.getValue().equals("3") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.threeOfSpades, width, height);
		}else if(card.getValue().equals("4") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.fourOfSpades, width, height);
		}else if(card.getValue().equals("5") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.fiveOfSpades, width, height);
		}else if(card.getValue().equals("6") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.sixOfSpades, width, height);
		}else if(card.getValue().equals("7") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.sevenOfSpades, width, height);
		}else if(card.getValue().equals("8") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.eightOfSpades, width, height);
		}else if(card.getValue().equals("9") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.nineOfSpades, width, height);
		}else if(card.getValue().equals("10") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.tenOfSpades, width, height);
		}else if(card.getValue().equals("Jack") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.jackOfSpades, width, height);
		}else if(card.getValue().equals("Queen") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.queenOfSpades, width, height);
		}else if(card.getValue().equals("King") && card.getSuit().equals("spades")) {
			icon = makeIcon(Images.kingOfSpades, width, height);
		}else if(card.getValue().equals("Ace") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.aceOfClubs, width, height);
		}else if(card.getValue().equals("2") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.twoOfClubs, width, height);
		}else if(card.getValue().equals("3") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.threeOfClubs, width, height);
		}else if(card.getValue().equals("4") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.fourOfClubs, width, height);
		}else if(card.getValue().equals("5") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.fiveOfClubs, width, height);
		}else if(card.getValue().equals("6") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.sixOfClubs, width, height);
		}else if(card.getValue().equals("7") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.sevenOfClubs, width, height);
		}else if(card.getValue().equals("8") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.eightOfClubs, width, height);
		}else if(card.getValue().equals("9") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.nineOfClubs, width, height);
		}else if(card.getValue().equals("10") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.tenOfClubs, width, height);
		}else if(card.getValue().equals("Jack") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.jackOfClubs, width, height);
		}else if(card.getValue().equals("Queen") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.queenOfClubs, width, height);
		}else if(card.getValue().equals("King") && card.getSuit().equals("clubs")) {
			icon = makeIcon(Images.kingOfClubs, width, height);
		}else if(card.getValue().equals("Ace") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.aceOfHearts, width, height);
		}else if(card.getValue().equals("2") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.twoOfHearts, width, height);
		}else if(card.getValue().equals("3") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.threeOfHearts, width, height);
		}else if(card.getValue().equals("4") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.fourOfHearts, width, height);
		}else if(card.getValue().equals("5") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.fiveOfHearts, width, height);
		}else if(card.getValue().equals("6") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.sixOfHearts, width, height);
		}else if(card.getValue().equals("7") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.sevenOfHearts, width, height);
		}else if(card.getValue().equals("8") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.eightOfHearts, width, height);
		}else if(card.getValue().equals("9") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.nineOfHearts, width, height);
		}else if(card.getValue().equals("10") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.tenOfHearts, width, height);
		}else if(card.getValue().equals("Jack") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.jackOfHearts, width, height);
		}else if(card.getValue().equals("Queen") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.queenOfHearts, width, height);
		}else if(card.getValue().equals("King") && card.getSuit().equals("hearts")) {
			icon = makeIcon(Images.kingOfHearts, width, height);
		}else if(card.getValue().equals("Ace") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.aceOfDiamonds, width, height);
		}else if(card.getValue().equals("2") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.twoOfDiamonds, width, height);
		}else if(card.getValue().equals("3") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.threeOfDiamonds, width, height);
		}else if(card.getValue().equals("4") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.fourOfDiamonds, width, height);
		}else if(card.getValue().equals("5") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.fiveOfDiamonds, width, height);
		}else if(card.getValue().equals("6") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.sixOfDiamonds, width, height);
		}else if(card.getValue().equals("7") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.sevenOfDiamonds, width, height);
		}else if(card.getValue().equals("8") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.eightOfDiamonds, width, height);
		}else if(card.getValue().equals("9") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.nineOfDiamonds, width, height);
		}else if(card.getValue().equals("10") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.tenOfDiamonds, width, height);
		}else if(card.getValue().equals("Jack") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.jackOfDiamonds, width, height);
		}else if(card.getValue().equals("Queen") && card.getSuit().equals("diamonds")) {
			icon = makeIcon(Images.queenOfDiamonds, width, height);
		}else {
			icon = makeIcon(Images.kingOfDiamonds, width, height);
		}
	}
	
	private ImageIcon makeIcon(String img, int i, int j) {
		ImageIcon ico = new ImageIcon(img);
		Image image = ico.getImage();
		Image newimg = image.getScaledInstance(i, j, Image.SCALE_SMOOTH);
		return new ImageIcon(newimg);
	}
}
