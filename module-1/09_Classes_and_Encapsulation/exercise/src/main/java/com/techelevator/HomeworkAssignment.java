package com.techelevator;

public class HomeworkAssignment {

    //instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    //constructor
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String getLetterGrade() {
        if ((earnedMarks * 100 / possibleMarks) >= 90) {
            return "A";
        } else if ((earnedMarks * 100 / possibleMarks) >= 80) {
            return "B";
        } else if ((earnedMarks * 100 / possibleMarks) >= 70) {
            return "C";
        } else if ((earnedMarks * 100 / possibleMarks) >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    //setter
    public void setEarnedMarks(int earnedMarks) {
            this.earnedMarks = earnedMarks;
        }
    //getters
    public int getEarnedMarks() {
        return this.earnedMarks;
    }
    public int getPossibleMarks() {
        return this.possibleMarks;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
