package mymoves.togekiss;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class Roost extends StatusMove {
	public Roost(double pow , double acc)
	{
		super(Type.FLYING,pow,acc);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p) {
        double maxHP = p.getStat(Stat.HP);
        double heal = maxHP / 2;
        p.setMod(Stat.HP, (int)(-heal));
    }

    @Override
    protected String describe() {
        return "uses Roost and recovers HP!";
    }

}
