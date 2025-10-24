package mypokemons;


import mymoves.zangoose.FlameThrower;
import mymoves.zangoose.FurySwipes;
import mymoves.zangoose.PoisonJab;
import mymoves.zangoose.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zangoose extends Pokemon{
	public Zangoose(String name , int level)
	{
		super(name , level);
		super.setType(Type.NORMAL);
		super.setStats(73,115,60,60,60,90);
		
		PoisonJab poisonjab = new PoisonJab(80,100);
		FlameThrower flamethrower = new FlameThrower(90,100);
		Slash slash = new Slash(70,100);
		FurySwipes furyswipes = new FurySwipes(18,80);
		
		super.setMove(poisonjab , flamethrower , slash , furyswipes);
	}
	
	
	


}
