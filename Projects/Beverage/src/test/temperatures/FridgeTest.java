package temperatures;

import main.beverages.*;
import main.temperatures.Fridge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {
   
   @Test
   public void shouldBeAbleCoolDownColdBevarageForMinutes() {
      Fridge fridge = new Fridge();
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
   
      fridge.coolForMinutes(coldBeverage);
      assertEquals(-3, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleCoolDownColdBevarageForHours() {
      Fridge fridge = new Fridge();
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      
      fridge.coolForHours(coldBeverage);
      assertEquals(-10, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleCoolDownColdBevarageForDays() {
      Fridge fridge = new Fridge();
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      
      fridge.coolForDays(coldBeverage);
      assertEquals(-20, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForMinutes() {
      Fridge fridge = new Fridge();
      Beverage beverage = new FruitJuice();
      ColdBeverage fruitJuice = (ColdBeverage) beverage;

      fridge.coolForMinutes(fruitJuice);
      assertEquals(-3, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForHours() {
      Fridge fridge = new Fridge();
      Beverage beverage = new FruitJuice();
      ColdBeverage fruitJuice = (ColdBeverage) beverage;
      
      fridge.coolForHours(fruitJuice);
      assertEquals(-10, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForDays() {
      Fridge fridge = new Fridge();
      Beverage beverage = new FruitJuice();
      ColdBeverage fruitJuice = (ColdBeverage) beverage;
      
      fridge.coolForDays(fruitJuice);
      assertEquals(-20, fridge.getTemperature());
   }
}