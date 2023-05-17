import java.awt.Dimension;
import java.awt.color.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.font.*;
import java.awt.Toolkit;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.io.*;
import java.util.Scanner;



public class TicTacToe extends JPanel{

    boolean playerX;
    boolean gameDOne = false;
    int winner = -1;
    int player1wins = 0, player2wins = 0;
    iont[][]board




    public TicTacToe(){
        Dimension size = new Dimension(420, 300);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);

    }
    public static void main(String[]args){
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.getContentPane();

        TicTacToe tpanel = new TicTacToe();
        frame.add(tpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }
}