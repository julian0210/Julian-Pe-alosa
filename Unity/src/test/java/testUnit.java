/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import junit.framework.TestCase;
import com.mycompany.unity.Operations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author julia
 */
public class testUnit extends TestCase {
    
    public testUnit(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

      @Test
    public void testChackNumber() {
        // Arrange
        int negativeNumber = -5;
        int positiveNumber = 10;
        int zero = 0;

        // Act
        String negativeResult = Operations.CheckNumber(negativeNumber);
        String positiveResult = Operations.CheckNumber(positiveNumber);
        String zeroResult = Operations.CheckNumber(zero);

        // Assert
        assertEquals("El número es negativo", negativeResult);
        assertEquals("El número es positivo", positiveResult);
        assertEquals("El número es nulo", zeroResult);
    }
      @Test
    public void testGenerateRandomAndDecrease() {
        // Arrange
        int randomValue = Operations.GenerateRandomNumber();

        // Act
        double decreasedValue = Operations.DecreaseBy15Percent(randomValue);

        // Assert
        assertTrue(randomValue >= 10 && randomValue <= 50);
        assertTrue(decreasedValue == randomValue * 0.85);
    }
    @Test
    public void IsDivisible_twoIntegerNumbers_IsDivisible(){
    // Arrange
    int firstNumber = 5;
    int secondNumber = 5;
    boolean expectedResult = true;
    // Act
    boolean methodResult = Operations.IsDivisible(firstNumber,secondNumber);
    // Assert
    assertTrue(methodResult);
    }
      @Test
    public void NextNumber_UserNumberGTown_AddedNumber() {
        // Arrange
        int userNumber = 10;
        int expectedResult = 11;

        // Act
        int result = Operations.NextNumber(userNumber);

        // Assert
        assertEquals(11,result);
    }
}
