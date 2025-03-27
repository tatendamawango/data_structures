# Data Structures in Java

This project demonstrates custom implementations of essential data structures such as Arrays, Linked Lists, Stacks, and Queues using Java. It is a hands-on introduction to understanding and manipulating data collections at a low level.

## 📂 Project Structure

The project consists of the following major components:

```
.
├── Main.java                 # Entry point with various test scenarios
├── models/
│   └── Student.java          # Represents a student object
├── utils/
│   ├── Array.java
│   ├── LinkedList.java
│   ├── ArrayQueue.java
│   ├── LinkedListQueue.java
│   ├── ArrayStack.java
│   ├── LinkedListStack.java
│   ├── List.java            
│   ├── Queue.java            
│   ├── Stack.java            
│   └── DataReader.java       
```

## 📌 Features

### ✅ Custom Data Structures
- `Array<T>`: A generic dynamic array.
- `LinkedList<T>`: A singly-linked list implementation.
- `Stack<T>`: Abstract interface implemented by:
  - `ArrayStack<T>`
  - `LinkedListStack<T>`
- `Queue<T>`: Abstract interface implemented by:
  - `ArrayQueue<T>`
  - `LinkedListQueue<T>`

### 📊 Student Management Example
A data model `Student` is used for testing all list, stack, and queue operations. Data is loaded from a text file (`students_data.txt`).

## 🚀 How to Run

1. **Compile**
   ```
   javac Main.java models/*.java utils/*.java
   ```

2. **Run**
   ```
   java Main
   ```

3. **Expected Output**
   Demonstrates array vs. linked list operations, stack and queue behaviors, and file-based data handling.

## 📄 Sample File Format (students_data.txt)

```
John;Doe;21;IF-8/1
Jane;Smith;19;IF-9/2
```

## 🧪 Tests Covered
- Adding and removing elements
- Insertion and retrieval by index
- Stack operations: push, pop, peek
- Queue operations: enqueue, dequeue, peek
- File reading and populating data

## 🛠️ Concepts Practiced
- Java Generics
- Custom iterable collections
- Interface-based abstraction
- Exception handling
- File I/O using Scanner and FileInputStream
