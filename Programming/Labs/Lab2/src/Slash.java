package mymoves.zangoose;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove{
	public Slash(double pow , double acc)
	{
		super(Type.NORMAL,pow ,acc);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
	    if (Math.random() < 1.0 / 8.0) {
	        System.out.println("Critical hit!");
	        return 2.0; // double damage
	    } else {
	        return 1.0; // normal hit
	    }
	}
	@Override
	protected String describe()
	{
		
		return "used Slash ";
	}

}
