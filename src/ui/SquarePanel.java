/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import demineur.Flag;
import demineur.Square;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

    
/**
 *
 * @author Dimitri
 */
public class SquarePanel extends JPanel{
    
    private Square square;
    private static int DIMENSION = 25;
    private static int CST = 3;
    
    public SquarePanel(Square square){
        this.square = square;
        setBounds((square.getX()+1)*CST+square.getX()*DIMENSION,(square.getY()+1)*CST+square.getY()*DIMENSION,DIMENSION,DIMENSION);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(square.getFlag().equals(Flag.NONE))
            g.setColor(Color.LIGHT_GRAY);
        else if(square.getFlag().equals(Flag.ISCLEARED))
            g.setColor(Color.WHITE);
        else if(square.getFlag().equals(Flag.DISAMORCED))
            g.setColor(Color.RED);
        g.fillRect(0, 0, DIMENSION, DIMENSION);
        if(square.getFlag().equals(Flag.ISCLEARED) && square.getMines() != 0){
            g.setColor(Color.BLACK);
            g.drawString(""+square.getMines(),0, 10);
        }
    }
    
    public Square getSquare(){
        return square;
    }

    public void setMines(int mines){
        square.setMines(mines);
    }
}
