Ques. What is Java?

Ans. Java is a general-purpose, high-level, platform-independent, object-oriented language developed by JAMES GOSLING in 1991 at SUN MICROSYSTEMS of USA in 1991. Java is designed to be “WRITE ONCE, RUN ANYWHERE” (WORA), meaning that code written in Java can run on any platform that has a Java Virtual Machine (JVM) installed. Java is widely used for developing enterprise applications, web applications, mobile applications, and embedded systems.


Ques. What are the differences between C++ and Java?
Ans. 1. C++ is platform dependent. --- Java is platform independent.
    2. Used for system progrmng. --- mainly used for application progrmng.
    3. Supports multiple inheritance --- doesn’t support, can achieved
    4. Supports operator overloading --- doesn’t support.
    5. Supports pointer --- doesn’t support.
    6. Uses compiler only --- uses compiler & interpreter both.
    7. Supports call be value and reference – only supports call by value


Ques. What do you understand by Java virtual machine (JVM)?
Ans. The JVM is a virtual “machine” that provides a runtime environment for Java applications and programs. Its role is simple: interpret and execute Java bytecode, which a low-level representation of the compiled form of a piece of Java code. When applications written in Java are compiled, they produce bytecode, which can be executed (or run) by any JVM implementation.


Ques. What is the difference between JDK, JRE, and JVM?
Ans. JDK (Java Development Kit): -> JDK is a software development kit used for developing Java applications.
                                 -> It includes tools such as javac (the Java compiler), jar (for creating Java archive files), and javadoc (for generating documentation from source code comments).
                                 -> JDK also includes the JRE (Java Runtime Environment) along with additional development tools necessary for compiling and debugging Java programs.

JRE (Java Runtime Environment): -> JRE is a runtime environment for executing Java applications.
                                -> It includes the JVM (Java Virtual Machine) and a set of libraries and frameworks necessary for running Java programs.
                                -> JRE does not contain development tools like JDK, making it suitable for running Java applications but not for developing them.


JVM (Java Virtual Machine): -> JVM is an abstract computing machine that enables a computer to run Java bytecode.
                            -> It is responsible for interpreting Java bytecode or compiling it to native machine code, depending on the implementation.
                            -> JVM provides a runtime environment in which Java bytecode can be executed independently of the underlying hardware and operating system.


In summary, JDK is used for Java development and includes tools for compiling, debugging, and running Java programs. JRE is used for executing Java applications and includes the JVM along with necessary libraries. JVM is the runtime environment responsible for executing Java bytecode on a given platform.

Ques. What is JIT compiler?
Ans. The JIT compiler helps to improve the performance of Java programs by compiling bytecodes into native machine code at run time. The JIT compiler is enabled by default. JIT compiles parts of the bytecode that have similar functionality at the same time, and hence reduces the amount of time needed for compilation. Here the term “compiler” refers to a translator from the instruction set of a Java virtual machine (JVM) to the instruction set of a specific CPU.


Ques. What is the platform?
Ans. A platform is the hardware or software environment in which a piece of software is executed. There are two types of platforms, software-based and hardware-based. Java provides the software-based platform.


Ques. What if I write static public void instead of public static void?
Ans. The program compiles and runs correctly because the order of specifiers does not matter in Java.


Ques. What is the default value of the local variables?
Ans. The local variables are not initialized to any default value, neither primitives nor object references.


Ques. What is the purpose of static methods & variables?
Ans. The methods or variables defined as static are shared among all the objects of the class. The static is the part of the class and not of the object. The static variables are stored in the class area, and we do not need to create the object to access such variables. Therefore, static is used in the case, where we need to define variables or methods which are common to all the objects of the class.


Ques. Why Java is not 100% object-oriented?
Ans. Because of Primitive data types namely – boolean, byte, char, int, float, double, long, short.
To make them OO we have wrapper classes which actually “wrap” the primitive data type into an object of that class.


Ques. Why pointers are not used in Java?
Ans. Pointers are unsafe. It increases the complexity of the program and since Java is known for its simplicity of code, adding the concepts of pointers will be contradicting (means implying a statement). Since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user, pointers are discouraged in Java.


Ques. Why String is immutable in Java?
Ans. String pool requires string to be immutable otherwise shared reference can be changed from anywhere. Another Reason is security because string is shared on different area like file system, networking connection, database connection, having immutable string allows you to be secure and safe because no one can change reference of string once it gets created.


Ques. What is a marker interface?
Ans. A Marker Interface can be defined as the interface having no data member and functions. In simpler terms, an empty interface is called the Marker Interface, i.e., Serializable, Cloneable.


interface Cloneable {
    //lines of code
}


Ques. Can you override a private or static method in Java?
Ans. No, we can not override a private or static method in Java. We cannot override a private method in sub class because it’s not accessible there, what we can do is create another private method with the same name in the child class.

For static methods if you create a similar method with same return type and same method arguments in child class then it will hide the superclass method, this is known as method hiding.


Ques. Does “finally” always execute in Java?
Ans. Not in the following cases: “System.exit()” & system crash.


Ques. What methods does the object class have?
Ans. Java.lang.Object class has following methods:
    1. protected Object clone() throws CloneNotSupportedException
    Creates and returns a copy of this object.
    2. public boolean equals(Object obj)
    Indicates whether some other object is “equal to” this one.
    3. protected void finalize() throws Throwable
    Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
    4. public final Class getClass() : returns the runtime class of an object.
    5. public int hashCode() : returns a hash code value for the object.
    6. public String toString() : returns a string representation of the object.


Ques. How can you make a class immutable?
Ans. ▪ Declare the class as final so it can’t be extended.
    ▪ Make all fields private so that direct access is not allowed.
    ▪ Don’t provide setter methods for variables.
    ▪ Make all mutable fields final so that it’s value can be assigned only once.
    ▪ Initialize all the fields via a constructor.


Ques. What is singleton class in Java and how can we make a class singleton?
Ans. Singleton class is a class whose only one instance can be created at any given time, in one JVM.
*/
class Animal {
    private static Animal single_instance = null;
    private Animal () {}
    public static Animal getInstance () {
        if (single_instance == null)
            single_instance = new Animal ();
    return single_instance;
    }
}

Ques. Why is the main method static?
Ans. Because the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and hen call main() method which will lead to the extra memory allocation.


Ques. What are the main principles of object-oriented programming?
Ans. Encapsulation, Inheritance, Polymorphism and Abstraction.


Ques. What is the difference between abstract class and interface?
Ans. ▪ Abstract classes can have both abstract & concrete methods, while interfaces can only have abstract methods (Java 8 onwards can have default & static methods in interface)
    ▪ A class can extend only one abstract class but can implement multiple interfaces.


Ques. What is the use of “static” keyword in Java?
Ans. The “static” keyword is used to define class-level members (variables & methods) that belong to the class itself rather than to instances of the class.


Ques. Difference between Heap and Stack Memory in Java?
Ans. Stack memory is the portion of memory that was assigned to every individual program. And it was fixed. On the other hand, Heap memory is the portion that was not allocated to the java program but it will be available for use by the java program when it is required, mostly during the runtime of the program.


Ques. Briefly explain the concept of constructor overloading.
Ans. Constructor overloading is the process of creating multiple constructors in the class consisting of the same name with a difference in the constructor parameters. Depending upon the number of parameters and their corresponding types, distinguishing of the different types of constructors is done by the compiler.


class Hospital { 
    int variable1, variable2; 
    double variable3; 
    public Hospital (int doctors, int nurses) {
        variable1 = doctors;
        variable2 = nurses;
    }

    public Hospital (int doctors) { 
        variable1 = doctors; 
    } 
    
    public Hospital (double salaries) { 
        variable3 = salaries; 
    } 
}


Ques. Define Copy constructor in Java.
Ans. Copy Constructor is the constructor used when we want to initialize the value to the new object from the old object of the same class.
*/
class SimpleNumber { 
    private int number;
    public SimpleNumber(int number) { 
        this.number = number; 
    }
    public SimpleNumber(SimpleNumber original) { 
        this.number = original.number; 
    }
    public int getNumber() { 
        return number; 
    }
    public static void main(String[] args) { 
        SimpleNumber num1 = new SimpleNumber(10);
        SimpleNumber num2 = new SimpleNumber(num1);
        System.out.println("Number 1: " + num1.getNumber()); 
        System.out.println("Number 2: " + num2.getNumber()); 
    } 
}


Ques. When can you use super keyword?
Ans. The super keyword is used to access hidden fields and overridden methods or attributes of the parent class.
    Following are the cases when this keyword can be used:
    ▪ Accessing data members of parent class when the member names of the class and its child subclasses are same.
    ▪ To call the default and parameterized constructor of the parent class inside the child class.
    ▪ Accessing the parent class methods when the child classes have overridden them.


Ques. Can the static methods be overloaded?
Ans. Yes! There can be two or more static methods in a class with the same name but differing input parameters.


Ques. Can the static methods be overridden?
Ans. No! Declaration of static methods having the same signature can be done in the subclass but run time polymorphism cannot take place in such cases.
    Overriding or dynamic polymorphism occurs during the runtime, but the static methods are loaded and looked up at the compile time statically. Hence, these methods can’t be overridden.


Ques. What is a ClassLoader?
Ans. Java ClassLoader is the program that belongs to JRE (Java Runtime Environment). The task of ClassLoader is to load the required classes and interfaces to the JVM when required.
    To get input from the console, we require the scanner class. And the Scanner class is loaded by the ClassLoader.


Ques. What part of memory - Stack or Heap - is cleaned in garbage collection process?
Ans. Heap


Ques. Differentiate between interfaces & abstract classes.
Ans. Availability of methods – Only abstract methods are available in interfaces, whereas non-abstract methods can be present along with the abstract methods in abstract classes.
    Variable types – Static and final variables can only be declared in the case of interfaces, whereas abstract classes can also have non-static and non-final variables.
    Inheritance – Multiple inheritances are facilitated by interfaces, whereas abstract classes don’t promote multiple inheritances.


Ques. What is the difference between ‘throw’ and ‘throws’ keyword in java?
Ans. The ‘throw’ keyword is used manually throw the exception to the calling method.
    And the ‘throws’ keyword is used in the function definition to inform the calling method that this method throws the exception. So, if you are calling, then you have to handle exception.


Ques. What is Multithreading?
Ans. Suppose, a computer program as a chef in a kitchen preparing a meal. When the chef is cooking a dish, they might be cutting vegetables, boiling water, and seasoning meat all at the same time to make the cooking process faster and more efficient.
    Similarly, multithreading in a computer program is like having multiple chefs (threads) working together in the kitchen (the program) at the same time. Each chef (thread) can perform a different task independently, such as chopping vegetables or boiling water, and they all work together to complete the meal (the program) more quickly.
        In simpler terms, multithreading allows a computer to do multiple things at once by splitting tasks into smaller parts and running them simultaneously, just like having multiple chefs working on different parts of a meal in a kitchen.*/

        class DownloadFile implements Runnable { 
            public void run() { 
                System.out.println("Downloading file..."); 
                try { 
                    Thread.sleep(5000); 
                } catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
                System.out.println("File downloaded successfully!"); 
            } 
        } 
        
        class ProcessData implements Runnable { 
            public void run() { 
                System.out.println("Processing data..."); 
            } 
        } 
        
        class Main{ 
            public static void main(String[] args) { 
                Thread d = new Thread(new DownloadFile()); 
                Thread p = new Thread(new ProcessData()); 
                d.start(); 
                p.start(); 
            } 
        }
       
In this example, DownloadFile and ProcessData are two tasks defined as separate classes implementing the Runnable interface. Then, in the MultithreadingExample class, two threads are created using these tasks and started with the start() method. This will execute the run() methods of DownloadFile and ProcessData concurrently.
Remember, multithreading should be used carefully to prevent issues like race conditions or data inconsistency. Synchronization mechanisms like locks or semaphores can be used to control access to shared resources when multiple threads are involved.

Multithreading in Java involves the execution of multiple threads concurrently within a program. There are two main types of multithreading:

Process-level Multithreading -> In process-level multithreading, each process has its own address space but can have multiple threads. Each thread within a process is  scheduled and managed independently by the operating system. Operating systems that support process-level multithreading include Windows and Solaris. However, in Java, the focus is primarily on the second type: thread-level multithreading.

Thread-level Multithreading -> Thread-level multithreading is the type most commonly used in Java, where multiple threads exist within the same process. Java threads share the same address space, allowing them to communicate and share data more easily compared to process-level multithreading. Thread-level multithreading is achieved using the Thread class or the Runnable interface in Java.



Ques. Can we overload main method in Java?
Ans. Yes, We can overload the main method in java but JVM only calls the original main method, it will never call our overloaded main method.


 class Solution {
    public static void main(boolean args) {
        if (args) {
            System.out.println("boolean method");
            System.out.println(args);
        }
    }

    public static void main(String s) {
        System.out.println("String method");
        System.out.println(s);
    }

    public static void main(int args) {
        System.out.println("Int method");
        System.out.println(args);
    }

    public static void main(String[] args) {
        System.out.println("Main main method");
        Solution.main("Suryansh");
    }
}


Ques. Can we override main method in Java?
Ans. No, we cannot override main method of java because a static method cannot be overridden.
        The static method in java is associated with class whereas the non-static method is associated with an object. Static belongs to the class area, static methods don’t need an object to be called. Static methods can be called directly by using the classname ( classname.static_method_name() ).
            So, whenever we try to execute the derived class static method, it will automatically execute the base class static method.
                Therefore, it is not possible to override the main method in java.


Ques. How many types of memory are used in JVM?
Ans. The memory in the JVM is divided into mainly 5 different parts: 

    1. Class (Method) Area -> The class method area is the memory block that stores the class code, variable code(static variable, runtime constant), method code, and the constructor of a Java program. (Here method means the function which is written inside the class). It stores class-level data of every class such as the runtime constant pool, field and method data, the code for methods.

    2. Heap -> The Heap area is the memory block where objects are created or objects are stored. Heap memory allocates memory for class interfaces and arrays (an array is an object). It is used to allocate memory to objects at run time.

    3. Stack -> Each thread has a private JVM stack, created at the same time as the thread. It is used to store data and partial results which will be needed while returning value for method and performing dynamic linking.
        Java Stack stores frames and a new frame is created each time at every invocation of the method. A frame is destroyed when its method invocation completes.

    4.Program Counter Register ->  Each JVM thread that carries out the task of a specific method has a program counter register associated with it. The non-native method has a PC that stores the address of the available JVM instruction whereas, in a native method, the value of the program counter is undefined. PC register is capable of storing the return address or a native pointer on some specific platform.

    5. Native method Stacks -> Also called C stacks, native method stacks are not written in Java language. This memory is allocated for each thread when it’s created And it can be of a fixed or dynamic nature.

    6. PermGen (Permanent Generation) - Deprecated in Java 8 -> It used to store metadata related to classes, methods, and other runtime information. In Java 8 and later versions, PermGen has been replaced by Metaspace.


Ques. What is Wrapper class?
Ans. Wrapper classes in Java provide a way to use primitive data types as objects. Since Java is an object-oriented programming language, many of its features, such as collections and generics, work only with objects. However, primitive data types like int, char, boolean, etc., are not objects. Wrapper classes are used to wrap these primitive types and provide a way to treat them as objects. Each primitive data type in Java has a corresponding wrapper class. Here are the commonly used wrapper classes.


// Example using Integer wrapper class
int primitiveInt = 42;

// Converting primitive int to Integer object
Integer wrappedInt = Integer.valueOf(primitiveInt);

// Converting Integer object back to primitive int
int unwrappedInt = wrappedInt.intValue();


Ques. What is Synchronus and Asynchronus Multithreading?
Ans. Synchronous and asynchronous multithreading refer to two different models of execution in the context of concurrent programming and multithreading.

    Synchronous Multithreading -> In synchronous multithreading, threads execute in a coordinated and synchronized manner. This means that one thread must wait for the completion of another before it can proceed.
        Synchronization is achieved through mechanisms like locks, semaphores, or other synchronization primitives.
        Synchronous multithreading helps maintain order and consistency in the execution of tasks but may lead to potential performance bottlenecks if threads frequently have to wait for each other.


            In the context of Java programming, the use of the Thread class and the Runnable interface can be considered synchronous multithreading. The start() method is used to initiate the execution of a thread, and the calling thread may wait for the completion of the started thread using the join() method.


class Synchronous {
    public static void main(String[] args) throws InterruptedException {
        // Task 1: Create and start the first thread
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("Task 1 started");
                    // Simulate some time-consuming task
                    Thread.sleep(3000);
                    System.out.println("Task 1 completed");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Task 2: Create and start the second thread
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("Task 2 started");
                    // Simulate another time-consuming task
                    Thread.sleep(2000);
                    System.out.println("Task 2 completed");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Synchronous execution - thread2 starts only after thread1 completes
        thread1.start();
        thread1.join(); // Wait for thread1 to complete before proceeding
        thread2.start();

        // Continue with other work (main thread)
        System.out.println("Continuing with other work...");
        //output if as join will used
        // Task 1 started
        // Task 1 completed
        // Continuing with other work...
        // Task 2 started
        // Task 2 completed

        //else
        // Task 1 started
        //Continuing with other work...
        // Task 2 started
        // Task 2 completed
        // Task 1 completed
    }
}



    Asynchronous Multithreading -> In asynchronous multithreading, threads operate independently without waiting for each other to complete. Threads may run concurrently and asynchronously, allowing them to perform tasks simultaneously.
        Asynchronous execution is often associated with non-blocking operations. For example, one thread may initiate a task and continue its execution without waiting for the task to finish. The results can be collected later.
            Asynchronous multithreading can lead to improved performance and responsiveness, especially in scenarios where tasks can be performed concurrently without dependencies.

    On the other hand, asynchronous multithreading can be achieved using features like Javas ExecutorService or the CompletableFuture class, where tasks can be submitted for execution, and the calling thread can continue without blocking.

    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;


class AsynchronousMultithreadingExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Task 1: Asynchronously submit a task to the executor service
        Future<?> future1 = executorService.submit(() -> {
            try {
                System.out.println("Task 1 started");
                // Simulate some time-consuming task
                Thread.sleep(3000);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Task 2: Asynchronously submit another task to the executor service
        Future<?> future2 = executorService.submit(() -> {
            try {
                System.out.println("Task 2 started");
                // Simulate another time-consuming task
                Thread.sleep(2000);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Continue with other work without waiting for task completion
        System.out.println("Continuing with other work...");

        // Optionally, you can check if the tasks are done and retrieve their results
        try {
            // This will block until both tasks are completed
            future1.get();
            future2.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}



Ques. Difference between ArrayList and HashSet?
Ans. 1. ArrayList implements the List interface and internally uses a dynamic array to store elements. 
        It allows duplicate elements and maintains the insertion order of elements 
        While HashSet implements the Set interface and internally uses a hash table to store elements. 
        It does not allow duplicate elements, and the elements are stored in an unordered manner based on their hash codes.

     2. ArrayList allows duplicate elements. You can add the same element multiple times to an ArrayList.
        While hashSet Does not allow duplicate elements. If you try to add an element that already exists in the HashSet, 
        it will not be added, and the add method will return false.

     3. ArrayList maintains the order of elements as they are inserted. The order of elements in an ArrayList is the same as the order in which they were added.
        While hashSet Does not maintain any specific order of elements. The elements in a HashSet are stored based on their hash codes, 
        so they may appear in a different order than they were inserted.

     4. ArrayList Provides constant-time positional access to elements (get(int index)), 
        but adding or removing elements at the beginning or middle of the list may require 
        shifting subsequent elements, resulting in a time complexity of O(n).
        While HashSet Provides constant-time performance for the basic operations like add,
        remove, contains, assuming a good hash function. However, the performance may degrade if there are many collisions in the hash table.

     5. In ArrayList You can iterate through the elements of an ArrayList using an enhanced for loop (for-each loop) or by using the iterator
        returned by the iterator() method.
        While HashSet Similarly, you can iterate through the elements of a HashSet using an enhanced for loop or by using the iterator returned
        by the iterator() method. However, the order of elements during iteration is not guaranteed.


Ques. Real life example of method overloading and overriding?
Ans.  All members of a family share a common last name and thats how outsiders recognize them, but to recognize individual family members , we need an overloaded name and hence we use First Name along with Last Name to uniquely identify.
Some members of a family have a Nick Name as the real name is very long or hard to call. So the Nick name overrides the Original Name in certain circumstances.