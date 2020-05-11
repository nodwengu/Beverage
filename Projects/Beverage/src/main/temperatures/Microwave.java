package main.temperatures;

public class Microwave implements Heatable {
   private int temperature;
   
   @Override
   public int currentTemperature() {
      return temperature;
   }
   
   @Override
   public int heatUpTo(int number) {
      return number;
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
