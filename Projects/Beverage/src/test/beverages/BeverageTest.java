package beverages;

import main.beverages.*;
import main.temperatures.*;
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
      Beverage beverage = new ColdBeverage(10);

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
      Beverage beverage = new ColdBeverage(10);
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      Person olwethu = new Person();

      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
      assertEquals("Don't spill your cold drink", coldBeverage.dontSpill());
   }

   @Test
   public void shouldBeableToDrinkWithIce() {
      Beverage beverage = new ColdBeverage(10);
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      Person olwethu = new Person();

      assertEquals("Drink a cold beverage", olwethu.drinkBeverage(beverage));
      assertEquals("Drink with ice", coldBeverage.drinkWithIce());
   }

   @Test
   public void shouldBeAbleToDrinkFruitJuice() {
      Beverage beverage = new FruitJuice(10);
      ColdBeverage coldBeverage = (ColdBeverage) beverage;
      //FruitJuice fruitJuice = (FruitJuice) beverage;
      Person olwethu = new Person();

      assertEquals("Drinking a juice so: Don't spill your juice its too precious", olwethu.drinkBeverage(beverage));
      assertEquals("Don't spill your juice its too precious", coldBeverage.dontSpill());

      //assertEquals("Don't spill your cold drink", fruitJuice.drink());
   }

   @Test
   public void shouldBeAbleToCoolDownBeverageForMinutes() {
      Beverage beverage = new ColdBeverage(10);
      Fridge fridge = new Fridge();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;

      fridge.coolForMinutes(coldBeverage);
      assertEquals(7, coldBeverage.currentTemperature());
   }

   @Test
   public void shouldBeAbleToCoolDownBeverageForHours() {
      Beverage beverage = new ColdBeverage(10);
      Fridge fridge = new Fridge();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;

      fridge.coolForHours(coldBeverage);
      assertEquals(0, coldBeverage.currentTemperature());
   }

   @Test
   public void shouldBeAbleToCoolDownBeverageForDays() {
      Beverage beverage = new ColdBeverage(10);
      Fridge fridge = new Fridge();
      ColdBeverage coldBeverage = (ColdBeverage) beverage;

      fridge.coolForDays(coldBeverage);
      assertEquals(-10, coldBeverage.currentTemperature());
   }

   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForMinutes() {
      Beverage beverage = new FruitJuice(10);
      Fridge fridge = new Fridge();
      FruitJuice fruitJuice = (FruitJuice) beverage;

      fridge.coolForMinutes(fruitJuice);
      assertEquals(7, fruitJuice.currentTemperature());
   }

   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForHours() {
      Beverage beverage = new FruitJuice(10);
      Fridge fridge = new Fridge();
      FruitJuice fruitJuice = (FruitJuice) beverage;

      fridge.coolForHours(fruitJuice);
      assertEquals(0, fruitJuice.currentTemperature());
   }

   @Test
   public void shouldBeAbleToCoolDownFruitJuiceForDays() {
      Beverage beverage = new FruitJuice(10);
      Fridge fridge = new Fridge();
      FruitJuice fruitJuice = (FruitJuice) beverage;

      fridge.coolForDays(fruitJuice);
      assertEquals(-10, fruitJuice.currentTemperature());
   }


   // Why is the HotBeverage heating itself?

   @Test
   public void shouldBeAbleToHeatUpBeverageLow() {
      Beverage beverage = new HotBeverage();
      Microwave microwave = new Microwave();

      HotBeverage hotBeverage = (HotBeverage) beverage;

      //System.out.println("Why is the HotBeverage heating itself?");
      // Why is the HotBeverage heating itself?
      microwave.low(hotBeverage);
      assertEquals(30, hotBeverage.currentTemperature());
   }

   @Test
   public void shouldBeAbleToHeatUpBeverageMedium() {
      Beverage beverage = new HotBeverage();
      Microwave microwave = new Microwave();
      HotBeverage hotBeverage = (HotBeverage) beverage;

      microwave.medium(hotBeverage);
      assertEquals(60, hotBeverage.currentTemperature());
   }

   @Test
   public void shouldBeAbleToHeatUpBeverageHigh() {
      Beverage beverage = new HotBeverage();
      Microwave microwave = new Microwave();
      HotBeverage hotBeverage = (HotBeverage) beverage;

      microwave.high(hotBeverage);
      assertEquals(90, hotBeverage.currentTemperature());
   }
}