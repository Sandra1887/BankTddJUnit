# Bank function testing (TDD with JUnit)
by Sandra Jeppsson Kristiansson

## Modules
+ org.junit.jupiter:junit-jupiter:5.8.1

## Code
+ Bank
    - double balance
    - String accountNumber
    + Constructor()
    + Constructor(balance, accountNumber)
    + getBalance() return double
    + setBalance(double balance)
    + getAccountNumber() return String
    + setAccountNumber(String accountNumber)
    + deposit(double amount)
    + withdrawal(double amount)


+ Employee
  - String employeeName
  - int employeeNumber
  + getEmployeeName() return String
  + setEmployeeName(String name)
  + getEmployeeNumber() return int
  + setEmployeeNumber(int employeeNumber)
  + withdrawal(int employeeNumber, int pinCode, Bank bank, int amount) return boolean
  + hasAuthorization(int employeeNumber, int pinCode) return boolean


+ AuthorizationTestTrue *(Test where the input is correct and the outcome true)*
  + Employee sut
  + Bank sutBank
  + testWithdrawal()


+ AuthorizationTestFalse *(Test where the input is incorrect and the outcome false)*
  + Employee sut;
  + Bank sutBank;
  + testWithdrawal()
  

+ AuthorzationTest1of2 *(Failing test where 1 out of 2 inputs is correct)*
  + Employee sut;
  + Bank sutBank;
  + testWithdrawal()
  


+ Main
    + testDeposit()
    + testWithdrawal()


``` Java

```

***Java version 8***

***License MIT***

***2023-05-24***

