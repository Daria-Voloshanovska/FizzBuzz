# FizzBuzz
This project implements the classic FizzBuzz problem in Java.  
The program prints numbers from 1 to 100, but:  
- for multiples of 3, it prints "Fizz"  
- for multiples of 5, it prints "Buzz"  
- for multiples of 3 and 5, it prints "FizzBuzz"  

##  Project Structure
fizzbuzz-project/
├── src/
│   └── com/
│       └── example/
│           └── fizzbuzz/
│               ├── FizzBuzz.java     # FizzBuzz logic
│               └── Main.java         # entry point
     

##  How to Run
1. Make sure you have JDK 17+ installed (`java -version` to check).  
2. Navigate to src/main/java.  
3. Compile the classes:
   ```bash
   javac com/example/fizzbuzz/*.java

## How to Add New Rules
In Main.java, rules are added via the addRule(divisor, word) method.
Example: new FizzBuzz()
    .addRule(3, "Fizz")
    .addRule(5, "Buzz")
    .addRule(7, "NewWord") // new rule
    .run(1, 100);
    
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

  
