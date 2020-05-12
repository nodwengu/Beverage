package temperatures;
import main.beverages.HotBeverage;

import main.beverages.Beverage;
import main.beverages.ColdBeverage;
import main.temperatures.Fridge;
import main.temperatures.Microwave;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicrowaveTest {
   
   @Test
   public void shouldBeAbleCoolDownABeverageLow() {
      Microwave microwave = new Microwave();
      Beverage beverage = new HotBeverage();
      HotBeverage hotBeverage = (HotBeverage) beverage;
      
      microwave.low(hotBeverage);
      assertEquals(30, microwave.getTemperature());
   }
   
   @Test
   public void shouldBeAbleCoolDownABeverageMedium() {
      Microwave microwave = new Microwave();
      Beverage beverage = new HotBeverage();
      HotBeverage hotBeverage = (HotBeverage) beverage;
 
      microwave.medium(hotBeverage);
      assertEquals(60, microwave.getTemperature());
   }
   
   @Test
   public void shouldBeAbleCoolDownABeverageHigh() {
      Microwave microwave = new Microwave();
      Beverage beverage = new HotBeverage();
      HotBeverage hotBeverage = (HotBeverage) beverage;
    
      microwave.high(hotBeverage);
      assertEquals(90, microwave.getTemperature());
   }
}