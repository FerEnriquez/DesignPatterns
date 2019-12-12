////////////////////////////////////////////////////////////////////////
// This duck is inherited from non-varying part of code Duck. 
//
// This class is using interface implementation of varying Behaviour
////////////////////////////////////////////////////////////////////////

#ifndef _mallard_duck_h_
#define _mallard_duck_h_

#include "Duck.h"

class MallardDuck : public Duck
{
  public:

	  MallardDuck();

	  void display();
};

#endif
