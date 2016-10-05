package demineur;

public class Setup {

	private int Mines;
	private int X,Y;
	
	public Setup(Difficulty difficulty){
		switch (difficulty) {
		case EASY:
			this.X = 9;
			this.Y = 9;
			this.Mines = 10;
			break;
		case MEDIUM:
			this.X = 16;
			this.Y = 16;
			this.Mines = 40;
			break;
		case HARD:
			this.X = 30;
			this.Y = 16;
			this.Mines = 99;
			break;
		default:
			this.X = 16;
			this.Y = 16;
			this.Mines = 40;
			break;
		}
	}

	public int getMines() {
		return Mines;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
}
