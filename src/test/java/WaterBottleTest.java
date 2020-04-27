import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;
    Calculator calculator;

    @Before
    public void before() {
        bottle = new WaterBottle();
        calculator = new Calculator();

    }

    @Test
    public void hasVolume() {
        assertEquals( 100, bottle.getVolume() );
    }

    @Test
    public void canDrink() {
        bottle.takeDrink();
        assertEquals( 90, bottle.getVolume() );
    }

    @Test
    public void emptyBottleTest(){
        bottle.empty();
        assertEquals( 0, bottle.getVolume() );
    }

    @Test
    public void fillBottleTest(){
        bottle.fill();
        assertEquals( 100, bottle.getVolume() );
    }

}
