////////////////////////////////////////////////////////////////////////
// As per design principle 1 : Identify the aspect of your application
// that vary and separate them from what stays the same.
//
// This is varying part of Duck class, so we encapsulate this ( we made
// a class) and create the interface, so that it can be extended
// without affecting the non-varying code.
// It is also used to realize principle 2: Program to an interface not
// implementation.
//
// This interface class is realized in C++ and hence it contains pure
// virtual functions ie no code
//
////////////////////////////////////////////////////////////////////////

#ifndef _fly_behavior_h_
#define _fly_behavior_h_

class FlyBehavior
{
  public: 
	  virtual void fly() = 0;
};

#endif