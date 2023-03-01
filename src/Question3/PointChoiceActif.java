package Question3;

public class PointChoiceActif extends PointChoice{

	public PointChoiceActif(int x, int y) {
		super(x, y);
		
		this.xPlus.setOnAction(e ->{
			this.x++;
			this.coord.setText("(" + this.x + ";" + this.y + ")");
		});
		this.xMoins.setOnAction(e ->{
			this.x--;
			this.coord.setText("(" + this.x + ";" + this.y + ")");
		});
		this.yPlus.setOnAction(e ->{
			this.y++;
			this.coord.setText("(" + this.x + ";" + this.y + ")");
		});
		this.yMoins.setOnAction(e ->{
			this.y--;
			this.coord.setText("(" + this.x + ";" + this.y + ")");
		});
		
		
		
		this.coord.setOnScroll(e->{
			
			//ça marche (changement de x/y en fonction de la ou est la souris, mais très mal.. 
			if(e.getX() < this.coord.getLayoutX()/2) {
				this.x = this.x - (int) e.getDeltaY();
				this.coord.setText("(" + this.x + ";" + this.y + ")");
			}else {
				this.y = this.y - (int) e.getDeltaY();
				this.coord.setText("(" + this.x + ";" + this.y + ")");
			}
		});
		
	}

}
