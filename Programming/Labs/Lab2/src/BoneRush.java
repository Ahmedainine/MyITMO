package mymoves.mandibuzz;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BoneRush extends PhysicalMove{
	public BoneRush(double pow , double acc)
	{
		super(Type.GROUND , pow , acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon p, double damage) {
	    int hits = 0;
	    double r = Math.random();
	    if (r < 3.0/8) hits = 2;
	    else if (r < 6.0/8) hits = 3;
	    else if (r < 7.0/8) hits = 4;
	    else hits = 5;

	    for (int i = 0; i < hits; i++) {
	        super.applyOppDamage(p, damage); 
	    }
	}

    @Override
    protected String describe() {
        return "uses Bone Rush and hits multiple times";
    }

}
