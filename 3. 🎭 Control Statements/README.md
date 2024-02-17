### 3. 🎭 Control Statements:

Introduction to control statements in Java, including `if`, `else`, `switch`, and their usage for flow control in programs. Control statements play a crucial role in directing the flow of a program based on certain conditions or iterations. Understanding these statements is fundamental to writing effective and logical Java code.

### 3.1 Selection Statement (Conditional Statement):

#### 3.1.1 `if` Statement:

🔹 The `if` statement allows you to execute a block of code if a specified condition is true.

```java
if (condition) {
    // Code to be executed if the condition is true
}

3.1.2 if-else Statement:
🔹 The if-else statement enables the execution of different code blocks based on a true or false condition.

if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}

3.1.3 Nested if Statement:
🔹 Nested if statements involve implementing multiple conditional statements within each other.

if (condition1) {
    // Code to be executed if condition1 is true
    
    if (condition2) {
        // Code to be executed if both condition1 and condition2 are true
    }
}
3.1.4 switch Statement:
🔹 The switch statement allows the selection of one code block from multiple based on the value of an expression.

int option = 2; // Example value

switch (option) {
    case 1:
        // Code to be executed if option is 1
        break;
    case 2:
        // Code to be executed if option is 2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}



This single README file consolidates all the content for the specified section on selection statements in Java. 


### 3.2 Iteration or Looping Statement:

#### 3.2.1 `for` Loop:

🟢 The `for` loop executes a block of code repeatedly for a specified number of times.

```java
for (int i = 0; i < n; i++) {
    // Code to be executed in each iteration
}

3.2.2 while Loop:
🟢 The while loop repeats a block of code as long as a specified condition is true.

while (condition) {
    // Code to be executed as long as the condition is true
}


3.2.3 do-while Loop:
🟢 The do-while loop is similar to while, but it guarantees the execution of the block at least once.

do {
    // Code to be executed at least once
} while (condition);




### 3.3 Jump Statement:

#### 3.3.1 `break` Statement:

🔴 The `break` statement terminates the loop or switch statement and transfers control to the statement following the terminated statement.

```java
for (int i = 0; i < array.length; i++) {
    if (array[i] == targetValue) {
        // Code to be executed when the target value is found
        break;
    }
}



3.3.2 continue Statement:
🔴 The continue statement skips the rest of the loop's code and proceeds to the next iteration.

for (int i = 0; i < array.length; i++) {
    if (array[i] == invalidValue) {
        // Skip the iteration when an invalid value is encountered
        continue;
    }
    // Code to be executed for valid values
}



3.3.3 return Statement:
🔴 The return statement exits from a method, optionally returning a value. Note: return with a value is more commonly used in Java compared to C.

public int addNumbers(int a, int b) {
    return a + b;
}



This completes the README for sections 3.2 and 3.3, providing explanations and code snippets for each type of statement in Java. 




