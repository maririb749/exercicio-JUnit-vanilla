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
    
  //Deve atualizar o valor quando os dados forem válidos
    
 	@Test
     public void setTotalAmountShouldSetDataWhenValidData() {
 		
 		//arrange
 		 Financing f = new Financing(100000.0, 2000.0, 80);
         
         // action
         f.setTotalAmount(90000.0);
         
         //assert
         Assertions.assertEquals(90000.0, f.getTotalAmount());
         
     }
 	
 	// Deve lançar IllegalArgumentException quando os dados não forem válidos

     @Test
     public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
             Financing f = new Financing(100000.0, 2000.0, 80);
             f.setTotalAmount(110000.0);
             
         });
     }


//Deve atualizar o valor quando os dados forem válidos

	@Test
   public void setIncomeShouldSetDataWhenValidData() {
		
		//arrange
		 Financing f = new Financing(100000.0, 2000.0, 80);
       
       // action
       f.setIncome(2100.0);
       
       //assert
       Assertions.assertEquals(2100.0, f.getIncome());
       
   }
	
	// Deve lançar IllegalArgumentException quando os dados não forem válidos

   @Test
   public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Financing f = new Financing(100000.0, 2000.0, 80);
           f.setIncome(1900.0);
           
       });
   }
   
 //Deve atualizar o valor quando os dados forem válidos

 	@Test
    public void setMonthsShouldSetDataWhenValidData() {
 		
 		//arrange
 		 Financing f = new Financing(100000.0, 2000.0, 80);
        
        // action
        f.setMonths(81);
        
        //assert
        Assertions.assertEquals(81, f.getMonths());
        
    }
 	
 	// Deve lançar IllegalArgumentException quando os dados não forem válidos

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setMonths(79);
            
        });
    }
    @Test
    public void entrySShouldCalculateEntryCorrectly() {
    	
    	//arrange
		 Financing f = new Financing(100000.0, 2000.0, 80);
		 
		 //assert
	     Assertions.assertEquals(20000.0, f.entry());
    	
    }
    @Test
    public void quotaShouldCalculateQuotaCorrectly() {
    	
    	//arrange
		 Financing f = new Financing(100000.0, 2000.0, 80);
		 
		 //assert
	     Assertions.assertEquals(1000.0, f.quota());
    	
    }
}
   
