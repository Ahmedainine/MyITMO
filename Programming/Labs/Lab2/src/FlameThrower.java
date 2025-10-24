package mymoves.zangoose;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FlameThrower extends SpecialMove{
	public FlameThrower(double pow , double acc)
	{
		super(Type.FIRE ,pow,acc);
	}

@Override
	
	protected void applyOppEffects(Pokemon p)
	{
		super.applyOppEffects(p);
		if(Math.random() < 0.1)
		{
			Effect.burn(p);
		}
	}
@Override
	protected String describe()
	{
		return "used Flame Thrower";
	}
}

