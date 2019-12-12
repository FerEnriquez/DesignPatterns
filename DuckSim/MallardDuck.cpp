
#include "MallardDuck.h"
#include "FlyWithWings.h"
#include "Quack.h"

#include <iostream>
#include <new>


MallardDuck::MallardDuck()
{
	quackBehavior = new Quack();
	flyBehavior = new FlyWithWings();
}

void MallardDuck::display()
{
	std::cout << "Mallard Duck" << std::endl;
}