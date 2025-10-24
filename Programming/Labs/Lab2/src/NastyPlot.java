package mymoves.vullaby;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class NastyPlot extends StatusMove{
	public NastyPlot(double pow , double acc)
	{
		super(Type.DARK , pow , acc);
	}

	@Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "uses Nasty Plot to raise its Special Attack by 2 stages";
    }
}
