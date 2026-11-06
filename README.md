# Java Learning & Practice Repository

A structured collection of Java programs covering core fundamentals, control flow, functions, data structures, and algorithms.

---

## 📌 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
  - [1. Starting Concepts (`startingconcepts/`)](#1-starting-concepts-startingconcepts)
  - [2. Loops & Iterations (`loops/`)](#2-loops--iterations-loops)
  - [3. Patterns (`patterns/`)](#3-patterns-patterns)
  - [4. Functions & Methods (`function/`)](#4-functions--methods-function)
  - [5. Arrays (`arreys/`)](#5-arrays-arreys)
  - [6. Strings (`strings/`)](#6-strings-strings)
  - [7. Bit Manipulation (`bit manipulation/`)](#7-bit-manipulation-bit-manipulation)
  - [8. Sorting Algorithms (`bubblesort/`)](#8-sorting-algorithms-bubblesort)
- [Prerequisites & Running the Code](#prerequisites--running-the-code)
  - [Prerequisites](#prerequisites)
  - [Compile and Execute](#compile-and-execute)
- [Workflow / Maintenance Rule](#workflow--maintenance-rule)

---

## 📖 Overview

This repository documents hands-on Java practice ranging from foundational programming concepts to core data structures and sorting algorithms. Each topic is organized into its own dedicated directory.

---

## 📂 Repository Structure

### 1. Starting Concepts (`startingconcepts/`)
Foundational Java syntax, basic input/output, and conditionals:
- `firstclass.java` - Basic Java class and entry point (`main` method).
- `scannerclass.java` - Taking user input via `java.util.Scanner`.
- `variable.java` - Variable declaration and basic data types.
- `conditionstatament.java` - Conditional branching (`if-else`).
- `evenodd.java` - Checking whether an input number is even or odd.
- `greatersmaller.java` - Comparing numbers to find greater and smaller values.
- `dowhile.java` - Basic `do-while` demonstration.
- `patter.java` - Simple introductory pattern logic.

### 2. Loops & Iterations (`loops/`)
Iterative statements and loop constructs:
- `forloops.java` - Standard `for` loop syntax and usage.
- `whileloop.java` - `while` loop conditions and iterations.
- `dowhile.java` - `do-while` loop execution flow.
- `PrintOneToTen.java` - Printing sequence of numbers from 1 to 10.
- `EvenOddLoop.java` - Loop-based filtering of even and odd numbers.

### 3. Patterns (`patterns/`)
Nested loops for printing geometric patterns in the console:
- `rectangle.java` - Solid rectangle pattern using nested loops.
- `hollowrectangle.java` - Hollow rectangle boundary pattern.

### 4. Functions & Methods (`function/`)
Modular programming using static methods and parameter passing:
- `function.java` - Introduction to method declarations and calls.
- `addition.java` - Function to calculate sum of two numbers.
- `multiplication.java` - Function to calculate product of two numbers.
- `fectorial.java` - Factorial calculation using iterative/recursive logic.
- `AverageOfThreeNumbers.java` - Function to compute the average of 3 numbers.
- `SumOfOddNumbers.java` - Function to calculate the sum of odd numbers up to $n$.

### 5. Arrays (`arreys/`)
Linear data structures and multi-dimensional matrices:
- `marks.java` - 1D array creation, initialization, and element access.
- `twodaareys.java` - 2D arrays (matrices) input and traversal.
- `locationofX.java` - Searching for target value $x$ in a 2D matrix (Linear Search).

### 6. Strings (`strings/`)
Immutable character sequences and String class methods:
- `strings.java` - String declaration, instantiation, and console printing.
- `concatenation.java` - String concatenation using `+` operator.
- `charAt.java` - Character extraction using `.charAt(index)`.
- `compare.java` - String equality and lexicographical comparison using `.compareTo()`.

### 7. Bit Manipulation (`bit manipulation/`)
Bitwise operations and bitmasking:
- `Getbit.java` - Checking whether a specific bit at position $i$ is 0 or 1 using bitmask (`1 << pos`) and bitwise AND (`&`).

### 8. Sorting Algorithms (`bubblesort/`)
Elementary comparison-based sorting algorithms:
- `qwert.java` - Bubble Sort implementation to sort an integer array in ascending order.

---

## 🚀 Prerequisites & Running the Code

### Prerequisites
- **JDK (Java Development Kit)**: Version 8 or higher (JDK 17+ recommended). Check with:
  ```bash
  java -version
  javac -version
  ```

### Compile and Execute

#### For standalone files without packages:
```bash
javac path/to/FileName.java
java -cp path/to FileName
```

#### For files with package declarations (e.g., `bubblesort/qwert.java`):
From the root of the project:
```bash
# Compile
javac bubblesort/qwert.java

# Run
java bubblesort.qwert
```

---

## 📝 Workflow / Maintenance Rule

> **Important**: Whenever new programs, packages, or exercises are created and pushed to this repository, update this `README.md` to document the new files, topics, and descriptions.
