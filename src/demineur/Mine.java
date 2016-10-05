package demineur;

import java.awt.Color;

public class Mine extends Square{
    
    public Mine(int x, int y){
        super(x,y);
        color = Color.LIGHT_GRAY;
    }

    @Override
    public boolean isMine() {
        return true;
    }

}
