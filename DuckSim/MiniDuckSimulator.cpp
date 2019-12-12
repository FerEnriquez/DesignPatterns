
#include "Duck.h"
#include "MallardDuck.h"
#include "ModelDuck.h"
#include "FlyRocketPowered.h"
#include <new>
#include <iostream>

using namespace std;

void main()
{
	Duck *mallard = new MallardDuck();
	
	mallard->performQuack();
	mallard->performFly();

	Duck *model = new ModelDuck();

	model->performFly();
	model->setFlyBehavior(new FlyRocketPowered());
	model->performFly();

	int ch = cin.get();
}
