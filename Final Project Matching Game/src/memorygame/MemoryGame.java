package memorygame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.Random;

/**
 *
 * @author Jonathan
 */
public class MemoryGame extends JFrame {

    /**
     * Program will create random memory game with images.
     */

	private static final long serialVersionUID = 1L;
	
	static String files[] = {"src/captain.png", "src/duck.png", "src/fox.png",
		 "src/game.png", "src/kirby.png", "src/link.png", "src/mario.png",
		 "src/mega.png", "src/pac.png", "src/peach.png", "src/pikachu.png",
		 "src/samus.png", "src/sonic.png", "src/villager.png", "src/yoshi.png"};
    static JButton buttons[];
    ImageIcon closedIcon;
    int numButtons;
    static ImageIcon icons[];
    Timer myTimer;
    
    private final String title = "Memory Match";
    
    int numClicks = 0;
    int oddClickIndex = 0;
    int currentIndex = 0;

    public MemoryGame() {
    	
        // Set the title.
        setTitle(title);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a set BorderLayout
        setLayout(new GridLayout(5, 6, 2, 2));
        
        closedIcon = new ImageIcon("src/final.JPG");
        numButtons = files.length * 2;
        buttons = new JButton[numButtons];
        icons = new ImageIcon[numButtons];
        for (int i = 0, j = 0; i < files.length; i++) {
            icons[j] = new ImageIcon(files[i]);
            buttons[j] = new JButton("");
            buttons[j].addActionListener(new ImageButtonListener());
            buttons[j].setIcon(closedIcon);
            add(buttons[j++]);

            icons[j] = icons[j - 1];
            buttons[j] = new JButton("");
            buttons[j].addActionListener(new ImageButtonListener());
            buttons[j].setIcon(closedIcon);
            add(buttons[j++]);
        }

        // randomize icons array
        Random gen = new Random();
        for (int i = 0; i < numButtons; i++) {
            int rand = gen.nextInt(numButtons);
            ImageIcon temp = icons[i];
            icons[i] = icons[rand];
            icons[rand] = temp;
        }

        // Pack and display the window.
        pack();
        setVisible(true);

        myTimer = new Timer(1000, new TimerListener());
        // myTimer.start();
        
        
    }
    
    //closes hides both clicked images if don't match
    private class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            buttons[currentIndex].setIcon(closedIcon);
            buttons[oddClickIndex].setIcon(closedIcon);
            myTimer.stop();
        }
    }
    //makes buttons unclickable after match
    public void MatchedTile() {
		JButton click1 = buttons[currentIndex];
		JButton click2 = buttons[oddClickIndex];
		
		click1.setEnabled (false);
		click2.setEnabled (false);
	}
    
    private int points = 0;
	
	//one point per correct match
	private void AddPoint() {
		points++;
		setTitle(title + " - " + points + " Points");
	}
    
    private class ImageButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            // we are waiting for timer to pop - no user clicks accepted
            if (myTimer.isRunning())
                return;
            
            numClicks++;
            
            // which button was clicked?
            for (int i = 0; i < numButtons; i++) {
                if (e.getSource() == buttons[i]) {
                    buttons[i].setIcon(icons[i]);
                    currentIndex = i;
                    
                }
            }
            
            // check for even click
            if (numClicks % 2 == 0) {
                // check whether same position is clicked twice!
                if (currentIndex == oddClickIndex) {
                    numClicks--;
                    return;
                }
                // are two images matching?
                if (icons[currentIndex] != icons[oddClickIndex]) {
                    // show images for 1 sec, before flipping back
                    myTimer.start(); 
                // if they match...
                }else if (icons[currentIndex] == icons[oddClickIndex]){
                	//...you get a point...
                	AddPoint();
                	//...and the tiles are unusable but present.
                	MatchedTile();
                	return;
                }else{
                }
            } else {
                // we just record index for odd clicks
                oddClickIndex = currentIndex;
                }
            }
        }

    
    
    public static void main(String[] args) {
        new MemoryGame();
    }

}
