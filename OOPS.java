/*
    Object Oriented Programming -: OOP is a programming paradigm that uses classes & objects to design a program or methodology.
            OOP is about creating objects that contains both data functions.

    Class -: A Class is a blueprint that defines the variables & the methods. Each class has a name, and describes attribute and behaviour.
                Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated.

    Object -: Object is a real world entity which have some properties & attributes. It is an instance of class.
                An object can represent a person, place or any other item. An object can operate on both data members and member functions.
                    When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.
*/

class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
    }
}

class OOPS{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Suryansh";
        s.age = 23;
        s.getInfo();

        Student t = new Student();
        t.name = "Shams";
        t.age = 22;
        t.getInfo();
    }
}

/*
    ‘this’ keyword -: ‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to:
        1. pass the current object as a parameter to another method
        2. refer to the current class instance variable
 */


/*
    Constructor -: A Constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
        ● Constructors have the same name as class or structure.
        ● Constructors don’t have a return type. (Not even void)
        ● Constructors are only called once, at object creation.
 */


class Student{
    Student(){
        System.out.println("I am a constructor.");
    }
}







// There can be three types of constructor

/*
    1. Non-Parameterized constructor -: A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.
 */

class Student {
    String name;
    int age;
    Student() {
        System.out.println("Constructor called");
    }
}

/*
    2. Parameterized constructor -: Constructor which has parameters is called a parameterized constructor. It is used to provide different values to distinct objects.
 */

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



/*
    3. Copy Constructor -: Copy Constructor is the constructor used when we want to initialize the value to the new object from the old object of the same class.
            There is only a user defined copy constructor in Java(C++ has a default one too).
 */

class SimpleNumber{
    private int number;
    public SimpleNumber(int number){
        this.number = number;
    }

    public SimpleNumber(SimpleNumber object){
        this.number = object.number;
    }

    public int getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
        SimpleNumber s = new SimpleNumber(10);
        SimpleNumber t = new SimpleNumber(s);
        System.out.println(s.getNumber());
        System.out.println(t.getNumber());
    }
}

/*
    Polymorphism -: It is a feature that allows the object to behave differently in different conditions.
            Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’.
    Types of Polymorphism -:
        1. Compile Time Polymorphism (Static)
        2. Runtime Polymorphism (Dynamic)
 */

/*
    Compile Time Polymorphism -: The polymorphism which is implemented at
    the compile time is known as compile-time polymorphism. 
    Example - Method Overloading
        Method Overloading -: Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis:
            1. The type of the parameters passed to the function.
            2. The number of parameters passed to the function.
 */






class Add{
    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.sum(5, 4));
        System.out.println(obj.sum(5, 4,3));
    }
}

/*
    Runtime Polymorphism -: Runtime polymorphism is also known as dynamic
    polymorphism. Function overriding is an example of runtime polymorphism. 
        Function Overriding -: Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, parent and child classes both contain the same function with a different definition. The call to the function is determined at runtime is known as runtime polymorphism.
 */

class A{
    public void display(){
        System.out.println("Parent class");
    }
}

class B extends A {
    public void display(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.display();
    }
}







/*
    Inheritance -: Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes.
        In Java, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class.
 */

/*
    Types of Inheritance -: 

    1. Single Level Inheritance -: When one class inherits another class, it is known as single level inheritance.
 */

class Vehicle{
    String company = "Tata";
    public void horn(){
        System.out.println("Ppppp");
    }
}

class Car extends Vehicle{
    String brand = "Nexon";
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.company);
        System.out.println(c.brand);
        c.horn();
    }
}

/*
    2. Hierarchical inheritance -: Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
 */

class Parent {
    public void parentDisp() {
        System.out.println("Parent class");
    }
}

class Son extends Parent {
    public void sonDisp() {
        System.out.println("Son class");
    }
}






class Daughter extends Parent {
    public void daughterDisp() {
        System.out.println("Daughter class");
    }
}
class HI {
    public static void main(String[] args) {
        Son s = new Son();
        s.parentDisp();
        s.sonDisp();

        Daughter d = new Daughter();
        d.parentDisp();
        d.daughterDisp();
    }
}
/*
    3. Multilevel inheritance -: Multilevel inheritance is a process of deriving a class from another derived class.
             Multilevel inheritance involves a chain of inheritance where a derived class is created from another derived class.
 */

class Animal{
    public void eat(){
        System.out.println("Animal is eating.");
    }
}
class Mammal extends Animal{
    public void run(){
        System.out.println("Mammal is running...");
    }
}
class Dog extends Mammal{
    public void bark(){
        System.out.println("Dog is barking...");
    }
}
class MLI{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
        d.bark();
    }
}

/*
    Hybrid inheritance -: Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
 */



/*
    Access Modifiers in Java
    ➢ Private -: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
*/

class Account{
    private String name = "Suryansh";
    public String getName(){
        return this.name;
    }
}

class PrivateAM{
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.name); //directly it can not be accessed
        System.out.println(a.getName()); //now it is accessible
    }
}


/*  ➢ Default -: The access level of a default modifier is only within
    the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
*/

class Account{
    String name = "Suryansh";
}

class DefaultAM{
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.name);
    }
}


/*  ➢ Protected -: The access level of a protected modifier is within
    the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
*/


/*
    ➢ Public -: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
 */





/*
    Encapsulation -: Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java).
        The meaning of Encapsulation is to make sure that "sensitive" data is hidden from users.
 */

class Person{
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class Main{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Suryansh");
        p.setAge(23);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        Person q = new Person();
        q.setName("Shams");
        q.setAge(22);
        System.out.println(q.getName());
        System.out.println(q.getAge());
    }
}









/*
    Abstraction -: It is the process of hiding hiding certain details & showing essential information to the users. It can be achieved with either abstract class (or interface in Java). It can have constructors and static methods also. It can have final methods which will force the subclass not to change the body of
    the method.

    Abstract Class -: It is a restricted class that can not be used to create objects (to access it, it must be inherited from another class).

    Abstract Method -: It can only be used in abstract class, and it does not have a body. The body is provided by the subclass.
 */

abstract class Inbox{
    private String message;
    Scanner sc = new Scanner(System.in);

    public abstract void showMessage();

    public void writeMessage(){
        System.out.print("Enter the message : ");
        message = sc.nextLine();
        System.out.println("Message sent.");
    }

    public String getMessage(){
        return this.message;
    }
}

class Solution extends Inbox{
    @Override
    public void showMessage() {
       String message = getMessage();
       System.out.println(message);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.writeMessage();
        s.showMessage();
    }
}













/*
    Interface -: 
    ● All the fields in interfaces are public, static and final by default.
    ● All methods are public & abstract by default.
    ● A class that implements an interface must implement all the methods declared in the interface.
    ● Interfaces support the functionality of multiple inheritance.
 */

interface Animal {
    void animalSound();
    void run();
}

class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Dog Barks...");
    }

    @Override
    public void run() {
        System.out.println("Dog runs...");
    }
}

class Solution extends Dog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalSound();
        d.run();
    }
}

/*
    Data binding : Data binding is a process of binding the application UI and business logic. Any change made in the business logic will reflect directly to the application UI.
 */