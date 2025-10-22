// Admissions.java
// Contains the scoring models (Blind vs Aware).

public class Admissions {

    // Blind model (only academic/performance factors)
    public static double blindScore(Applicant app) {
        double score = 0.0;
        score += (app.gpa / 4.0) * 0.52;     // GPA normalized GPA is boosted to .52 from .4 because a GPA is over the course over your entire career.
        score += (app.test / 1600.0) * 0.2;  // Test score normalized. Test is knocked to 0.3 because tests only yeild a snapshot of the student and not the full story.
        score += app.extra * 0.1;
        score += app.essay * 0.05; //was at .1 and reduced to 0.5 because essays can be subjective and may not always reflect true potential. Furthermore, essays only show how good a student is at writing, not their overall capabilities.
        score += app.rec * 0.1;
        return score; // final score between 0 and 1
    }

    // Aware model (adds equity and context)
    public static double awareScore(Applicant app) {
        double score = blindScore(app);

        if (app.income < 40000) score += 0.05;     // low-income boost
        if (app.firstGen) score += 0.05;           // first-generation bonus
        if (app.disability) score += 0.05;         // accessibility consideration. Increased to 0.05 due to the additional challenges faced by students with disabilities.
        if (app.legacy) score += 0.02;             // legacy advantage
        if (app.local) score += 0.03;              // local preference
        return Math.min(score, 1.0);               // cap score at 1.0
    }
}