package main.beverages;

import main.temperatures.Coolable;

public class ColdBeverage extends Beverage implements Coolable {
   private int temperature;
   
   @Override
   public int currentTemperature() {
      return temperature;
   }
   
   @Override
   public int coolDownWith(int number) {
      return number;
   }
   
   public void setForMinutes(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(3);
   }
   
   public void setForHours(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(10);
   }
   
   public void setForDays(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(20);
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
