////////////////////////////////////////////////////////////////////////
// As per design principle 1 : Identify the aspect of your application
// that vary and separate them from what stays the same.
//
// Duck is non-varying part, as we have taken out varying Behavior
// part and hence this class can be extended.
//
// We also use principle 2: Program to an interface not
// implementation. So we use objects of behavior interface here
//
// This is non-varying Abstract class and hence it is realized in C++
// by adding at least 1 pure virtual function, so that it can't be 
// instantiated but generalized
//
// Also for behavior we are using 'Has-A' ie composition by making 
// behavior objects (pointers) as data member. Hence using 
// principle 3: Favor composition over inheritance.
//
//
// In the end, this code show application of "Strategy Pattern"
////////////////////////////////////////////////////////////////////////

#ifndef _duck_h_
#define _duck_h_

#include "FlyBehavior.h"
#include "QuackBehavior.h"

class Duck
{

 public:

	 FlyBehavior *flyBehavior;					// Composition , HAS-A relationship
	 QuackBehavior *quackBehavior;

	 Duck() {}

	 void performFly();

	 void performQuack();

	 void setFlyBehavior(FlyBehavior *fb) {
		 flyBehavior = fb;
	 }

	 void setQuackBehavior(QuackBehavior *qb){
		 quackBehavior = qb;
	 }

	 virtual void display() = 0;

};

#endif