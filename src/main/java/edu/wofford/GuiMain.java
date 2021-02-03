package edu.wofford;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiMain extends JFrame implements ActionListener {

    private JLabel result;
    int turn = 0;
    public JButton location00,location01,location02,location10,location11, location12,location20,location21,location22;
    protected edu.wofford.TicTacToeModel new_game = new edu.wofford.TicTacToeModel();

    public void actionPerformed(ActionEvent event) {

        if(event.getSource() == location00) {

            new_game.makeAMove(0,0);
            location00.setText(new_game.XorOChar());
            location00.setEnabled(false);  

        } else if(event.getSource() == location01) {

            new_game.makeAMove(0,1);
            location01.setText(new_game.XorOChar());
            location01.setEnabled(false);

        } else if(event.getSource() == location02) {

            new_game.makeAMove(0,2);
            location02.setText(new_game.XorOChar());
            location02.setEnabled(false);

        } else if(event.getSource() == location10) {

            new_game.makeAMove(1,0);
            location10.setText(new_game.XorOChar());
            location10.setEnabled(false);

        } else if(event.getSource() == location11) {

            new_game.makeAMove(1,1);
            location11.setText(new_game.XorOChar());
            location11.setEnabled(false);

        } else if(event.getSource() == location12) {

            new_game.makeAMove(1,2);
            location12.setText(new_game.XorOChar());
            location12.setEnabled(false);

        } else if(event.getSource() == location20) {

            new_game.makeAMove(2,0);
            location20.setText(new_game.XorOChar());
            location20.setEnabled(false);

        } else if(event.getSource() == location21) {

            new_game.makeAMove(2,1);
            location21.setText(new_game.XorOChar());
            location21.setEnabled(false);

        } else {

            new_game.makeAMove(2,2);
            location22.setText(new_game.XorOChar());
            location22.setEnabled(false);
        }

        if(new_game.hasWon() == true) {

            result.setText(new_game.getWinner() + " wins");
            location00.setEnabled(false);
            location01.setEnabled(false);
            location02.setEnabled(false);
            location10.setEnabled(false);
            location11.setEnabled(false);
            location12.setEnabled(false);
            location20.setEnabled(false);
            location21.setEnabled(false);
            location22.setEnabled(false);

        } else if (location00.isEnabled() == false 
        && location01.isEnabled() == false 
        && location02.isEnabled() == false 
        && location10.isEnabled() == false 
        && location11.isEnabled() == false 
        && location12.isEnabled() == false 
        && location20.isEnabled() == false 
        && location21.isEnabled() == false 
        && location22.isEnabled() == false) {

            result.setText("Tie");
            
        }
}
        

    
    
    public GuiMain() {

        setTitle("Tic Tac Toe");
        // set layout, this doesnt matter as long as locations are set correctly
        GridLayout grid = new GridLayout(3,3);
        setLayout(grid);
        
        
        result = new JLabel("Result: ");
        add(result);

        //creating board locations with corresponding buttons and labels
        // need to add action listeners
        // label them correctly so they are recognized and pass tests
        location00 = new JButton();
        location00.setName("location00");
        location00.addActionListener(this);
        add(location00);

        location01 = new JButton();
        location01.setName("location01");
        location01.addActionListener(this);
        add(location01);

        location02 = new JButton();
        location02.setName("location02");
        location02.addActionListener(this);
        add(location02);

        location10 = new JButton();
        location10.setName("location10");
        location10.addActionListener(this);
        add(location10);

        location11 = new JButton();
        location11.setName("location11");
        location11.addActionListener(this);
        add(location11);

        location12 = new JButton();
        location12.setName("location12");
        location12.addActionListener(this);
        add(location12);

        location20 = new JButton();
        location20.setName("location20");
        location20.addActionListener(this);
        add(location20);

        location21 = new JButton();
        location21.setName("location21");
        location21.addActionListener(this);
        add(location21);

        location22 = new JButton();
        location22.setName("location22");
        location22.addActionListener(this);
        add(location22);

    }

    public static void main(String[] args) {

        GuiMain window = new GuiMain();
        window.setVisible(true);
        window.pack();
        
        
    }
}