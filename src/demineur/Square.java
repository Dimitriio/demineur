/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;

import java.awt.Color;

/**
 *
 * @author Dimitri
 */
public abstract class Square {
    
    protected int x,y;
    protected Flag flag;
    protected Color color;
    protected int mines;
    private boolean spreaded;
    
    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.flag = Flag.NONE;
        mines = 0;
        spreaded = false;
    }

    public Flag getFlag() {
            return flag;
    }

    public void setFlag(Flag flag) {
            this.flag = flag;
    }

    public int getX() {
            return x;
    }

    public int getY() {
            return y;
    }
    
    public abstract boolean isMine();

    public Color getColor() {
        return color;
    }

    public void setMines(int mines) {
        this.mines = mines;
    }

    public int getMines() {
        return mines;
    }
    
    public boolean hasBeenSpreaded() {
        return spreaded;
    }
    
    public void resetSpreaded(){
        this.spreaded = false;
    }
    
    public void spreaded(){
        this.spreaded = true;
    }

    public void toggleFlag() {
        if(flag.equals(Flag.DISAMORCED))
            flag = Flag.NONE;
        else 
            flag = Flag.DISAMORCED;
    }
}
