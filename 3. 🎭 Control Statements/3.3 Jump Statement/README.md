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
