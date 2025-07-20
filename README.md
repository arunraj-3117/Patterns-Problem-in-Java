# Patterns-Problem-in-Java
# 🧵 30 Days Java Pattern Printing Challenge

Welcome to my **30 Days of Pattern Printing Challenge using Java!**  
Each day, I'm solving one pattern problem using core Java to strengthen my understanding of loops, logic-building, and clean output formatting.
## ✅ Days Completed

### 📅 Day 1 – Right-Angled Triangle Pattern
📂 **File:** `pattern1.java`
📥Example Input:
5
📤 **Example Output:**
*
* *
* * *
* * * *
* * * * *
🧠 **Logic:**  
- Outer loop runs from `0` to `n` (number of rows)  
- Inner loop prints `*` `i` times  
- `System.out.println(" ");` ensures a newline after each row

---

### 📅 Day 2 – Reversed Right-Angled Triangle
📂 **File:** `pattern2.java`
📥 **Example Input:**
5
📤 **Example Output:**
* * * * *
* * * * 
* * * 
* *
*

🧠 **Logic:**  
- Outer loop from `0` to `n`  
- Inner loop prints decreasing stars: from `n` down to `i+1`

---

### 📅 Day 3 – Left-Aligned Number Pyramid
📂 **File:** `pattern3.java`
📥 **Example Input:**
5
📤 **Example Output:**
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
🧠 **Logic:**  
- First inner loop prints spaces for alignment  
- Second inner loop prints the current row number `i`, repeated `i` times

-----
### 📅 Day 4 – Hollow Square Pattern

📂 **File:** `pattern4.java`

📥 **Example Input:**
5
📤 **Example Output:**
* * * * *
*       *
*       *
*       *
* * * * *

🧠 **Logic:**  
- For the **first and last row**, print all stars  
- For the **middle rows**, print `*` at the start and end, and spaces in between  
- Use conditionals inside nested loops to handle the hollow structure

---

### 📅 Day 5 – Hollow Left-Aligned Triangle

📂 **File:** `pattern5.java`

📥 **Example Input:**
5
📤 **Example Output:**
    *    
   * *   
  *   *  
 *     * 
* * * * *

🧠 **Logic Explanation:**
- Use two nested loops  
- Outer loop for each row  
- First inner loop prints **leading spaces**  
- Second inner loop prints stars `*` only at the **first and last position of the row**  
- For the **first row**, print only one star  
- For the **last row**, print all stars with single spacing

🛠️ **Concepts Used:**
- Conditional logic (`if`, `else`) inside loops
- Precision formatting using space and character placement

---


## 📌 Stay Connected

Follow my journey here and feel free to:
- 🌟 Star the repo if you find it useful
- 🍴 Fork the repo to try the patterns yourself
- 🧠 Suggest new pattern ideas

Let’s code and grow together! 🚀


