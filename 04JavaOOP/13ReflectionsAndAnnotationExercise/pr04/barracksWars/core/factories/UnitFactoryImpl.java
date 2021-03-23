package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.models.units.*;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

//	@Override
//	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
//		// TODO: implement for problem 3
//		throw new ExecutionControl.NotImplementedException("message");
//	}

    @Override
    public Unit createUnit(String unitType) {
        Unit unit = null;
        try {
            Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
            //Object o = clazz.getDeclaredConstructor().newInstance(unitType);
			// правим инстанция на юнит като кастваме:
            unit = (Unit) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException
                | NoSuchMethodException
                | InstantiationException
                | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        return unit;

        // При сутч има проблем?
//        switch (unitType) {
//            case "Archer":
//            	return new Archer();
//            case "Gunner":
//            	return new Gunner();
//            case "Horseman":
//            	return new Horseman();
//            case "Pikeman":
//            	return new Pikeman();
//            case "Swordsman":
//            	return new Swordsman();
//        }

//        return null;
    }
}

