/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VRABS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicTacToe extends JPanel {

    boolean player1;
    int winner = -1;
    int[][] board = new int[3][3];
    int x;
    int y;
    PlayFirstBot bot;

    //Win counter
    int player1wins = 0, player2wins = 0;

    //Text
    JLabel turn = new JLabel("Player 1's Turn");
    //Buttons
    JButton playAgainButton = new JButton("Play Again?");

    //Colors
    Color grey = new Color(192, 192, 192);
    Color black = new Color(0, 0, 0);
    Color white = new Color(255, 255, 255);
    Color red = new Color(163, 0, 0);
    Color green = new Color(12, 171, 7);

    public TicTacToe() {
        setBackground(white);
        setPreferredSize(new Dimension(1300, 650));

        player1 = false;
        player1wins = 0;
        player2wins = 0;

        //add label,texts, and buttons to our panel
        add(turn);

        //add listeners - react to clicks and drags etc.
        addMouseListener(new XOListener());
        add(playAgainButton);

        //this button starts the game over
        playAgainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
                repaint();
            }
        });

        bot = new PlayFirstBot();
        this.fillBoardByBot(bot.getFirstOutput());
        //System.out.println(bot.getFirstOutput());
    }

    //
    public void fillBoardByBot(Coordinate coor) {
        board[coor.getKolom()][coor.getBaris()] = 1;
    }

    //paintComponent - this does the drawing and graphics
    public void paintComponent(Graphics page) {

        super.paintComponent(page); //must have this line for the panel to update/call itself
        //useful variables to scale and reposition the game
        int i = 5;
        int j = 5;
        int width = 5;
        int height = 300;
        int xpos = 490;
        int ypos = 218;

        if (player1 == true) {
            turn.setText("Player 1's turn");
        } else {
            turn.setText("Player 2's turn");
        }

        //create game board - 2-by-2 parallel lines - using drawRectangle
        page.setColor(black);
        //vertical lines
        page.fillRoundRect(xpos + 100, 220, width, height, 5, 5);
        page.fillRoundRect(xpos + 200, 220, width, height, 5, 5);
        //horizontal lines
        page.fillRoundRect(xpos, ypos + 100, height, width, 5, 5);
        page.fillRoundRect(xpos, ypos + 200, height, width, 5, 5);

        //convert data from array into actual visual game
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                if (board[x][y] == 1) {   // "1" represents x 
                    //draw X - using drawPolygon()
                    page.setColor(Color.red);
                    int[] m = {xpos + 20 + 100 * x, xpos + 30 + 100 * x, xpos + 50 + 100 * x, xpos + 70 + 100 * x, xpos + 80 + 100 * x,
                        xpos + 60 + 100 * x, xpos + 80 + 100 * x, xpos + 70 + 100 * x, xpos + 50 + 100 * x, xpos + 30 + 100 * x, xpos + 20 + 100 * x,
                        xpos + 40 + 100 * x,};
                    int[] n = {245 + 100 * y, 245 + 100 * y, 265 + 100 * y, 245 + 100 * y, 245 + 100 * y,
                        270 + 100 * y, 295 + 100 * y, 295 + 100 * y, 275 + 100 * y, 295 + 100 * y, 295 + 100 * y,
                        270 + 100 * y};
                    page.fillPolygon(m, n, 12);

                } else if (board[x][y] == 2) {   // "2" represents o 

                    //draw O - using drawOval()
                    page.setColor(Color.green);
                    page.fillOval(xpos + 20 + 100 * x, 240 + 100 * y, 60, 50);
                    page.setColor(white);
                    page.fillOval(xpos + 25 + 100 * x, 243 + 100 * y, 50, 40);
                    page.setColor(Color.green);
                    page.drawOval(xpos + 25 + 100 * x, 243 + 100 * y, 50, 40);
                }
            }
        }

        //announce winner
        page.setFont(new Font("Tahome", Font.PLAIN, 40));
        page.setColor(Color.black);
        if (checkwin() == 1) {
            page.drawString("CONGRATS PLAYER 1, YOU WIN!", 330, 600);
        } else if (checkwin() == 2) {
            page.drawString("CONGRATS PLAYER 2, YOU WON!", 330, 600);
        } else if (checkDraw() == true) {
            page.setFont(new Font("Monospaced", Font.BOLD, 40));
            page.drawString("ITS A DRAW", 520, 600);
        }

        //display player scores
        page.setFont(new Font("Serif", Font.PLAIN, 35));
        page.setColor(Color.black);
        //player1
        page.drawString("Player1", 300, 300);
        page.drawString("has " + player1wins + " wins", 275, 400);
        page.drawString("Player2 ", 900, 300);
        page.drawString("has " + player2wins + " wins", 875, 400);

        ///draws an extra X and O figure
        // draws O
        x = 0;
        y = 0;
        xpos = 900;
        ypos = 315;
        page.setColor(Color.green);
        page.fillOval(xpos + 20 + 100 * x, ypos - 3 + 100 * y, 60, 50);
        page.setColor(white);
        page.fillOval(xpos + 25 + 100 * x, ypos + 100 * y, 50, 40);
        page.setColor(Color.green);
        page.drawOval(xpos + 25 + 100 * x, ypos + 100 * y, 50, 40);

        //draws X
        page.setColor(Color.red);
        x = 0;
        y = 0;
        xpos = 300;
        ypos = 320;
        int[] m = {xpos + 20 + 100 * x, xpos + 30 + 100 * x, xpos + 50 + 100 * x, xpos + 70 + 100 * x, xpos + 80 + 100 * x,
            xpos + 60 + 100 * x, xpos + 80 + 100 * x, xpos + 70 + 100 * x, xpos + 50 + 100 * x, xpos + 30 + 100 * x, xpos + 20 + 100 * x,
            xpos + 40 + 100 * x,};
        int[] n = {ypos + 100 * y, ypos + 100 * y, ypos + 20 + 100 * y, ypos + 100 * y, ypos + 100 * y,
            ypos + 25 + 100 * y, ypos + 50 + 100 * y, ypos + 50 + 100 * y, ypos + 30 + 100 * y, ypos + 50 + 100 * y, ypos + 50 + 100 * y,
            ypos + 25 + 100 * y};
        page.fillPolygon(m, n, 12);
    }

    //reset method
    public void reset() {
        //clears the game board - goes thorugh the array
        //sets everything to 0, player1 to true
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
        winner = -1;
        player1 = false;
        
        this.fillBoardByBot(bot.getFirstOutput());
    }

    //checkdraw
    public boolean checkDraw() {
        boolean completed = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    completed = false;
                }
            }
        }
        if (completed == false) {
            System.out.println("keep playing");
        } else if (completed == true) {
            System.out.println("its a draw");
        }
        return completed;
    }

    //checkwin method
    public int checkwin() {
        //checks to see if any winner
        //check vertical
        //winner = -1;
        int m = -1;
        for (int i = 0; i < board.length; i++) {
            int a = board[i][0];
            int b = board[i][1];
            int c = board[i][2];
            if ((a == b) && (b == c)) {
                winner = a;
            }
        }

        //check horizontal
        for (int i = 0; i < board.length; i++) {
            int a = board[0][i];
            int b = board[1][i];
            int c = board[2][i];
            if ((a == b) && (b == c)) {
                winner = a;
            }
        }

        //check \ diagonal
        int a = board[0][0];
        int b = board[1][1];
        int c = board[2][2];
        if ((a == b) && (b == c)) {
            winner = a;
        }

        //check / diagonal
        a = board[0][2];
        b = board[1][1];
        c = board[2][0];
        if ((a == b) && (b == c)) {
            winner = a;
        }
        return winner;
    }

    //mouse events
    private class XOListener implements MouseListener {

        //other mouse events
        public void mousePressed(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }

        //main mouse event
        public void mouseClicked(MouseEvent event) {
            if (checkwin() > 0) {

            } else {

                //get x and y mouse positon
                int a = event.getX();
                int b = event.getY();
                boolean isOutOfBounds = false;
                if ((a < 500) || (b < 200)) {   //out of bounds
                    repaint();
                    isOutOfBounds = true;
                } else if ((a > 780) || (b > 510)) { //out of bounds
                    repaint();
                    isOutOfBounds = true;
                } else {
                    if (a > 500 && a < 580) {
                        x = 0;
                    } else if (a > 600 && a < 680) {
                        x = 1;
                    } else if (a > 700 && a < 780) {
                        x = 2;
                    }
                    if (b > 225 && b < 310) {
                        y = 0;
                    } else if (b > 325 && b < 410) {
                        y = 1;
                    } else if (b > 425 && b < 510) {
                        y = 2;
                    }
                    if (board[x][y] == 1 || board[x][y] == 2) {  //space filled - must play somewhere else
                        repaint();
                        isOutOfBounds = true;
                    } else {
                        if (player1 == true) { //x turn - draw an X
                            board[x][y] = 1;
                        }
                        if (player1 == false) { //o turn - draw an O
                            board[x][y] = 2;
                        }
                    }
                }
                //announce winner
                System.out.println(checkwin());
                if (checkwin() == 1) {
                    player1wins++;
                } else if (checkwin() == 2) {
                    player2wins++;
                } else if (checkDraw() == true) {
                    //do nothing
                } else if (!isOutOfBounds) //change turn of if mouse is clicked in a legal position
                {
                    if (player1 == true) { //switch whos turn it is
                        turn.setText("Player 2'S TURN");
                        player1 = !player1;
                    } else {
                        turn.setText("Player 1'S TURN");
                        player1 = !player1;
                    }

                    //adds delay to make an impression that the bot is thinking
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
//                }
                    //Bot reacts to user's input
                    fillBoardByBot(bot.getOutput(new Coordinate(y, x)));
                    turn.setText("Player 2'S TURN");
                    player1 = false;
                    System.out.println(checkwin());
                    if (checkwin() == 1) {
                        player1wins++;
                    } else if (checkwin() == 2) {
                        player2wins++;
                    }
                }

                //update the game
                repaint();
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("TicTacToe Play Second");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1300, 660));
//    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().add(new TicTacToe());
        frame.pack();
        frame.setVisible(true);

    }
}
