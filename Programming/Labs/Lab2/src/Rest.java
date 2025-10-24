package mymoves.togepi;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove{
	public Rest(double pow , double acc)
	{
		super(Type.PSYCHIC,pow , acc);
		
	}
	
	@Override
    protected void applySelfEffects(Pokemon p) {
        // Heal to full HP
		
        int healAmount = (int)(p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, healAmount);

        // Sleep for 2 turns
        Effect e = new Effect()
                .condition(Status.SLEEP)
                .turns(2);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Rest";
    }

}
