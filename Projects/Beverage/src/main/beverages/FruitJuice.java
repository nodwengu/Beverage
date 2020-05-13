package main.beverages;

public class FruitJuice extends ColdBeverage {
   
   public FruitJuice(int temperature) {
      super(temperature);
   }
   
   @Override
   public String dontSpill() {
      return "Don't spill your juice its too precious";
   }
   
   @Override
   public String drink() {
      return "Drinking a juice so: " + this.dontSpill();
   }
}
