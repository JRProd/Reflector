package net.reflectorproject.tiles;

public class Receptor extends Solid {

	
	public Receptor() {
		// TODO Auto-generated constructor stub
		this((byte)0,(byte)0,false,null,(byte)0);
	}

	public Receptor(byte x, byte y) {
		this(x, y,false,null,(byte)0);
		// TODO Auto-generated constructor stub
	}
	
	public Receptor(byte x, byte y, boolean move) {
		this(x, y, move,null,(byte)0);
		// TODO Auto-generated constructor stub
	}
	
	public Receptor(byte x, byte y, boolean move, String src) {
		this(x, y, move, src,(byte)0);
		// TODO Auto-generated constructor stub
	}
	
	public Receptor(byte x, byte y, boolean move, String src, byte direct) {
		super(x, y, move, src, direct);
		// TODO Auto-generated constructor stub
	}

	
	public void update()
	{
		
	}
	
	public void paint()
	{
		
		
	}

	

}
