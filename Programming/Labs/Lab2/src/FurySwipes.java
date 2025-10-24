package mymoves.zangoose;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
	public FurySwipes(double pow , double acc)
	{
		super(Type.NORMAL,pow , acc);
	}
	
	 @Override
	    protected void applyOppDamage(Pokemon def, double damage) {
	        // Override default to apply multiple hits
	        int hits = getNumberOfHits();
	        for (int i = 0; i < hits; i++) {
	            super.applyOppDamage(def, damage);
	        }
	    }

	    // Decide how many hits happen this turn
	    private int getNumberOfHits() {
	        double r = Math.random();
	        if (r < 3.0 / 8.0) return 2;
	        else if (r < 6.0 / 8.0) return 3;
	        else if (r < 7.0 / 8.0) return 4;
	        else return 5;
	    }

	    @Override
	    protected String describe() {
	        return "uses Fury Swipes and hits multiple times";
	    }

}
