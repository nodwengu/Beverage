package temperatures;

import main.temperatures.Microwave;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicrowaveTest {
   
   @Test
   void shouldBeAbleToReturnCurrentTemperature() {
      Microwave microwave = new Microwave();
    
      assertEquals(0, microwave.currentTemperature());
      
      microwave.low(microwave);
      assertEquals(30, microwave.currentTemperature());
      
      microwave.medium(microwave);
      assertEquals(60, microwave.currentTemperature());
   
      microwave.high(microwave);
      assertEquals(90, microwave.currentTemperature());
   }
   
   @Test
   void heatUpTo() {
   }
   
   @Test
   void low() {
   }
}