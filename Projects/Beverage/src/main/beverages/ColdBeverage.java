package main.beverages;

import main.temperatures.Coolable;

public class ColdBeverage extends Beverage implements Coolable {
   private int temperature;
   
   @Override
   public int currentTemperature() {
      return temperature;
   }
   
   @Override
   public void coolDownWith(int number) {
      temperature -= number;
   }
   
   @Override
   public String drink() {
      return "Drink a cold beverage";
   }
   
   public String dontSpill() {
      return "Don't spill your cold drink";
   }
   
   public String drinkWithIce() {
      return "Drink with ice";
   }
}
