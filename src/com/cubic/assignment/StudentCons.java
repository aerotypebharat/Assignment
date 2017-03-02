package com.cubic.assignment;

public class StudentCons {
	
	int id=1;
	String name;
	static int section;
	
	
	
	

	public StudentCons(int id) {
		this(3,"rk");
		this.id=id;
		
		
		
		
		System.out.println("this construct id only>> "+id);

		//StudentCons S2 = new StudentCons(3," rk");
		
	}

	public StudentCons(int id, String name) {
		
		this(4,"bk",5);
		
		this.id = id;
		this.name =name;
		System.out.println("this construct id and name >> "+id+name);
		
		//StudentCons S3 = new StudentCons(4," bk",1);
		
	}

	public StudentCons(int id, String name, int section) {
		
		
		this.id = id;
		this.name =name;
		this.section=section;
		
		System.out.println("this construct id name and section>> "+id+name+section);
		
	}
	
	

	public StudentCons() {
		
		System.out.println("this construct nothing ");
		
	}

	public static void main(String[] args) {
		
		
		
	
		//StudentCons S0 = new StudentCons();  // null constructor
		
		StudentCons S1 = new StudentCons(2);
		
		//StudentCons S2 = new StudentCons(3," rk");
		
		//StudentCons S3 = new StudentCons(4," bk ",1);
		

	}

}
