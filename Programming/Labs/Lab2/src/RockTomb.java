package mymoves.vullaby;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove{
	public RockTomb(double pow , double acc)
	{
		super(Type.ROCK,pow , acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "used Rock Tomb and lowers opponent's Speed";
    }

}
