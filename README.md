# Workshop: Algorithm and Flowchart

For each question in this workshop, you must complete **two** things:

1.  **Write the pseudocode**
2.  **Draw the flowchart** using either
    - **Option 1:** Draw.io (recommended) → export image → upload to
      your repository → link it in this file
    - **Option 2 (optional):** Write a Mermaid flowchart directly in
      Markdown
    - **Option 3 (optional):** Any other valid method

👉 **IMPORTANT:** At the **bottom of each question**, add the
following sections:

### ✔ Pseudocode

### ✔ Flowchart

---

## 1. Check Even or Odd Number

Design an algorithm and flowchart that take a number as input and
determine whether it is even or odd.

### ✔ Pseudocode

```text
START
    INPUT number
    IF number % 2 == 0 THEN
        PRINT Even
    ELSE
        PRINT Odd
    ENDIF
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> I[/Get input N/]
    I --> B{N % 2 == 0 ?}
    B -->|Yes| C[/Print Even/]
    B -->|No| D[/Print Odd/]
    C --> E([End])
    D --> E([End])
```

---

## 2. Calculate Total and Average Marks

Write the algorithm and draw the flowchart for a program that inputs
marks for 3 subjects, calculates the total and average, and displays
both.

### ✔ Pseudocode

```text
START
    INPUT mark1, mark2, mark3
    total = mark1 + mark2 + mark3
    average = total / 3
    PRINT total, average
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input mark1, mark2, mark3/]
    B --> C[total = mark1 + mark2 + mark3]
    C --> D[average = total / 3]
    D --> E[/Print total, average/]
    E --> F([End])
```

---

## 3. Display Multiplication Table

Create an algorithm and flowchart that input a number and display its
multiplication table from 1 to 10 using a loop.

### ✔ Pseudocode

```text
START
    INPUT number
    FOR i = 1 TO 10
        result = number * i
        PRINT number, "*", i, "=", result
    ENDFOR
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input number/]
    B --> C[i = 1]
    C --> D{i <= 10?}
    D -->|Yes| E[result = number * i]
    E --> F[/Print number * i = result/]
    F --> G[i = i + 1]
    G --> D
    D -->|No| H([End])
```

---

## 4. Positive, Negative, or Zero Check

Write the algorithm and flowchart to input a number and display whether
it is positive, negative, or zero.

### ✔ Pseudocode

```text
START
    INPUT number
    IF number > 0 THEN
        PRINT Positive
    ELSE IF number < 0 THEN
        PRINT Negative
    ELSE
        PRINT Zero
    ENDIF
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input number/]
    B --> C{number > 0?}
    C -->|Yes| D[/Print Positive/]
    C -->|No| E{number < 0?}
    E -->|Yes| F[/Print Negative/]
    E -->|No| G[/Print Zero/]
    D --> H([End])
    F --> H
    G --> H
```

---

## 5. Simple Interest Calculator

Create an algorithm and flowchart for a program that calculates simple
interest using the formula:

**SI = (P × R × T) / 100**

- **P = Principal** → original amount of money
- **R = Rate of Interest** → percentage per year
- **T = Time** → number of years

### ✔ Pseudocode

```text
START
    INPUT P, R, T
    SI = (P * R * T) / 100
    PRINT SI
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input P, R, T/]
    B --> C[SI = P * R * T / 100]
    C --> D[/Print SI/]
    D --> E([End])
```

---

## 6. Average Temperature Calculation

Write the algorithm and draw the flowchart for a program that takes the
temperature of 7 days, finds the average temperature, and displays it.

### ✔ Pseudocode

```text
START
    sum = 0
    FOR i = 1 TO 7
        INPUT temperature
        sum = sum + temperature
    ENDFOR
    average = sum / 7
    PRINT average
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[sum = 0, i = 1]
    B --> C{i <= 7?}
    C -->|Yes| D[/Input temperature/]
    D --> E[sum = sum + temperature]
    E --> F[i = i + 1]
    F --> C
    C -->|No| G[average = sum / 7]
    G --> H[/Print average/]
    H --> I([End])
```

---

## 7. Calculate Area of a Rectangle

Create an algorithm and flowchart to input length and width, calculate
the area (**Area = Length × Width**), and display the result.

### ✔ Pseudocode

```text
START
    INPUT length, width
    area = length * width
    PRINT area
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input length, width/]
    B --> C[area = length * width]
    C --> D[/Print area/]
    D --> E([End])
```

---

## 8. Determine Pass or Fail

Write the algorithm and draw the flowchart for a program that takes a
student's average marks and displays **"Pass"** if average ≥ 50,
otherwise **"Fail"**.

### ✔ Pseudocode

```text
START
    INPUT average
    IF average >= 50 THEN
        PRINT Pass
    ELSE
        PRINT Fail
    ENDIF
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input average/]
    B --> C{average >= 50?}
    C -->|Yes| D[/Print Pass/]
    C -->|No| E[/Print Fail/]
    D --> F([End])
    E --> F
```

---

## 9. Calculate Factorial of a Number

Write the algorithm and draw the flowchart that input a number and
calculate its factorial using a loop.

### ✔ Pseudocode

```text
START
    INPUT number
    factorial = 1
    FOR i = 1 TO number
        factorial = factorial * i
    ENDFOR
    PRINT factorial
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input number/]
    B --> C[factorial = 1, i = 1]
    C --> D{i <= number?}
    D -->|Yes| E[factorial = factorial * i]
    E --> F[i = i + 1]
    F --> D
    D -->|No| G[/Print factorial/]
    G --> H([End])
```

---

## 10. Calculate Discount on Purchase

Write the algorithm and draw the flowchart for a program that inputs the
purchase amount and gives a **10% discount** if the amount is greater
than 1000.

### ✔ Pseudocode

```text
START
    INPUT amount
    IF amount > 1000 THEN
        discount = amount * 0.10
        finalAmount = amount - discount
    ELSE
        finalAmount = amount
    ENDIF
    PRINT finalAmount
END
```

### ✔ Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input amount/]
    B --> C{amount > 1000?}
    C -->|Yes| D[discount = amount * 0.10]
    D --> E[finalAmount = amount - discount]
    C -->|No| F[finalAmount = amount]
    E --> G[/Print finalAmount/]
    F --> G
    G --> H([End])
```

---
