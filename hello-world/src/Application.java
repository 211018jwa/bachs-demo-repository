
public class Application {

	/*
	 * Introduction to Java
	 */
	
	// Java is a high-level, compiled, strongly-typed, object oriented programming language
	// 	High-level: Code that is easily human readable
	//	Compiled: Human-readable code (source code) is compiled, or transformed, into low-level code that is
	// 				more optimized for computers to run
	//
	// 				In the case of Java, source code is compiled into bytecode
	//				The Java Virtual Machine (JVM) executes the bytecode
	//
	//	Strongly-typed: variables declared of a certain type can only have values assigned to it of that 
	// 					same type. The type can not change of that variable (static typed)
	//	Object-oriented: Java revolves around the usage of objects. Classes act as blueprints for objects.
	//					 Objects are constructed from their blueprints (classes)
	
	/*
	 * Why Java?
	 */
	
	// Java is one of the most in-demand languages in the world
	// Java has been around for a really long time now (20+ years)
	// Powers over 3 billion devices
	// #1 server-side web technology (backend)
	
	/*
	 * Benefits
	 */
	
	// 1. Platform independent (write once, run anywhere - WORA)
	// 		- Made possible via the JVM
	//		- We have many different JVMs for different operating systems
	// 			- Mac
	//			- Windows
	//			- Linux
	//			- Android
	//			- etc...
	//		- The main point is that all of the JVMs understand the same underlying bytecode
	//		- Compiled bytecode is universally understandable by all JVMs for any operating system
	// 2. C-language inspired syntax
	//		- If you have ever programmed in C or C++ before, you will notice that they have similar syntax
	//			to Java
	//		- Many programmers come from a C or C++ background, so picking up Java would be easy from a
	//			syntactical standpoint
	// 3. Automatic memory management
	//		- Garbage Collector
	//			- Frees up memory not being used
	//			- In particular, it destroys objects that no longer have a reference
	//		- The developer does not have to worry about managing memory themselves
	// 4. Extensive built-in runtime library
	//		- Libraries are included in the Java Runtime Environment (JRE)
	// 5. Rich open-source community
	// 		- As a programmer, you want to be building on top of the "shoulders of giants"
	//		- We don't want to have to reinvent the wheel
	//		- Since Java has been around for awhile, there are a lot of libraries (classes, methods, etc.)
	//			that we can make use of
	
	/*
	 * JDK v. JRE v. JVM?
	 */
	
	// JDK (Java Development Kit): Contains a compiler and debugger + JRE
	//		- For example, we would not have the javac command without a JDK installed
	//		- But if we had a JRE installed, we would have access to the java command
	//		- When we install a JDK, we have both the java command and javac command
	//		- javac: compiler
	//		- java: how to run the program (JRE)
	
	// JRE (Java Runtime Environment): Contains the runtime libraries that our code may be using + JVM.
	//		- We would install a JRE instead of a JDK if all we need to do is run programs that have already
	// 			been compiled
	//		- For example, if you are a customer, you will not be developing the software and having to compile
	//			the software yourself
	
	// JVM (Java Virtual Machine): Enables a computer to actually execute a Java program. The JVM is what
	//		actually runs the bytecode (compiled) and then translate it so that the machine can understand
	//		the bytecode
	
	// Summary: If we want to both write and run Java programs, we should install a JDK (because it has
	//			a compiler). If we only want to run Java programs, we should install a JRE.
	
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
	
	public static void myOwnMethod() {
		System.out.println("myOwnMethod() executed");
	}
	
}
