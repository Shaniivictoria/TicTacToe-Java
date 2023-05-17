import java.awt.Color;
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
    int[][]board = new int[3][3];

    int loneWidth = 5;
    int lineLength = 270;
    int x = 15, y = 270;
    int offset = 95;
    int a = 0;
    int b = 5;
    int selX = 0;

    Color turtle = new Color(0x80bdab);
    Color orange = new Color(0xfdcb9e);
    Color offwhite = new Color (0xf7f7f7);
    Color darkgray = new Color(0x3f3f44);
    



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