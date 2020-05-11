package main.temperatures;

public class Fridge {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
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
