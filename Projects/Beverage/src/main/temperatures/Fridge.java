package main.temperatures;

public class Fridge {
   public void coolForMinutes(Coolable coolableObj) {
      coolableObj.coolDownWith(3);
   }
   
   public void coolForHours(Coolable coolableObj) {
      coolableObj.coolDownWith(10);
   }
   
   public void coolForDays(Coolable coolableObj) {
      coolableObj.coolDownWith(20);
   }
}