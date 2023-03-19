package barracksWars.core.commands;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Retire extends Command {
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        try {
            getRepository().removeUnit(unitType);
            return String.format("%s retired!", unitType);

        } catch (IllegalArgumentException | ExecutionControl.NotImplementedException e) {
            return e.getMessage();
        }
    }
}
