![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Workshop: (Converter App)

**Objective:**  
Your task is to develop a console-based Java application that converts values between different units. You will choose **3 different converter types** from a list of 10 and implement them in a single program with a text-based menu.

The application should use:
- Console menu  
- Classes and methods  
- User input handling  
- (Optional) Data Validation  
- (Optional) Formatted output with date and time  

---

## Instructions

1. Set up a new Maven project.
2. Name the project appropriately, e.g. `ConverterApp`.
3. Push the Maven project to a GitHub repository.
4. Share the repository link with your instructor to record your activity for this workshop.
5. Start implementing the workshop tasks.

---

## Step 1: Choose Your Converter Types

From the list below, **pick any 3** types of converters to implement in your application:

1. **Currency Converter** – SEK ↔ USD, SEK ↔ EUR  
2. **Temperature Converter** – Celsius ↔ Fahrenheit  
3. **Length Converter** – Meters ↔ Kilometers  
4. **Weight Converter** – Kilograms ↔ Grams  
5. **Time Converter** – Hours ↔ Minutes  
6. **Speed Converter** – km/h ↔ m/s  
7. **Fuel Consumption Converter** – L/100km ↔ km/L  
8. **Data Storage Converter** – KB ↔ MB ↔ GB  
9. **BMI Calculator** – Compute BMI and category  
10. **Grade Converter** – Percentage → Letter grade  

> 📌 Note: 
> - For converters that need a conversion rate, you can search online for the correct value or formula. 
> - Do not use web APIs or external libraries.
---

## Step 2: Application Requirements

### 1. Menu Display
Your program must display a clear menu, for example:

```
=== Converter App ===
1. Use Converter 1
2. Use Converter 2
3. Use Converter 3
4. Exit
Choose an option:
```

---

### 2. User Input Handling
- Read user input.
- Ask for the value to convert.
- Ask for menu options.
- Repeat menu until Exit is selected.

---

### 3. Conversion Logic
- Create methods for each chosen converter.
- Implement predefined formulas or conversion rates.

---

### 4. (Optional) Formatted Output
Each conversion result must show:
- Converted value
- Current date and time

Example:

```
Result: 100 SEK = 9.20 USD
Converted at: 2025-12-02 10:35
```

---

### 5. (Optional) Data Validation
Handle invalid input:
- Non-numeric values
- Negative values (when not allowed)
- Invalid menu choices

---

### 6. Code Structure
- Use classes and methods to keep code organized.
- Use clear naming.
- Add comments where needed.

---

## Example Flow (Conceptual)

```
=== Converter App ===
1. Currency Converter
2. Temperature Converter
3. Length Converter
4. Exit
Choose an option: 1

Enter amount in SEK: 100
Result: 100 SEK = 9.20 USD
Converted at: 2025-12-02 10:35
```

---

Good luck!
