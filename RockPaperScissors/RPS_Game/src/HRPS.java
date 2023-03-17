import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HRPS extends JFrame implements ActionListener {
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JButton spockButton;
    private JButton lizardButton;
    private JLabel resultLabel;
    private JButton Yes;
    private JButton No;
    private JLabel playerScoreD;
    private int playerScore;
    Container c = getContentPane();
    

    static Color GBGC;

    HRPS(){
        getContentPane().setBackground(GBGC);
        this.setFocusable(true);
        Game();
    }


    public void Game() {
        // Create the buttons and add an action listener to each as well as adding fonts and designs(feel free to reconfigure just remember to tell before you commit)
        rockButton = new JButton("rock");
        rockButton.addActionListener(this);
        rockButton.setIcon(new ImageIcon("rock.png"));
        rockButton.setBounds(getBounds());
        rockButton.setSize(25, 25);
        rockButton.setBounds(50,50,50,50);
        rockButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        rockButton.setHorizontalTextPosition(JButton.CENTER);
        rockButton.setVerticalTextPosition(JButton.BOTTOM);
        rockButton.setBorder(BorderFactory.createEtchedBorder());
        rockButton.setFocusable(false);
        

        paperButton = new JButton("paper");
        paperButton.addActionListener(this);
        paperButton.setIcon(new ImageIcon("paper.png"));
        paperButton.setSize(25, 25);
        paperButton.setBounds(50,50,50,50);
        paperButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        paperButton.setHorizontalTextPosition(JButton.CENTER);
        paperButton.setVerticalTextPosition(JButton.BOTTOM);
        paperButton.setBorder(BorderFactory.createEtchedBorder());
        paperButton.setFocusable(false);
  


        scissorsButton = new JButton("scissors");
        scissorsButton.addActionListener(this);
        scissorsButton.setIcon(new ImageIcon("scissor.png"));
        scissorsButton.setSize(25, 25);
        scissorsButton.setBounds(50,50,50,50);
        scissorsButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        scissorsButton.setHorizontalTextPosition(JButton.CENTER);
        scissorsButton.setVerticalTextPosition(JButton.BOTTOM);
        scissorsButton.setBorder(BorderFactory.createEtchedBorder());
        scissorsButton.setFocusable(false);

        spockButton = new JButton("spock");
        spockButton.addActionListener(this);
        spockButton.setIcon(new ImageIcon("spock.png"));
        spockButton.setSize(25, 25);
        spockButton.setBounds(50,50,50,50);
        spockButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        spockButton.setHorizontalTextPosition(JButton.CENTER);
        spockButton.setVerticalTextPosition(JButton.BOTTOM);
        spockButton.setBorder(BorderFactory.createEtchedBorder());
        spockButton.setFocusable(false);

        lizardButton = new JButton("lizard");
        lizardButton.addActionListener(this);
        lizardButton.setIcon(new ImageIcon("lizard.png"));
        lizardButton.setSize(25, 25);
        lizardButton.setBounds(50,50,50,50);
        lizardButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        lizardButton.setHorizontalTextPosition(JButton.CENTER);
        lizardButton.setVerticalTextPosition(JButton.BOTTOM);
        lizardButton.setBorder(BorderFactory.createEtchedBorder());
        lizardButton.setFocusable(false);
    

        // Create the result label
        resultLabel = new JLabel();
        playerScoreD = new JLabel("Score: " + playerScore);
        playerScoreD.setFont(new Font("Arial", Font.BOLD, 15));
        playerScoreD.setVerticalTextPosition(JLabel.BOTTOM);
        playerScoreD.setHorizontalTextPosition(JLabel.RIGHT);
        playerScoreD.setHorizontalAlignment(JLabel.RIGHT);
        playerScoreD.setVerticalTextPosition(JLabel.BOTTOM);
        playerScoreD.setLocation(500,500);

       // Add the buttons and result label to the content pane
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setSize(250, 1500);
        c.add(playerScoreD);
        c.add(rockButton);
        c.add(paperButton);
        c.add(scissorsButton);
        c.add(spockButton);
        c.add(lizardButton);
        c.add(resultLabel);
        c.setBackground(GBGC);

        // Set the window properties
        setTitle("Rock Paper Scissors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determine which button was clicked
        if (e.getSource() == rockButton) {
            // Set the result label to display the rock icon
            resultLabel.setIcon(new ImageIcon("rock.png"));
        } else if (e.getSource() == paperButton) {
            // Set the result label to display the paper icon
            resultLabel.setIcon(new ImageIcon("paper.png"));
        } else if (e.getSource() == scissorsButton) {
            // Set the result label to display the scissors icon
            resultLabel.setIcon(new ImageIcon("scissor.png"));
        }else if (e.getSource() == spockButton) {
            // Set the result label to display the spock icon
            resultLabel.setIcon(new ImageIcon("spock.png"));
        }else if (e.getSource() == lizardButton) {
            // Set the result label to display the spock icon
            resultLabel.setIcon(new ImageIcon("lizard.png"));
        }
        String playerChoice = e.getActionCommand();

        
        // generate computer's choice
        String[] choices = {"rock", "paper", "scissors","spock","lizard"};
        int computerIndex = (int)(Math.random() * choices.length);
        String computerChoice = choices[computerIndex];

        
        // determine winner
        String result;
        if (playerChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                || (playerChoice.equals("rock") && computerChoice.equals("lizard"))
                || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                || (playerChoice.equals("paper") && computerChoice.equals("spock"))
                || (playerChoice.equals("scissors") && computerChoice.equals("paper"))
                || (playerChoice.equals("scissors") && computerChoice.equals("lizard"))
                || (playerChoice.equals("spock") && computerChoice.equals("scissors"))
                || (playerChoice.equals("spock") && computerChoice.equals("rock"))
                || (playerChoice.equals("lizard") && computerChoice.equals("spock"))
                || (playerChoice.equals("lizard") && computerChoice.equals("paper"))) {

                    playerScore++;
                    playerScoreD.setText("Score: "+ playerScore);
            result = "You win!";
        } else {
            result = "Computer wins!";

            dispose();
            new TryAgain();
        



        }
        
        
        // update result label
        resultLabel.setText("You chose " + playerChoice + ". Computer chose " + computerChoice + ". " + result);
        
  


        


    

}

}
