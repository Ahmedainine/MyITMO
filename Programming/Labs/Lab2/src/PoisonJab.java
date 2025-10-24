package mymoves.zangoose;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class PoisonJab extends PhysicalMove {
	public PoisonJab(double pow , double acc)
	{
		super(Type.POISON,pow , acc);
	}

	
@Override
	
	protected void applyOppEffects(Pokemon p)
	{
		super.applyOppEffects(p);
		if(Math.random() < 0.3)
		{
			Effect.poison(p);
		}
	}
@Override
	protected String describe()
	{
		return "used Poison Jab";
	}

}
