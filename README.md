# 🎓 Ethical Admissions Algorithm Simulation

This repository is a classroom exercise exploring **ethics and fairness in algorithmic decision-making** — specifically in college admissions.

You’ll implement and reflect on how feature selection and weighting can impact fairness, transparency, and equity in automated systems.

---

## 🧩 Overview

You are part of the admissions committee for **Anonymous University**, located near Anonymous City.  
Due to a large number of applications, the committee decides to use an algorithm to help **rank and shortlist applicants**.

Your task:
- Decide which factors to include (GPA, test scores, extracurriculars, essays, recommendation letters, legacy status, income, etc.)
- Assign weights to each factor.
- Compare outcomes under two models:
  - **Blind model**: Ignores sensitive factors.
  - **Aware model**: Includes them intentionally to promote fairness (e.g., extra weight for first-gen or low-income applicants).

---

## ⚙️ How to Run

You can run the code on any online Java compiler (e.g. [Replit](https://replit.com/~) or [Programiz Java Compiler](https://www.programiz.com/java-programming/online-compiler))  
or locally via terminal:

```bash
javac Applicant.java Admissions.java Main.java
java Main


1A. The variables included are GPA as it shows your academic skills, testing as it shows you during high-pressure environments. Extracurricular because it shows you during outside school hours.
1B. I did not exclude sensitive features because I wanted to get a full scope.
1C. Legacy should because it shows your family has a history of success. However it should have little weight because it more so falls on the person applying.
1D. Essay was at .1 and reduced to 0.5 because essays can be subjective and may not always reflect true potential. Furthermore, essays only show how good a student is at writing, not their overall capabilities.
// Test score normalized. Test is knocked to 0.2 because tests only yield a snapshot of the student and not the full story.
// GPA normalized GPA is boosted to .52 from .4 because a GPA is over the course over your entire career.




2A. People with disabilities benefited more. 	
accessibility consideration. Increased to 0.05 due to the additional challenges faced by students with disabilities.

2B. People with disabilities benefited more.
2C. Adding income makes it more fairer because it levels the playing field.
2D. I feel like the one I created is more fair because it takes people in special circumstances and elevates them.  

3A. I would say my algorithm is transparent because of the commented code.
3B. I would say yes because I could go and explain that maybe their GPA was too low since it was more weighted.
3C. I would feel comfortable because it is taking what I learned in school and processed it fairly.

4A. It could overlook someone and cause them to be admitted. Furthermore, disabilities could make someone make or break since it is so high.
4B. Hiring process, Policing is another one, and anything that must filter people out.
4C. Fairness does not exist. Some algorithms to some people seem fairer than others.
4D. See 4C
4E. Accountability should be in what this person sees as fair and if the majority of people agree. Specifically those who are being filtered.
