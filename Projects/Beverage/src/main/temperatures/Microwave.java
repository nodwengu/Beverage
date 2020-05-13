package main.temperatures;

public class Microwave {
   public void low(Heatable heatableObj) {
      heatableObj.heatUpTo(30);
   }
   
   public void medium(Heatable heatableObj) {
      heatableObj.heatUpTo(60);
   }
   
   public void high(Heatable heatableObj) {
      heatableObj.heatUpTo(90);
   }
}
