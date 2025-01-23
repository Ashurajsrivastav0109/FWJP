class q3 {
    public static void main(String args[]) {
        int totalMarks, scoredMarks, marksLost, percentageLost, percentageScored;
        
        totalMarks = 500;
        scoredMarks = 430;
        marksLost = totalMarks - scoredMarks;
        percentageLost = (marksLost * 100) / totalMarks;
        percentageScored = 100 - percentageLost;
        
        System.out.println("percentage: " + percentageScored + "%");
    }
}