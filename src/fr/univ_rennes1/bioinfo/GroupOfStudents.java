package fr.univ_rennes1.bioinfo;

import java.util.ArrayList;


/**
 * @author Olivier Dameron
 *
 */
public class GroupOfStudents extends ArrayList<Student> {
	
	public double getMinGrade() {
		double min =Double.MAX_VALUE;
		for (Student s : this) {
			if(s.getGrade()<min)
				min = s.getGrade();
		}
		return min;
	}
	
	public double getMaxGrade() {
		double max =0;
		for (Student s : this) {
			if(s.getGrade()>max)
				max = s.getGrade();
		}
		return max;
	}
	
	public double getAverageGrade() {
		double avg =0;
		for (Student s : this) {
			avg += s.getGrade();
		}
		return avg/this.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student riri = new Student("riri", 12.5);
		Student fifi = new Student("fifi", 14.0);
		Student geo = new Student("geo", 19.5);
		Student donald = new Student("donald", 10.5);
		Student loulou = new Student("loulou", 18.5);
		
		GroupOfStudents m1bio = new GroupOfStudents();
		m1bio.add(riri);
		m1bio.add(fifi);
		m1bio.add(loulou);
		m1bio.add(geo);
		m1bio.add(donald);
		
		System.out.println("Grade min: " + m1bio.getMinGrade());
		System.out.println("Grade max: " + m1bio.getMaxGrade());
		System.out.println("Average: " + m1bio.getAverageGrade());
	}

}
