public class oops2 {
    public class oop10 {
        public static void main(String args[]){
    //         Pen p1 = new Pen();  //constructor,created a pen class p1
    //         p1.color = "yellow";
    //         p1.setcolor("blue");
    //         System.out.println(p1.getcolor());
    //         p1. setTip(5);
    //         System.out.println(p1.getTip());
    //         p1.setcolor("red");
    //         // p1.color = "red";
    //         System.out.println(p1.getcolor());
            
    //         BankAccount myAcc = new BankAccount();
    //         myAcc.username = " fvbnjm";
    //         my.password = " dfghj"    // this throw error ,password is a private variable
    //         myAcc.setPassword("asdfsdfc");    //we can set password 
    
    
    //         Student s1 = new Student("palak");
    //         System.out.println(s1.name);
    //         Pen p1 = new Pen("blue");
    //         System.out.println(p1.getcolor());
    //         System.out.println(p1.color);
    //         p1.setcolor("green");
    //         Pen p1 = new Pen("green");
    //         p1.color = "green";
    //          System.out.println(p1.color);
    
                // Student s1 = new Student();
                // s1.name = "palak";
                // s1.roll = 554;
                // s1.password = " abdc";
                // s1.marks[0] = 100;
                // s1.marks[1] = 90;
                // s1.marks[2] = 80;
                // class Address{
                //     String city;
                // }
           
    
                // Student s2 = new Student(s1);  //copy
                // s2.password = "rty";
                // s1.marks[0] = 56;
                // for(int i = 0;i<3; i++){
                //     System.out.println(s1.marks[i]);
                    
                // }
                // for(int i = 0;i<3; i++){
                //     System.out.println(s2.marks[i]);
                    
                // }
                // Fish shark = new Fish();    //inheritance
                // shark.eat();
    
                // Dog dobby = new Dog();   //multilevel inh
                // dobby.eat();
                // dobby.legs = 4;
                // System.out.println(dobby.legs);
    
                // Cal cals  =  new Cal();    //overloading
                // System.out.println(cals.sum(1,2));
                // System.out.println(cals.sum(1,23));
                // System.out.println(cals.sum((float)1.3,(float)(2.3)));
                
                // Deer d = new Deer( );
                // d.eat();
                    
                // Horse h = new Horse();
                // h.eat();
                // h.walk();
                // System.out.println(h.color);
                // h.changecolor();
                // System.out.println(h.color);
                // Mustang  myhorse = new Mustang();
    
                // Chicken c = new Chicken( );
                // c.eat();
                // c.walk();
               
                // Animal a = new Animal()   // object cannot create
    
    }       
    }
    // }
    // class BankAccount{
    //     public String username ;
    //     private String password; 
    //     public void setPassword(String pwd){
    //         password = pwd; 
    //        }
    
    
    // // }
    // class Pen{
    //     private String color;
    //     public int tip;
    
    //     Pen (String color){
    //         this.color = color;
    //     }
    
    //     // function for color change
    //     void setcolor(String newColor){
    //         color = newColor;    
    //     }
    //     String getcolor(){
    //         return this.color;
    //     }
    // }
    //      // function for tip change
    //     void setTip(int newTip){
    //         tip = newTip;    
    //     }
    //     // getter and setters
    
    //     int getTip(){
    //         return this.tip;
    //     }
    // }
    // class Student{
    //     String name;int age; float percentage;
    //     void calPrcentage(int maths,int chem ,int phy){
    //         percentage = (phy+ chem + maths)/3;
    //     }
    // }
    
    // //  constructor 
    // class Student{
    //     String name;
    //     int roll;
    
    //     Student(String name){
    //         this.name = name;
    //     }
    //     Student (String name){
    //     }  
    //     // return null
    
    //     // constructor overloading 
    //     Student (){
    //         System.out.print("constructor");
    
    
    // /     }
    
    
    //  copy constructor
    // class Student {
        // String name;
        // int roll; 
        // String password;
        // int marks[];
    
        // shallow copy constructor
        // Student (Student s1){
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     marks = new int[3];
        //     this.marks = s1.marks;
        
        // }
        // deep copy constructor
            // Student(Student s1){
        //         marks = new int[3];
        //         this.name = s1.name;
        //         this.roll = s1.roll;
        //         // this.marks = s1.marks;
        //         for (int i=0; i<marks.length; i++ ){
        //             this.marks[i] = s1.marks[i];
        //         }
        //     }
    
       
        // Student(){
        //     marks = new int[3];
        //     System.out.println("comstructor is called");
        // }
        // Student(String name){
        //     this.name = name;
        //     marks = new int[3];
    
        // }
    
    // INHERITACE
    // class Animal{
    //     String color;
    //     void eat(){
    //         System.out.println("eats");
    //     }
    //     void breathe(){
    //         System.out.println("breathes");
    //     }
    // }
    //     class Mammal extends Animal{
    //        void walk(){
    //            System.out.println(" walk");
    //     }
    // }
    //     class Fish extends Animal{
    //         void walk(){
    //             System.out.println(" walk");
    //         }
    // }
    //     class Bird extends Animal{
    //        void walk(){
    //          System.out.println(" walk");
    //     }
    // }
    
    // DERIVED CLASS
    // class Fish extends Animal{
    //     int fins;
    //     void swim(){
    //         System.out.println("swims in water");
    //     }
    // }
    // class Mammals extends Animal{
    //     int legs;
    // }
    // class Dog extends Mammals{
    //     String breed;
    
    // }
    
    // POLYMORPHISM
    // class Cal{
    //     int sum( int a, int b){
    //         return a + b;
    //     }
    //     int sum( int a, int b,int c){
    //         return a+b+c;
    //         }
    //     float sum( float a, float b){
    //         return a + b;
    //          }
    // }
    
    // class Animal {
    //     void eat(){
    //         System.out.println("eat anything");
    //     }
    // }
    
    // class Deer extends Animal {
    //     void eat(){
    //         System.out.println("eat grass");
    //     }
    // }
    
    // ABSTRACTION
    // abstract class Animal{
        // Animal(){
        //     System.out.println("animal constructor called");
        // }
    //     String color;
    //     Animal(){
    //         color = " peach";
    //     }
    //     void eat(){
    //         System.out.println("animal eats");
    //     }
    //     abstract void walk();
    // }
    // class Horse extends Animal{
    //     Horse(){
    //         System.out.println("horse constructor called");
    //     }
    //     void changecolor(){
    //         color = "black";
    //     }
    //     void walk(){
    //         System.out.println("walks on 4legs");
    //     }
    // }
    // class Mustang extends Horse{
    //      Mustang(){
    //         System.out.println("mustang constructor called");
    //     }
    
    
    // }
    // class Chicken extends Animal{
    //     Chicken(){
    //         System.out.println("chicken constructor called");
    //     }
    //     void changecolor(){
    //         color = " yellow";
    //     }
    //     void walk(){
    //         System.out.println("walks on 2legs");
    // } 
// }
