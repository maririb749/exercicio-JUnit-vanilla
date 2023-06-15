package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	//Testando se o construtor cria objetos corretamente quando passamos dados válidos
   
	@Test
    public void constructorShouldCreateObjectWhenValidData() {
        Financing f = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }
	
	// Lançar uma excessão quando os dados não forem válidos

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 20);
        });
    }
}
