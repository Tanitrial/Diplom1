package stellaBurgers;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void countValues() {
        assertEquals(2, IngredientType.values().length);
    }

    @Test
    public void sauceValueOf() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void fillingValueOf() {
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test
    public void checkIngredientTypeSauceIndexIs0(){
        assertEquals(0, IngredientType.SAUCE.ordinal());
    }

    @Test
    public void checkIngredientTypeFillingIndexIs1(){
        assertEquals(1, IngredientType.FILLING.ordinal());
    }
}