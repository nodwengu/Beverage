package beverages;

import main.beverages.*;
import main.temperatures.Fridge;
import main.temperatures.Microwave;
import main.temperatures.Temperature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {
   @Test
   void shouldBeAbleToCreateABeverage() {
      Beverage beverage = new Beverage();

      assertEquals("Drink a beverage", beverage.drink());
   }

   @Test
   void olwethuShouldBeAbleToDrinkABeverage() {
      Beverage beverage = new Beverage();
      Person olwethu = new Person();

      assertEquals("Drink a beverage", olwethu.drinkBeverage(beverage));
   }

   @Test
   void olwethuShouldBeAbleToDrinkAHotDrink() {
      Beverage beverage = new HotBeverage();
      Person olwethu = new Person();

      //HotBeverage myBeverage = (HotBeverage) beverage;

      assertEquals("Drink a hot beverage", olwethu.drinkBeverage(beverage));
   }

   @Test
   public void olwethuShouldBeAbleToDrinkAColdDrink() {
      Beverage beverage = new ColdBeverage();

     // HotBeverage hotBeverage = (HotBeverage) beverage;

//      System.out.println(beverage instanceof Beverage);
//      System.out.println(beverage instanceof HotBeverage);
//      System.out.println(beverage instanceof ColdBeverage);

      Person olwethu = new Person();

      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
   }

   @Test
   public void shouldBeAbleDrinkBeverageSlowly() {
      HotBeverage beverage = new HotBeverage();
      //HotBeverage hotBeverage = (HotBeverage) beverage;
      Person olwethu = new Person();

      assertEquals("Drink a hot beverage", olwethu.drinkBeverage(beverage));
      assertEquals("Drink slowly this is hot", beverage.drinkSlowly());
     // assertEquals("Drink slowly this is hot", hotBeverage.drinkSlowly());
   }

   @Test
   public void shouldNotSpillDrink() {
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      Person olwethu = new Person();

      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
      assertEquals("Don't spill your cold drink", coldBeverage.dontSpill());
   }

   @Test
   public void shouldBeableToDrinkWithIce() {
      Beverage beverage = new ColdBeverage();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      Person olwethu = new Person();

      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
      assertEquals("Drink with ice", coldBeverage.drinkWithIce());
   }

   @Test
   public void shouldBeAbleToDrinkFruitJuice() {
      Beverage beverage = new FruitJuice();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      //FruitJuice fruitJuice = (FruitJuice) beverage;
      Person olwethu = new Person();

      assertEquals("Drinking a juice so: Don't spill your juice its too precious", olwethu.drinkBeverage(beverage));
      assertEquals("Don't spill your juice its too precious", coldBeverage.dontSpill());

      //assertEquals("Don't spill your cold drink", fruitJuice.drink());
   }

   @Test
   public void shouldBeAbleToDrinkFruitJuice12() {
      Beverage beverage = new FruitJuice();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      //FruitJuice fruitJuice = (FruitJuice) beverage;
      Person olwethu = new Person();

      assertEquals("Drinking a juice so: Don't spill your juice its too precious", olwethu.drinkBeverage(beverage));
      assertEquals("Don't spill your juice its too precious", coldBeverage.dontSpill());

      //assertEquals("Don't spill your cold drink", fruitJuice.drink());
   }
   
   @Test
   public void shouldBeAbleToHeatUpBeverage() {
      Beverage beverage = new HotBeverage();
      Microwave temperature = new Microwave();
      
      HotBeverage hotBeverage = (HotBeverage) beverage;
      
      Person olwethu = new Person();
      
      assertEquals("Drink a hot beverage", olwethu.drinkBeverage(beverage));
     
      hotBeverage.setLowTemperature(temperature);
      assertEquals(30, hotBeverage.getTemperature());
      //System.out.println("Low: " + hotBeverage.getTemperature());
   
      hotBeverage.setMediumTemperature(temperature);
      assertEquals(60, hotBeverage.getTemperature());
      //System.out.println("Medium: " + hotBeverage.getTemperature());
   
      hotBeverage.setHighTemperature(temperature);
      assertEquals(90, hotBeverage.getTemperature());
      //System.out.println("High: " + hotBeverage.getTemperature());
   }
   
   @Test
   public void shouldBeAbleToCoolDownBeverage() {
      Beverage beverage = new ColdBeverage();
      Fridge temperature = new Fridge();
      
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      
      Person olwethu = new Person();
      
      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
      
      coldBeverage.setForMinutes(temperature);
      assertEquals(3, coldBeverage.getTemperature());
      //System.out.println("Set for minutes: " + coldBeverage.getTemperature());

      coldBeverage.setForHours(temperature);
      assertEquals(10, coldBeverage.getTemperature());
      //System.out.println("Set for hours: " + coldBeverage.getTemperature());

      coldBeverage.setForDays(temperature);
      assertEquals(20, coldBeverage.getTemperature());
      //System.out.println("Set for days: " + coldBeverage.getTemperature());
      
   }
   
   @Test
   public void shouldBeAbleToCoolDownFruitJuice() {
      Beverage beverage = new FruitJuice();
      Fridge temperature = new Fridge();
      
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      
      Person olwethu = new Person();
      
      assertEquals("Drinking a juice so: Don't spill your juice its too precious", olwethu.drinkBeverage(beverage));
      
      coldBeverage.setForMinutes(temperature);
      assertEquals(3, coldBeverage.getTemperature());
      //System.out.println("Set for minutes: " + coldBeverage.getTemperature());

      coldBeverage.setForHours(temperature);
      assertEquals(10, coldBeverage.getTemperature());
      //System.out.println("Set for hours: " + coldBeverage.getTemperature());

      coldBeverage.setForDays(temperature);
      assertEquals(20, coldBeverage.getTemperature());
      //System.out.println("Set for days: " + coldBeverage.getTemperature());
   }
   
}