# 🎓 Spring Boot Student Marks Calculator

A simple **Spring Boot web application** that allows users to enter student details (Roll No, Name, and Marks) and calculates the **average percentage**.

---

## 🚀 Features

- Input form for student details:
  - Roll Number
  - Name
  - Marks for three subjects
- Calculates total and percentage
- Displays results neatly using Thymeleaf templates
- Built with **Spring Boot MVC** and **HTML + CSS**

---

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot**
- **Thymeleaf**
- **HTML / CSS**
- **Maven**

---

## 📂 Project Structure

SpringWeb3/
├── src/
│ ├── main/
│ │ ├── java/com/example/demo/
│ │ │ ├── MyController.java
│ │ │ └── SpringWeb3Application.java
│ │ └── resources/
│ │ ├── templates/
│ │ │ ├── index.html
│ │ │ └── result.html
│ │ └── application.properties
│ └── test/java/com/example/demo/
│ └── SpringWeb3ApplicationTests.java
├── pom.xml
└── README.md


---

## 🧮 How It Works

1. User fills the form with Roll No, Name, and three marks.
2. The controller calculates the average:
   ```java
   double percent = (m1 + m2 + m3) / 3.0;


Results are displayed on a separate HTML page using Thymeleaf.

💻 How to Run

Clone this repository:

git clone https://github.com/Hemanth92787/springboot-student-marks.git


Open it in Spring Tool Suite (STS) or IntelliJ IDEA.

Run the main class:

SpringWeb3Application.java


Open your browser and visit:

http://localhost:9090/percent

🧑‍💻 Author

Hemanth Reddy Palem
📍 Bangalore, India
📧 [your-email@example.com
]
🌐 [Your LinkedIn or Portfolio link if you want to add it]

🏁 Future Improvements

Add validation for marks input

Include total marks and grade

Store student data in a database (MySQL)

⭐ If you find this project helpful, give it a star on GitHub!


---

### 🧩 Step 3: Commit and push the README

Once saved, go back to your Command Prompt in the project folder and run:

```bash
git add README.md
git commit -m "Added README file"
git push
