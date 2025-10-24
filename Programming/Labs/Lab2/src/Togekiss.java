package mypokemons;


import mymoves.togekiss.Roost;
import mymoves.togepi.FireBlast;
import mymoves.togepi.Rest;
import mymoves.togetic.SmartStrike;
import ru.ifmo.se.pokemon.Type;

public class Togekiss extends Togetic {
	public Togekiss(String name , int level)
	{
		super(name , level);
		super.setType(Type.FAIRY,Type.FLYING);
		super.setStats(85,50,95,120,115,80);
		
		FireBlast fireblast = new FireBlast(110,85);
	    Rest rest = new Rest(0,0);
		SmartStrike smartstrike = new SmartStrike(70,0);
		Roost roost = new Roost(0,0);
		
		super.setMove(fireblast , rest , smartstrike ,roost);
	}

}
