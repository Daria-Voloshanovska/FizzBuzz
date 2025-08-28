# FizzBuzz
This project implements the classic FizzBuzz problem in Java.  
The program prints numbers from 1 to 100, but:  
- for multiples of 3, it prints "Fizz"  
- for multiples of 5, it prints "Buzz"  
- for multiples of 3 and 5, it prints "FizzBuzz"  

##  Project Structure
```
fizzbuzz-project/
├── src/
│   └── com/
│       └── example/
│           └── fizzbuzz/
│               ├── FizzBuzz.java    # FizzBuzz logic with rule-based architecture
│               └── Main.java        # Application entry point and configuration
```
## How to Run

### Prerequisites
- JDK 17 or higher installed
- Verify with: `java -version`

### Compilation and Execution
1. Navigate to the project root directory
2. Compile the classes:
   ```bash
   javac src/com/example/fizzbuzz/*.java
   ```
3.Run the application:
 ```bash
java -cp src com.example.fizzbuzz.Main
 ```
## How to Add New Rules

In `Main.java`, rules are added via the `addRule(divisor, word)` method.

Example:
```java
new FizzBuzz()
    .addRule(3, "Fizz")
    .addRule(5, "Buzz")
    .addRule(7, "NewWord") // new rule
    .run(1, 100);
```
    
## Technical Implementation   
1. Data Structure
LinkedHashMap: Ensures rules are processed in insertion order while maintaining O(1) performance.
2. Output Generation
- StringBuilder: Efficiently constructs output strings for composite matches
- Fallback handling: Returns number as string when no rules apply
3. Method Design
- addRule(): Configurable rule addition with fluent interface support
- run(): Executes the FizzBuzz sequence for any given range
- getFizzBuzzValue(): Returns processed value for individual numbers

  
