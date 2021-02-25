package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.exam.Exam;
import com.xworkz.xworkzapp.exam.HallTicket;

public class ExamTester {
	public static void main(String[] args) {
		Exam exam=new Exam();
		exam.setExamCode("VTU420");
		exam.setFees(420);
		System.out.println(exam.getExamCode());
		
		HallTicket hallticket=new HallTicket("drashan","1rcb12cs421","15cs45");
		hallticket.displayInfo();
		exam.allow(hallticket);
	}

}
