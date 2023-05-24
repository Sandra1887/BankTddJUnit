public class Employee {
    private String employeeName;
    private int employeeNumber;

    public Employee(String employeeName, int employeeNumber) {
        setName(employeeName);
        setEmployeeNumber(employeeNumber);
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /***
     * A method for an employee to make a withdrawal from an account.
     * Calls for "hasAuthorization" and compares the employeeNumber and returns if the employee has access or not.
     * If true - the employee will be able to make the withdrawal
     *
     * @param employeeNumber
     * @param bank
     * @param amount
     */
    public boolean withdrawal(int employeeNumber, int pinCode, Bank bank, int amount) {
        if (bank.getBalance() >= amount) {
            if (!hasAuthorization(employeeNumber, pinCode)) {
                return false;
            } else {
                bank.withdrawal(amount);
                return true;
            }
        } else {
            return false; //If there's not enough money in the account
        }
    }

    /***
     * Checks if the employee's employee number (last five digits) matches with the number, and as a bank with its
     * high security, it also matches a pin code (entered by the employee) with an expected code.
     *
     *If matching = true;
     * If not matching = false;
     *
     * @param employeeNumber
     * @param pinCode
     * @return
     */
    private boolean hasAuthorization(int employeeNumber, int pinCode){
        int autorizedNumber = 01010;
        int secretCode = 10101;

        /*String employeeNumberString = Integer.toString(employeeNumber);

        String lastFiveNumbers = employeeNumberString.substring(employeeNumberString.length() - 5);
        boolean authorized = lastFiveNumbers.equals(autorizedNumber);



        String pinCodeString = Integer.toString(pinCode);*/

        if(employeeNumber == autorizedNumber && pinCode == secretCode) {
            return true;
        } else {
            return false;
        }
    }
}
