public class Student {
    String FN;
    String LN;
    int Sid;

    //define a constuctror--no artgument construction cause the () is empty
    //constructors do not have any return types
    //constructors must have to have the same name as the class name
    //constrctores are useful for intialization
    Student(){//intializaation is what they are used for
        FN= "John";//this is a constructor --it alaways has to be under the class--
        LN="Jonas";
        Sid= 120;
    } //if the constrctor is there without any deafults it will be an error ex:like if you get reid of the first initlazied oned and only the second one
Student(String FN, String LN, int Sid){    //inside the parentehsis is called parameters
       this.FN=FN;
       this.LN=LN;
       this.Sid=Sid;
}
//this is a static method
    //method can be static and no-static
    //this method return nothing- return return type is void
    //return types can be- int, float, double, boolean, string, char,

    //method name is main     //bottom is parameter and args can be changed- but string cant be
    //jvm access the static method using ClassNAme.MethodName
    public static void main(String[] args) {//main method
        Student s3=new Student("Bukumi",  "Jayeola", 111);
        System.out.println("First Name is:" +s3.FN);
        System.out.println("Last Name is:" +s3.LN);
        System.out.println("Student ID is:" +s3.Sid);
        Student s1 =new Student();

        //contrsutctor is the deafuly constrctor the part that is new Student it is a deafult cause ti will assign deafult values to the attributes, it goes to the student class and sees ow many attrbutes it has and- heap has all the attributes such as FN LN SID, and stack has s1 and s2-reference heap references refernece stack
        //stack and heap store
//class name has to be same as file
        //main has to be main

        //if construcutors are not defined JVM will provide a default contructor
        //use of dot operater (.)--use this to access the info in the attributes --& must be used with reference- it follows a reference--

     System.out.println(s1);

     Student s2=new Student(); //all it does is just check that Student constrcutor so it will print the same result
        System.out.println("First Name is:" +s2.FN);
    System.out.println("Last Name is:" +s2.LN);
   System.out.println("Student ID is:" +s2.Sid);

//        System.out.println("First Name is:" +s1.FN);
//        System.out.println("Last Name is:" +s1.LN);
//        System.out.println("Student ID is:" +s1.Sid);

        System.out.println("Hello Constructors");


    }
}
/*the order in which it is
Public class file name
Attrivutes
constrctors
--???--
 main method*/

//s1==s2 would be wrong because the address are different but the references are the same
// s1.FN== s2.FN would be true since they would be the same output john==john is basically what itd be
//(.) ourpsoe is to acceess the reference or smthn along those lines
