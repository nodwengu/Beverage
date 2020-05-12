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
   public void shouldBeAbleCoolDownABeverage() {
      Microwave microwave = new Microwave();
      Beverage beverage = new HotBeverage();
      HotBeverage hotBeverage = (HotBeverage) beverage;
      
      microwave.low(hotBeverage);
      assertEquals(30, microwave.getTemperature());
   
      microwave.medium(hotBeverage);
      assertEquals(60, microwave.getTemperature());
   
      microwave.high(hotBeverage);
      assertEquals(90, microwave.getTemperature());
   }
}