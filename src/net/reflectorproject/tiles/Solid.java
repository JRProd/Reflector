package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Solid extends Tile
{
	public Solid() {
		this(null,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Solid(Grid w)
	{
		this(w,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y) {
		this(w,x,y,false,null,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y, boolean move) {
		this(w,x,y,move,null,(byte)0);
	}

	public Solid(Grid w,byte x, byte y, boolean move, String src) {
		this(w,x,y,move,src,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y, boolean move, String src, byte direct) {
		super(w,x, y, move, src, direct);
	}

	public void update() 
	{
		// TODO Auto-generated method stub
		//Getting error message "The type Solid must implement the inherited abstract method Tile.update()"
	}
	
	
	public void paint()
	{
		//TODO Auto-generated method stub
		//Getting error message
	}
}

