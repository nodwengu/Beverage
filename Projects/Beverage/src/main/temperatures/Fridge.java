package main.temperatures;

public class Fridge implements Coolable {
   private int temperature;
   
   @Override
   public int currentTemperature() {
      return temperature;
   }
   
   @Override
   public int coolDownWith(int number) {
      return number;
   }
   
   public void coolForMinutes(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(3);
   }
   
   public void coolForHours(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(10);
   }
   
   public void coolForDays(Coolable coolableObj) {
      temperature = coolableObj.coolDownWith(20);
   }
   
   
}
