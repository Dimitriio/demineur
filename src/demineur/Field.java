package demineur;

import java.util.ArrayList;

public class Field {

    private Setup setup;
    private ArrayList<Mine> mineField;

    public Field(Difficulty difficulty){
        this.setup = new Setup(difficulty);
        initializeField();
    }

    public Setup getSetup() {
        return setup;
    }

    public ArrayList<Mine> getMineField() {
        return mineField;
    }

    private void initializeField(){
        this.mineField = new ArrayList<>(this.setup.getMines());
        for(int i = 0 ; i < setup.getMines() ; i++){
            while(true){
                int x,y;
                x = (int) Math.round( Math.random()*( setup.getX()-1 ) );
                y = (int) Math.round( Math.random()*( setup.getY()-1 ) );
                if(!this.isMine(x, y)){
                    this.mineField.add(new Mine(x ,y));
                    break;
                }
            }
        }
    }

    public int mines(int x, int y){
        int nbr = 0;
        for(Mine mine : this.mineField){
            if(Math.abs(mine.getX() - x) <= 1 &&  Math.abs(mine.getY() - y) <= 1)
                nbr++;
        }
        return nbr;
    }

    public boolean isMine(int x, int y){
        for(Mine mine : mineField)
            if(mine.getX() == x && mine.getY() == y)
                return true;
        return false;
    }
}
