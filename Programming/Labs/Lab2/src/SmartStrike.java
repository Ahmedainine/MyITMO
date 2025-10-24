package mymoves.togetic;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class SmartStrike extends PhysicalMove {
	public SmartStrike(double pow , double acc)
	{
		super(Type.STEEL,pow ,acc);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) {
	    return true;
	}
	 @Override
	    protected String describe() {
	        return "uses Smart Strike and never misses!";
	    }

}
