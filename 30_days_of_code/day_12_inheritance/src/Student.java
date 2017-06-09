class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
	public Student(String firstName, String lastName, int id, int[] scores){
		super(firstName, lastName, id);
		
		this.testScores = scores.clone();
	}

	
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
    	char c;
    	
    	int sum =0, res;
    	
    	for (int score : this.testScores){
    		sum += score;
    	} 	
    	res = (int) ( (sum/(double) this.testScores.length) +0.5 );
    	
    	if (90 <= res && res <= 100){
    		c = 'O';
    	} else if (80 <= res && res < 90) {
    		c = 'E';
    	} else if (70 <= res && res < 80) {
    		c = 'A';
    	} else if (55 <= res && res < 70) {
    		c = 'P';
    	} else if (40 <= res && res < 55) {
    		c = 'D';
    	} else {
    		c = 'T';
    	}
    	
    	return c;
    }
}
