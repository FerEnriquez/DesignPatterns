#include "ModelDuck.h"
#include "FlyNoWay.h"
#include "Quack.h"

#include <iostream>
#include <new>

ModelDuck::ModelDuck()
{
	flyBehavior = new FlyNoWay();
	quackBehavior = new Quack();
}

void ModelDuck::display()
{
	std::cout << "I'm a Model Duck" << std::endl;
}