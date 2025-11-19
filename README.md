# HW2Problem1_Paulino
A Java application that demonstrates two design patterns (Command and Template) in a hurricane prediction scenerio. The system allows users to make and apply Machine Learning and Statistical Prediction Models. Users can also make and reorder Command steps.

## Resources Used in Development
- Proffessor Roy's Code Examples
- Izzy (disscused the UML)

## Design Patterns Implemented
### Command: 
3 command steps, process order is customizable
### Template:
5 default steps, 4 commonly overriden

## Features
- User can create different prediction models: Statistical, Machine Learning
- User can either use default process order or set their own through the command pattern.

## Requirements
- JDK 8 or higher
- No external libraries

## Installation
1. Download src files and import into your desired directory.
2. Save and run the program to ensure installation was successful.

## Usage
Demo program will play automatically and display a full runthrough example of each Prediction Model and Command useage.

## Example Output
Default Run

Fetching Statistical Data...
Pre-processing Statistical Data...
Applying Statistical Prediction Model...
Post-processing Statistical Data...

Fetching Machine Learning Data...
Pre-processing Machine Learning Data...
Applying Machine Learning Prediction Model...
Post-processing Machine Learning Data...

Custom Command Run

Saving Pre-Configured Command Results...
Applying Pre-Configured Command Prediction Model...
Fetching Pre-Configured Command Data...

Process finished with exit code 0
