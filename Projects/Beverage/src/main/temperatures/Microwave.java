package main.temperatures;

public class Microwave {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
   }
   
   public void low(Heatable heatableObj) {
      heatableObj.heatUpTo(30);
      temperature = heatableObj.currentTemperature();
   }
   
   public void medium(Heatable heatableObj) {
      heatableObj.heatUpTo(60);
      temperature = heatableObj.currentTemperature();
   }
   
   public void high(Heatable heatableObj) {
      heatableObj.heatUpTo(90);
      temperature = heatableObj.currentTemperature();
   }
}
