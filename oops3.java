// public class oops3 {
    // public static void main(String args[]){
    // Queen q = new Queen();  //interface
    // q.moves();
    // }
    

    // Student s1 = new Student();   //static
    // s1.schoolName = " JVM";
    // Student s2 = new Student();
    // System.out.println(s2.schoolName);


    // Horse h = new Horse();   //super
    // System.out.println(h.color);

    // Student s = new Student();  //ques1
    // s.name = "aman";
 
    // car c = new car();         //ques2
    // vehicle v = new vehicle();
    // vehicle v = new car();  
    // car c = new vehicle();(not true)

    // Vehicle obj1 = new Car();   //ques3 
    // obj1.print1();

    // Vehicle obj2= new Vehicle();
    // obj2.print();

    // Test t = new Test();      //ques4
    // t.changeB();
    // System.out.print( Test.a + Test.b);

//     final Car car = new ElectricCar();
//     System.out.print(car.drive());

// }
// }

//          INTERFACE
     // to multiple multiple inheritance(multiplr a , b -> c)
    // total abstraction
    // all methods are public , static ,and without imlplementation, 
    //variable are final, staic and public
        

// interface ChessPlayer{
//     void moves();

// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right,diagonal(in all direcdtions)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right,diagonal(by 1 step)");
//     }
// }


//           static keyword
// class Student{
//     static  int retunPercentage(int math, int chem , int phy){
//         return( math + phy + chem)/3;
//     }
//     String name;
//     int roll;

//     static String schoolName;
//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }

//          Super keyword
// class Animal{
//     String color ;
//     Animal (){
//         System.out.println("animal constructor is called");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         super.color = " browm";
//         System.out.println(" horse constructor ids called");
//     }
// }




//  ---PRACTICE----
//  QUES 1
// class Student{
//     String name;
//     int marks;
// }

// ques 2}\
// class vehicle{}
// class car extends vehicle{}

// ques3
// class Vehicle{
//     void print(){
//         System.out.println(" base class ( vehivle)");
//     }
// }
// class Car extends Vehicle{
//     void print1(){
//         System.out.println(" child class ( vehivle)");

//     }
// }

// ques 4
// class Test{
//     static int a = 10; 
//     static int b ;
//      static void changeB(){
//         b = a*3;
//      }
// }
 
// ques 5
// class Autombile{
//     private String drive(){
//         return " driving vehicle";
//     }
// }
// class Car extends Autombile{
//     protected String drive(){
//         return "driving car";
//     }
// }
// public class ElectricCar extends Car{
// public final String drive(){
//     return "driving electric car";
// }
// }


// ques 6
// abstract class Car{
//     static{
//         System.out.print("1");
//     }
//     public Car(String name){
//         super();
//         System.out.print("2");
//     }
//     {
//         System.out.print("3");
//     }
// }
// class BlueCar extends Car{
//     System.out.print("4");
// }
// public BlueCar(){
//     super("blue");
//     System.out.print("5");
// }