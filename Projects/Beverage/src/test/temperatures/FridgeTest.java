package temperatures;

import main.beverages.*;
import main.temperatures.Fridge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {
   
   @Test
   public void shouldBeAbleCoolDownColdBevarage() {
      Fridge fridge = new Fridge();
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      
      fridge.coolForHours(coldBeverage);
      assertEquals(10, fridge.getTemperature());
   
      fridge.coolForMinutes(coldBeverage);
      assertEquals(3, fridge.getTemperature());
   
      fridge.coolForDays(coldBeverage);
      assertEquals(20, fridge.getTemperature());
   }
   
   @Test
   public void shouldBeAbleToCoolDownFruitJuice() {
      Fridge fridge = new Fridge();
      Beverage beverage = new FruitJuice();
      FruitJuice fruitJuice = (FruitJuice) beverage;
      
      fridge.coolForMinutes(fruitJuice);
      assertEquals(3, fridge.getTemperature());
      
      fridge.coolForHours(fruitJuice);
      assertEquals(10, fridge.getTemperature());
      
      fridge.coolForDays(fruitJuice);
      assertEquals(20, fridge.getTemperature());
   }
}