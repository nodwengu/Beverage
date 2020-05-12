package main.temperatures;

public class Fridge {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
   }
   
   public void coolForMinutes(Coolable coolableObj) {
      coolableObj.coolDownWith(3);
      temperature = coolableObj.currentTemperature();
   }
   
   public void coolForHours(Coolable coolableObj) {
      coolableObj.coolDownWith(10);
      temperature = coolableObj.currentTemperature();
   }
   
   public void coolForDays(Coolable coolableObj) {
      coolableObj.coolDownWith(20);
      temperature = coolableObj.currentTemperature();
   }
   
   
}
