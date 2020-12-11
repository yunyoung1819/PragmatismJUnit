package chapter02;

import chapter01.Scoreable;

public class Criterion implements Scoreable {
    // ...
    private Weight weight;
    private Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

    public Answer getAnswer() { return answer; }
    public Weight getWeight() { return weight; }

    public void setScore(int score) { this.score = score; }
    public int getScore() { return score; }

    public boolean matches(Answer answer) {
        return getWeight() == Weight.DontCare ||
                answer.match(getAnswer());
    }
}

