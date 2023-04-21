package Lec_11;

public class Student {
        static int rollno;
        int marks;
        public Student(){
                this(13);
        }
        public Student(int rno){
                rollno=rno;
                marks=100;
        }


        public Student(int rollno,int marks){
                this.rollno=rollno;
                this.marks=marks;
        }

}
