package stellaBurgers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import static constant.Omega.ALFA;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;
    private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Before
    public void setUp() {
        bun = new Bun(name, price);
    }

    @Parameterized.Parameters
    public static Object[][] testingData() {
        return new Object[][]{
                {"Big bun", 100f},
                {"Small bun", 1f},
                {"Free bun", 0.0f},
        };
    }

    //Цена булочки и проверка ОР и ФР
    @Test
    public void getBunPrice() {
        float actualPrice = bun.getPrice();
        assertEquals(price, actualPrice, ALFA);
    }

    //Название булочки и проверка ОР и ФР
    @Test
    public void getBunName() {
        String actualName = bun.getName();
        assertEquals(name, actualName);
    }


}

