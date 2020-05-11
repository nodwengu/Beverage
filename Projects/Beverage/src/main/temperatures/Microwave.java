package main.temperatures;

public class Microwave {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
   }
   
   public void low(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(30);
   }
   
   public void medium(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(60);
   }
   
   public void high(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(90);
   }
}
