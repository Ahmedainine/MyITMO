package mypokemons;

import mymoves.vullaby.DoubleTeam;
import mymoves.vullaby.NastyPlot;
import mymoves.vullaby.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vullaby extends Pokemon {
	public Vullaby(String name , int level)
	{
		super(name , level);
		super.setType(Type.DARK,Type.FLYING);
		super.setStats(70,55,75,45,65,60);
		
		RockTomb rocktomb = new RockTomb(60,95);
		NastyPlot nastyplot = new NastyPlot(0,100);
		DoubleTeam doubleteam = new DoubleTeam(0,100);
		
		super.setMove(rocktomb,nastyplot,doubleteam);
	}

}
