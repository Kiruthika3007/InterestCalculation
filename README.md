This project is a Java-based banking system design that simulates a Recurring Deposit (RD) Account. 
It allows users to calculate the amount deposited, interest earned, and maturity amount based on tenure, principal, age, and gender. 
The system also includes validation and custom exceptions to ensure only valid inputs are processed.

HOW IT WORKS

User provides:
Principal amount
Age
Gender
Tenure (5 or 10 years)
The system validates inputs.
If valid:
Calculates deposited amount.
Calculates interest using compound interest (quarterly compounding).
Displays results.
If invalid:
Throws and handles BankValidationException.
