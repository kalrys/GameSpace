package tilegame.entities.creatures;

import java.awt.Graphics;

import tilegame.Game;
import tilegame.gfx.Assets;

public class Player extends Creature{
	
	private Game game;

	public Player(Game game, float x, float y) {
		super(x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
	}

	@Override
	public void tick() {
		
	
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.her,(int) x,(int) y, width, height,null);
	}

}
