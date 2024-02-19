import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public final class CardDistributionGUI extends JFrame {
    public final JPanel mainPanel;
    public final JTextField remaining;
    public final JButton start;
    public final JTextField A;
    public final JTextField B;
    public final JTextField C;
    public final JTextField D;

    public int cardsRemaining;
    public int cardsDealt;

    
    public CardDistributionGUI() {
        /*Frame size and dimenssion*/
        setTitle("Card Distribution");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*Main Panel and details to frame*/
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2));

        JLabel cardsRemainingLabel = new JLabel("Cards Remaining:");
        mainPanel.add(cardsRemainingLabel);
        remaining = new JTextField(10);
        remaining.setEditable(false);
        mainPanel.add(remaining);
        
        /*Player A detials added to frame*/

        JLabel playerALabel = new JLabel("Player A:");
        mainPanel.add(playerALabel);
        A = new JTextField(10);
        A.setEditable(false);
        mainPanel.add(A);
        
        /*Player B details added to frame*/

        JLabel playerBLabel = new JLabel("Player B:");
        mainPanel.add(playerBLabel);
        B = new JTextField(10);
        B.setEditable(false);
        mainPanel.add(B);
        
        /*Player C details added to frame*/

        JLabel playerCLabel = new JLabel("Player C:");
        mainPanel.add(playerCLabel);
        C = new JTextField(10);
        C.setEditable(false);
        mainPanel.add(C);

        /*Player D details added to frame*/
        
        JLabel playerDLabel = new JLabel("Player D:");
        mainPanel.add(playerDLabel);
        D = new JTextField(10);
        D.setEditable(false);
        mainPanel.add(D);

        
        /*Button to start the game */
        start = new JButton("Distribute Cards");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distributeCards();
            }
        });
        /*add button to panel and start the game*/
        mainPanel.add(start);

        add(mainPanel);

        initializeGame();
    }
    
    
    

    public void initializeGame() {
        cardsRemaining = 52;
        cardsDealt = 0;
        updateCardsRemainingField();
        clearPlayerFields();
    }

    
    /*Message after total cards are 0*/
    public void distributeCards() {
        if (cardsRemaining <= 0) {
            JOptionPane.showMessageDialog(this, "No cards remaining to distribute.");
            return;
        }

        /*Distribution of cards in the respective field taking array into considration*/
       
        List<Integer> card = new ArrayList<>();   /* line of code written in Java that creates an empty list named card that can hold integer values.*/
        for (int i = 0; i < 4; i++) {
            int cardsToDeal = (i + 1) * 2;
            if (cardsRemaining < cardsToDeal) {
                cardsToDeal = cardsRemaining;
            }
            card.add(cardsToDeal);
            cardsRemaining -= cardsToDeal;
        }

        /*Update the textfields after each click and set the index value to respective textfield*/
        updateCardsRemainingField();

        A.setText(String.valueOf(card.get(0)));
        B.setText( String.valueOf(card.get(1)));
        C.setText(String.valueOf(card.get(2)));
        D.setText(String.valueOf(card.get(3)));

        cardsDealt += card.get(0) + card.get(1) + card.get(2) + card.get(3);
    }

    public void updateCardsRemainingField() {
        remaining.setText(String.valueOf(cardsRemaining));
    }

    public void clearPlayerFields() {
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardDistributionGUI().setVisible(true);
            }
        });
    }
}
