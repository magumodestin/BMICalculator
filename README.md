# BMI Calculator

A simple desktop BMI (Body Mass Index) calculator with a small graphical interface. It was first written in **Java (Swing)** and later ported to **Python (Tkinter)**, so the repo contains both versions side by side.

## Features

- Enter weight (kg) and height (m)
- Click **Calculate BMI** to see your result, rounded to 2 decimal places
- Input validation: shows "Invalid input!" for anything that isn't a number

## Formula

```
BMI = weight (kg) / (height (m) × height (m))
```

## Files

| File | Description |
|------|-------------|
| `BMICalculator.java` | Original Java Swing version |
| `BMICalculator.py` | Python Tkinter version |

## Running the Python version

Requires Python 3 (Tkinter is included with most Python installs).

```bash
python BMICalculator.py
```

## Running the Java version

Requires JDK 8 or newer.

```bash
javac -d out BMICalculator.java
java -cp out bmicalculator.BMICalculator
```

Or open the file in an IDE such as NetBeans and run it.

## Example

| Weight | Height | BMI |
|--------|--------|-----|
| 70 kg | 1.75 m | 22.86 |

## Java vs Python

Both versions do the same thing:

| | Java | Python |
|---|------|--------|
| GUI toolkit | Swing | Tkinter |
| Layout | `GridLayout` + `FlowLayout` | `grid()` |
| Error handling | `NumberFormatException` | `ValueError` |

## License

Free to use for learning and personal projects.
