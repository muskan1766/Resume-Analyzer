# 🧬 Resume Analyzer (ATS Scanner Clone)

## 📌 Overview
The Resume Analyzer is a Java-based application that evaluates how well a resume matches a given job description.

It simulates an Applicant Tracking System (ATS) used by companies to filter resumes. The system analyzes keywords from both the resume and job description, calculates a match score, and provides suggestions to improve the resume.

---

## 🎯 Problem Statement
Many job applicants are rejected because their resumes do not match the keywords expected by automated hiring systems (ATS). This project helps users understand how well their resume aligns with a job description and what improvements are needed.

---

## 🚀 Features
- 📄 Reads resume and job description from text files  
- 🧹 Cleans and processes text data  
- 🚫 Removes stop words for better accuracy  
- 🔍 Extracts important keywords  
- 📊 Calculates resume match score (%)  
- ✅ Displays matched keywords  
- ❌ Displays missing keywords  
- 💡 Provides suggestions for improvement  

---

## 🛠️ Technologies Used
- Java  
- Object-Oriented Programming (OOP)  
- File Handling  
- Java Collections (List, Set)  

---

## 📂 Project Structure

```
ResumeAnalyzer/
│
├── Main.java
├── Resume.java
├── JobDescription.java
├── TextProcessor.java
├── Analyzer.java
├── resume.txt
└── job.txt
```


---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
- Java installed (JDK 8 or above)
- VS Code or any Java IDE

---

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/muskan1766/Resume-Analyzer.git
cd Resume-Analyzer
```

### 3️⃣ Prepare Input Files

#### 📄 resume.txt
```
I know Java and problem solving. I have worked on projects.
```
#### 📄 job.txt
```
Looking for candidate with Java, Spring, SQL, problem solving skills.
```

### 4️⃣ Compile the Program

```bash
javac *.java
```

### 5️⃣ Run the Program

```bash
java Main
```

## 📊 Sample Output
```
===== Resume Analysis Result =====

Score: 37%

Matched Keywords:
[MATCHED] java
[MATCHED] problem
[MATCHED] solving

Missing Keywords:
[MISSING] spring
[MISSING] sql

Suggestions:
- Your resume needs improvement.
- Consider adding missing skills: [spring, sql]
```

## 🧠 How It Works
1. Reads resume and job description from files
2. Cleans text (removes special characters)
3. Removes stop words (like "the", "is", "and")
4. Extracts keywords
5. Compares keywords using Set operations
6. Calculates match score
7. Displays results and suggestions

---

## 💡 Future Improvements
- Add GUI interface
- Support PDF/DOC resume upload
- Use advanced NLP techniques
- Add keyword weighting system


## 👩‍💻 Author

Muskan Malik