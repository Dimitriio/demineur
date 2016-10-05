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
public class Land extends Square{

    public Land(int x, int y) {
        super(x, y);
        color = Color.WHITE;
    }

    @Override
    public boolean isMine() {
        return false;
    }
    
}
