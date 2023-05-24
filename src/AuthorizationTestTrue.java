import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorizationTestTrue {

    Employee sut = new Employee("Mr. Right", 10101);

    Bank sutBank = new Bank(1000, "00000");

    /**
     * testWithdrawal with assertTrue. Asserts that if you insert the right employee number and/or the right pin code -
     * the authorization will fail.
     *
     */
    @Test
    void testWithdrawal() {
        //Arrange
        boolean expected = true;

        //Act
        boolean actual = sut.withdrawal(01010, 10101, sutBank, 100);

        //Assert
        assertTrue(actual);
    }
}
