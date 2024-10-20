# Leap Year Checker

## Overview

This Java program checks if a given year is a leap year or not. By entering a year, the program will determine whether the input year is a leap year based on the rules of the Gregorian calendar.

## How It Works

- The user is prompted to enter a year.
- The program checks whether the year is a leap year using the following conditions:
  - A year is a leap year if it is divisible by 4 but not divisible by 100, **or** if it is divisible by 400.
- The result is then displayed to the user.

## Leap Year Rules

- A leap year occurs every 4 years to keep the calendar year synchronized with the astronomical year.
- The rules for determining a leap year are as follows:
  - **If a year is divisible by 4** and **not divisible by 100**, it is a leap year.
  - **If a year is divisible by 400**, it is also a leap year.
  - For example, 2000 is a leap year, while 1900 is not.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter the year when prompted, and the program will display whether it is a leap year or not.

## Sample Output

```
Bir yıl giriniz
2000
Artık yıldır !
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the terms and conditions that were set in the template. Adjust as needed.

