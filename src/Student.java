public class Student {
    String FN;
    String LN;
    int Sid;

    //this is a static method
    //method can be static and no-static
    //this method return nothing- return return type is void
    //return types can be- int, float, double, boolean, string, char,

    //method name is main     //bottom is parameter and args can be changed- but string cant be
    //jvm access the static method using ClassNAme.MethodName
    public static void main(String[] args) {
        Student s1 =new Student();
        //contrsutctor is the deafuly constrctor the part that is new Student it is a deafult cause ti will assign deafult values to the attributes, it goes to the student class and sees ow many attrbutes it has and- heap has all the attributes such as FN LN SID, and stack has s1 and s2-reference heap references refernece stack
        //stack and heap store
//class name has to be same as file
        //main has to be main

        //if construcutors are not defined JVM will provide a default contructor
        //use of dot operater (.)--use this to access the info in the attributes --& must be used with reference- it follows a reference--
        System.out.println("First Name is:" +s1.FN);


        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}