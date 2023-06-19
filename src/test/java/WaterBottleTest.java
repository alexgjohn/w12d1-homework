import com.codeclan.example.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        int result = waterBottle.getVolume();
        assertEquals(100, result);
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        int result = waterBottle.getVolume();
        assertEquals(90, result);
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        int result = waterBottle.getVolume();
        assertEquals(0, result);
    }

    @Test
    public void canFill(){
        waterBottle.empty();
        waterBottle.fill();
        int result = waterBottle.getVolume();
        assertEquals(100, result);
    }
}
