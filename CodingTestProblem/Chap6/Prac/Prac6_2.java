package Prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}
public class Prac6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Student> st = new ArrayList<>();
		System.out.println("학생의 수를 입력하세요: ");
		int n = scan.nextInt(); 
		
		System.out.println("학생의 이름과 점수를 입력하세요: ");
		for(int i=0;i<n;i++) {
			String name = scan.next();
			int score = scan.nextInt();
			st.add(new Student(name, score));
		}
		
		Collections.sort(st);
		
		for(int i=0;i<n;i++) {
			System.out.println(st.get(i).getName() + " ");
		}
	}

}
