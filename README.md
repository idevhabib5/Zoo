# Zoo Management System in Java
# Object Oriented Programming

# Overview
This project is a Zoo Management System implemented in Java as part of the Amazon Junior Developer Course (1/7). It demonstrates the use of Object-Oriented Programming (OOP) principles, including abstraction, inheritance, polymorphism, and interfaces, to model animals and their behaviors.

Users can interact with a console-based menu to manage and explore different animals in the zoo, set their properties, and observe their behaviors like walking, swimming, and eating.

# Features
Animal Classes: Models different animals such as Tiger, Dolphin, and Penguin.
# Interfaces:
Walk for animals capable of walking.
Swim for animals capable of swimming.
Eat for defining eating behaviors.
# Abstract Class:
Animal serves as a blueprint for all animals, encapsulating shared properties and methods.
Dynamic Behavior: Supports setting and displaying attributes specific to each animal type.
Interactive Menu: Console-based interface to interact with animals.
OOP Principles Demonstrated
# Abstraction:

Common properties and behaviors of animals are defined in the abstract Animal class.
Specific behaviors are abstracted into interfaces (Walk, Swim, and Eat).
# Inheritance:

Classes like Tiger, Dolphin, and Penguin inherit properties and behaviors from the Animal class.
# Polymorphism:

Allows handling different animal types (Tiger, Dolphin, Penguin) using the Animal reference type.
Implements interface methods specific to each animal.
# Encapsulation:

All animal properties are private and accessed via getters and setters.
# Installation
# Clone the Repository

bash
Copy
Edit
git clone https://github.com/idevhabib5/Zoo.git
cd zoo-management-system
# Compile the Code
Use javac to compile the Java files:

bash
Copy
Edit
javac Main.java
Run the Program
Execute the compiled code:

bash
Copy
Edit
java Main
How to Use
Launch the program.
Choose an animal from the main menu:
Tiger
Dolphin
Penguin
Interact with the selected animal:
Set properties like age, height, and animal-specific attributes (e.g., stripes for Tiger, color for Dolphin).
Display the animal’s properties.
Observe behaviors like walking, swimming, and eating.
Return to the main menu or exit the program.
Code Structure
plaintext
Copy
# Edit
├── Main.java        # Entry point for the program
├── Animal.java      # Abstract class defining common properties of animals
├── Tiger.java       # Tiger-specific implementation
├── Dolphin.java     # Dolphin-specific implementation
├── Penguin.java     # Penguin-specific implementation
├── Walk.java        # Interface for walking behavior
├── Swim.java        # Interface for swimming behavior
└── Eat.java         # Interface for eating behavior
# Sample Interaction

******* ZOO ANIMAL choice menu ******
1. Tiger
2. Dolphin
3. Penguin
4. Exit
Enter choice of animal (1-4): 2

The animal chosen is: Dolphin
******* ANIMAL details menu for: Dolphin ******
1. Set properties
2. Display properties
3. Display movement
4. Display eating
5. Back to main menu
Enter choice (1-5): 1

Enter age: 5
Enter height: 2
Enter color: Blue
Enter swimming speed: 15
Learning Outcomes
This project helped in understanding:


# Author
Habib Ur Rehman
Course: Amazon Junior Developer (1/7)
