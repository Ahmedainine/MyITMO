package mypokemons;

import mymoves.togepi.FireBlast;
import mymoves.togepi.Rest;
import mymoves.togetic.SmartStrike;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Togepi{
	public Togetic(String name , int level)
	{
		super(name , level);
		super.setType(Type.FAIRY,Type.FLYING);
		super.setStats(55,40,85,80,105,40);
		
		FireBlast fireblast = new FireBlast(110,85);
	    Rest rest = new Rest(0,0);
		SmartStrike smartstrike = new SmartStrike(70,0);
		
		super.setMove(fireblast , rest , smartstrike);
	}
	

}
