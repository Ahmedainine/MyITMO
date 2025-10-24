package mypokemons;

import mymoves.togepi.FireBlast;
import mymoves.togepi.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon{
	public Togepi(String name , int level)
	{
		super(name , level);
		super.setType(Type.FAIRY);
		super.setStats(35,20,65,40,65,20);
		
		FireBlast fireblast = new FireBlast(110,85);
	    Rest rest = new Rest(0,0);
		
		super.setMove(fireblast,rest);
	}

}
