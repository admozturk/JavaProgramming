package day38_Inheritance_Continue_day3;

public class ClassNotes {
    /*
    Java Day38
Topic:  IS A relation vs HAS A relation
		Method Overriding

Package name: day38_Inheritance

Warmup task:
	carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following subclasses of Car:
			1. Toyota:
					extra methods:
							reliable()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();




IS A relation vs HAS A relation:

	IS A:
		class Animal{

		}

		class Dog extends Animal{  // Dog IS A animal

		}


		class Employee{

		}

		class Tester extends Employee{ // Tester IS A Employee

		}


	HAS A:

		class Tester extends Employee{

		}

		class ScrumTeam{ // ScrumTeam HAS A Tester
		}

		class Tiger extends Animal{ // Tiger IS A animal

		}

		class Zoo{  // Zoo Has A Tiger
			Tiger
		}



		class Engine{


		}


		class Car{ // Car HAS A Engine

			Engine

		}


Method Overloading: multiple different methods having the same name.
					parameters MUST be different

					ANY method can be overloaded


Method Overriding:



Access Modifiers:

	public > protected > default > private



Object Class: presented in "java.lang" package.
			  parent of all the classes.
			  implicitly extended to all classes



Tomorrow:
	OOP Encapsulation
	OOP Inheritance


-----------------------------

Car:
	start(){car started}

Toyota extends Car:
	start():
		twist the key to Ignition

Audi extends Car:
	start():
		push start button

Tesla extends Car:
	start():
		say "Start"


BMW extends Car:
	start():
		Call mechanic
		Jump start



-----------------------------

Shape:
	variable:
		name

	Add A constructor to set the filed

	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

....

    * */
}