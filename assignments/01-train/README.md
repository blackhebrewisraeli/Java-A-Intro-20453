# Train Distance Calculator
<!-- Tech & meta badges (static; no CI required) -->
![Language: Java](https://img.shields.io/badge/Language-Java-red?logo=java)
![Runtime: CLI](https://img.shields.io/badge/Runtime-CLI-0aa)
![I/O: Scanner](https://img.shields.io/badge/I%2FO-Scanner-4c1)
![Units: km_per_hour](https://img.shields.io/badge/Units-km__per__hour-795548)
![Topic: Basic Arithmetic](https://img.shields.io/badge/Topic-Basic%20Arithmetic-999)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
> Java CLI that reads two trains’ speeds and times, computes per-train distances and their absolute difference; simple Scanner I/O and basic arithmetic.


## Author
- **Name**: Shimon Esterkin  
- **ID**: *****2258   
- **Semester**: 2023B

## Program Description

This Java program calculates the distance traveled by two trains based on their speeds and travel times. The program demonstrates fundamental concepts in Java programming including input handling, basic arithmetic operations, and variable manipulation.

## Class Structure
The program consists of a single class:
```
Train.java
└── main() method
```

## Features
- Accepts user input for two trains' parameters
- Handles speed in kilometers per hour
- Converts time from minutes to hours automatically
- Calculates total distance traveled by each train
- Computes the absolute distance between trains

## Input Requirements
The program requires four integer inputs in the following order:
1. Speed of train 1 (in km/h)
2. Time of train 1 (in minutes)
3. Speed of train 2 (in km/h)
4. Time of train 2 (in minutes)

Note: Time inputs are automatically converted from minutes to hours by dividing by 10.

## How to Run
1. Compile the program:
```bash
javac Train.java
```

2. Run the program:
```bash
java Train
```

## Example Usage
```
Please enter 4 integers
Please enter the speed of train 1 (km/h):
60
Please enter the time of train 1 (m):
30
Please enter the speed of train 2 (km/h):
80
Please enter the time of train 2: (h):
20
The distance between the trains is 180 km
```

## Calculation Logic
1. For each train:
   - Time is converted from minutes to hours: `time = time / 10`
   - Distance is calculated using: `distance = speed * time`
2. Final distance calculation: `|distance1 - distance2|`

## Technical Requirements
- Java Development Kit (JDK)
- Command-line interface or IDE
- Scanner class (java.util.Scanner)

## Limitations
- Assumes valid integer inputs
- No input validation implemented
- Single-use program (needs to be rerun for multiple calculations)
- Time conversion is fixed at dividing by 10

## Implementation Notes
- Uses Scanner class for input handling
- Closes Scanner properly to prevent resource leaks
- All calculations are performed using integer arithmetic
- Time conversion is hardcoded (division by 10)

---
Created by [SemionVlad](https://github.com/SemionVlad) for academic and portfolio purposes. This repository is intended for **non-commercial**, **educational** sharing only.
