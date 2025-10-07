# Monty Hall Simulation (Spring Boot + Thymeleaf)

This project is a simulation of the **Monty Hall Problem**, built with **Spring Boot**, **Thymeleaf**, **CSS**, and **JavaScript**.

The application performs **10,000 iterations** to analyze the win rate of two strategies:
- **Switching** doors after one is revealed.
- **Staying** with the original choice.

It then displays the **percentage of wins** for each strategy using a **bar chart** and **text summary**.

---

## 🚀 Features

- Backend powered by **Spring Boot**
- Dynamic HTML rendering with **Thymeleaf**
- Simulation logic: runs 10,000 games per request
- Strategy comparison: switch vs. no switch
- Visual results with **JavaScript-powered bar chart**
- Responsive layout with **CSS**

---

## 🧪 Monty Hall Logic

1. Three doors: behind one is a car, behind the others are goats.
2. User picks a door.
3. Host (who knows the contents) opens one of the other two doors to reveal a goat.
4. User either:
   - **Stays** with the original door, or
   - **Switches** to the remaining unopened door.
5. The result is recorded.
6. Repeat 10,000 times to calculate percentages.

---

## 📊 Example Output

After running the simulation, the app displays:

- Percentage of wins if the user **switches** doors
- Percentage of wins if the user **does not switch**
- A **bar chart** comparing both strategies visually

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Thymeleaf**
- **HTML/CSS/JavaScript**
- **Chart.js** (or similar library for bar chart)

---

## ▶️ Running the Project

### Prerequisites
- Java 17+
- Maven or Gradle

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/monty-hall-simulation.git
cd monty-hall-simulation

# Build and run the app
./mvnw spring-boot:run

