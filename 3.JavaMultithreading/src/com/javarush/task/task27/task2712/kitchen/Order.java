package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by Dmitry Shelemekh on 07.12.2017.
 */
public class Order {
    protected List<Dish> dishes;
    private final Tablet tablet;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty())
            return "";
        return String.format("Your order: %s of %s", dishes.toString(), tablet.toString());
    }
}
