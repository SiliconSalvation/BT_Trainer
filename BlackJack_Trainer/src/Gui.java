import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
/**
 * The GUI for the program
 * @author Nick Stauffer
 * @author kazuma2448@protonmail.com
 */
public class Gui extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5493253760909545846L;
	JPanel drawPanel;
	FlowLayout flowLayout;
	JButton drawButton;
	JPanel cardsPanel;
	JPanel card1Panel;
	JPanel card2Panel;
	JPanel card3Panel;
	
	Deck deck = new Deck();
	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	
	public Gui() {
		
		setTitle("Black Jack Trainer");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700,400);
		
		drawPanel = new JPanel();
		drawPanel.setBackground(new Color(51, 153, 102));
		flowLayout = (FlowLayout) drawPanel.getLayout();
		flowLayout.setHgap(100);
		getContentPane().add(drawPanel, BorderLayout.SOUTH);
		
		drawButton = new JButton("Draw");
		drawPanel.add(drawButton);
		drawButton.addActionListener(new DrawButtonListener());
		
		cardsPanel = new JPanel();
		getContentPane().add(cardsPanel, BorderLayout.CENTER);
		cardsPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		card1Panel = new JPanel();
		card1Panel.setBackground(new Color(51, 153, 102));
		cardsPanel.add(card1Panel);
		
		card1 = new JLabel("");
		card1Panel.add(card1);
		
		card2Panel = new JPanel();
		card2Panel.setBackground(new Color(51, 153, 102));
		cardsPanel.add(card2Panel);
		
		card2 = new JLabel("");
		card2Panel.add(card2);
		
		card3Panel = new JPanel();
		card3Panel.setBackground(new Color(51, 153, 102));
		cardsPanel.add(card3Panel);
		
		card3 = new JLabel("");
		card3Panel.add(card3);
		
		setVisible(true);
	}
	
	private class DrawButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Random rand = new Random();
			
			
			
			card1.setIcon(deck.getDeck()[rand.nextInt(52)].getIcon());
			deck.shuffle(deck.getDeck(), 52);;
			card2.setIcon(deck.getDeck()[rand.nextInt(52)].getIcon());
			card3.setIcon(deck.getDeck()[rand.nextInt(52)].getIcon());
			
			
		}
		
	}
	
	
}
