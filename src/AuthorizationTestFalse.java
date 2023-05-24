import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AuthorizationTestFalse {
    Employee sut = new Employee("Mr. Wrong", 0000011111);
    Bank sutBank = new Bank(1000, "00000");

    /**
     * testWithdrawal with assertFalse. Asserts that if you insert the wrong employee number and/or the wrong pin code -
     * the authorization will fail.
     *
     */
    @Test
    void testWithdrawal() {
        //Arrange
        boolean expected = false;

        //Act
        boolean actual = sut.withdrawal(11111, 10101, sutBank, 100);

        //Assert
        assertFalse(actual);
    }

}
