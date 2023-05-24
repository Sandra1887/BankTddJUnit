import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Main {
    /**
     * In this test method we test if the "deposit" function works. The balance is set to "0" and the deposit/expected
     * amount is set to "100". This should set the balance to 0.0 + 100 = 100.
     * <p>
     * The first parameter in "assertEquals" is where we put the expected outcome which in this case is "100".
     * The second parameter gets the account balance after the deposit and is compared to the first parameter.
     * If the parameters are equal the test will pass.
     *
     * @Param
     */
    @Test
    public void testDeposit() {
        Bank bank = new Bank(0, "123");
        //Arrange
        double expected = 100;

        //Act
        bank.deposit(100);

        //Assert
        assertEquals(expected, bank.getBalance());
    }

    /**
     * In this test method we test if the "withdrawal" function works. The bank object is initialized by setting
     * the balance and the accountNumber.
     *
     * If you set the balance to "0" and set the withdrawal amount to <0 the test will return a "throw IllegalArgument"
     * that tells you that the balance is too low.
     *
     * If you set the balance to "100" and the withdrawal amount to "50" (100-50) the test will pass.
     *
     * In the first parameter in "assertEquals" you put the expected amount which in this case is 50.
     * The second parameter gets the balance for the bank account after the withdrawal and compares it with the
     * expected outcome.
     *
     * @param
     */
    @Test
    public void testWithdrawal() {
        Bank bank = new Bank(100, "234");
        //Arrange
        double expected = 50;

        //Act
        bank.withdrawal(50);

        //Assert
        assertEquals(expected, bank.getBalance());
    }
}