package bakery.core;

import bakery.common.ExceptionMessages;
import bakery.common.OutputMessages;
import bakery.common.enums.BakedFoodType;
import bakery.common.enums.DrinkType;
import bakery.common.enums.TableTYpe;
import bakery.core.interfaces.Controller;
import bakery.entities.bakedFoods.Bread;
import bakery.entities.bakedFoods.Cake;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.BaseDrink;
import bakery.entities.drinks.Tea;
import bakery.entities.drinks.Water;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.tables.InsideTable;
import bakery.entities.tables.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.*;

public class ControllerImpl implements Controller {


    private FoodRepository<BakedFood> foodRepository;
    private DrinkRepository<Drink> drinkRepository;
    private TableRepository<Table> tableRepository;
    private double totalIncome;

    public ControllerImpl(FoodRepository<BakedFood> foodRepository, DrinkRepository<Drink> drinkRepository, TableRepository<Table> tableRepository) {
        this.foodRepository = foodRepository;
        this.drinkRepository = drinkRepository;
        this.tableRepository = tableRepository;
        this.totalIncome = 0.00;
    }


    @Override
    public String addFood(String type, String name, double price) {
        BakedFood bakedFood = this.foodRepository.getByName(name);
        if (bakedFood != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.FOOD_OR_DRINK_EXIST, type, name));
        }
        BakedFoodType bakedFoodType = BakedFoodType.valueOf(type);
        if (bakedFoodType.equals(bakedFoodType.Bread)) {
            bakedFood = new Bread(name, price);
        } else {
            bakedFood = new Cake(name, price);
        }
        this.foodRepository.add(bakedFood);
        return String.format(OutputMessages.FOOD_ADDED, name, type);
    }

    @Override
    public String addDrink(String type, String name, int portion, String brand) {
        Drink drink = this.drinkRepository.getByNameAndBrand(name, brand);
        if (drink != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.FOOD_OR_DRINK_EXIST, name, type));
        }
        DrinkType drinkType = DrinkType.valueOf(type);
        if (drinkType.equals(DrinkType.Tea)) {
            drink = new Tea(name, portion, brand);
        } else {
            drink = new Water(name, portion, brand);
        }
        this.drinkRepository.add(drink);
        return String.format(OutputMessages.DRINK_ADDED, name, brand);
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table tableByNumber = this.tableRepository.getByNumber(tableNumber);
        if (tableByNumber != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.TABLE_EXIST, tableNumber));
        }
        TableTYpe tableTYpe = TableTYpe.valueOf(type);
        if (tableTYpe.equals(TableTYpe.InsideTable)) {
            tableByNumber = new InsideTable(tableNumber, capacity);
        } else {
            tableByNumber = new OutsideTable(tableNumber, capacity);
        }
        this.tableRepository.add(tableByNumber);
        return String.format(OutputMessages.TABLE_ADDED, tableNumber);
    }

    @Override
    public String reserveTable(int numberOfPeople) {
        for (Table table : this.tableRepository.getAll()) {
            if (!table.isReserved() && table.getCapacity() >= numberOfPeople) {
                table.reserve(numberOfPeople);
                return String.format(OutputMessages.TABLE_RESERVED, table.getTableNumber(), numberOfPeople);
            }
        }
        return String.format(OutputMessages.RESERVATION_NOT_POSSIBLE, numberOfPeople);
    }

    @Override
    public String orderFood(int tableNumber, String foodName) {
        Table tableByNumber = tableRepository.getByNumber(tableNumber);
        if (tableByNumber == null || !tableByNumber.isReserved()) {
            throw new IllegalArgumentException(String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber));
        }

        BakedFood bakedFood = this.foodRepository.getByName(foodName);
        if (bakedFood == null) {
            return String.format(OutputMessages.NONE_EXISTENT_FOOD, foodName);
        }

        tableByNumber.orderFood(bakedFood);
        return String.format(OutputMessages.FOOD_ORDER_SUCCESSFUL, tableNumber, foodName);
    }

    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {
        Table tableByNumber = this.tableRepository.getByNumber(tableNumber);
        if (tableByNumber == null || !tableByNumber.isReserved()) {
            throw new IllegalArgumentException(String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber));
        }
        Drink drinkByNameAndBrand = this.drinkRepository.getByNameAndBrand(drinkName, drinkBrand);
        if (drinkByNameAndBrand == null) {
            return (String.format(OutputMessages.NON_EXISTENT_DRINK, drinkName, drinkBrand));
        }
        tableByNumber.orderDrink(drinkByNameAndBrand);
        return String.format(OutputMessages.DRINK_ORDER_SUCCESSFUL, tableNumber, drinkName, drinkBrand);

    }

    @Override
    public String leaveTable(int tableNumber) {
        Table tableByNumber = this.tableRepository.getByNumber(tableNumber);
        double bill = tableByNumber.getBill();
        this.totalIncome+=bill;
        tableByNumber.clear();
        return String.format(OutputMessages.BILL, tableNumber, bill);
//            int tableNumber1 = tableByNumber.getTableNumber();
//            tableByNumber.clear();
//            StringBuilder sb = new StringBuilder();
//            sb.append(String.format("Table: %d", tableNumber));
//            sb.append(System.lineSeparator());
//            sb.append(String.format("Bill: %.2f", bill));
//            return sb.toString().trim();
    }

    @Override
    public String getFreeTablesInfo() {
        StringBuilder sb = new StringBuilder();
        for (Table table : this.tableRepository.getAll()) {
            if (!table.isReserved()) {
                sb.append(table.getFreeTableInfo()).append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String getTotalIncome() {
        return String.format(OutputMessages.TOTAL_INCOME, this.totalIncome);
    }
}
