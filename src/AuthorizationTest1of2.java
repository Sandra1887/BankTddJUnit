import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizationTest1of2 {
    Employee sut = new Employee("Half Empty", 01010); //correct employeeNumber
    Bank sutBank = new Bank(1000, "10000001");

    /***
     * This test is meant to fail. We put in the wrong employee number but the right pin code. And just like we
     * want, and expect, the test fails.
     */
    @Test
    void testWithdrawal() {
        //Arrange
        boolean expected = true;
        //(Although in this case we want it to fail(false) to make sure it works)

        //Act
        boolean actual = sut.withdrawal(01010, 01010, sutBank, 100);

        //Assert
        assertTrue(actual);
    }
}
