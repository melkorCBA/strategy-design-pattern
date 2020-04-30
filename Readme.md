# **Design Patterns**

## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.\*  
**Please refer the SimDuck app section for details description of the scenario.\*

## Problem Propagation

**Solution for Step 3**

```
An additional  add method is used here because if the encapsulation. Now what let's say we need to make a little change in flying behavior. We have to go through all the flying duck subclass. This completely destroys the code reusing concept (Lot of duplication).
```

## **Design Principle 1**

```
**Identify the aspects of your application that vary and separate them from what stays the same**.
```

```
Take what varies and "encapsulate" it so it won't affect the rest of the code. later you can alter or extend the parts that vary without affecting those that don't.
```

## **Step 4**

### Current Design

- Super Class
  - Duck
- Sub Classes
  - MallardDuck
  - RedHeadDuck
  - RubberDuck
  - DecoyDuck
- Behavior
  - Fly Behavior
    - FlyBehavior Interface
    - FlyWithWings Class
    - FlyNoWay Class
  - Quack Behavior
    - QuackBehavior Interface
    - Quack Class
    - Squeak Class
    - MuteQuack Class
    

### Current Pond

- Mallard Duck
- RedHead Duck
- Rubber Duck

**Project Structure**

![MallardDuckstep1](/src/assets/step4/step4projectStructure.png#thumbnail)

**Duck class**

![MallardDuckstep1](/src/assets/step4/step4classDuck.png#thumbnail)

**MallardDuck class**

![MallardDuckstep1](/src/assets/step4/step4classMallard.png#thumbnail)

**RedHeadDuck class**

![MallardDuckstep1](/src/assets/step4/step4classRedhead.png#thumbnail)

**RubberDuck class**

![MallardDuckstep1](/src/assets/step4/step4classRubber.png#thumbnail)

**DecoyDuck class**

![MallardDuckstep1](/src/assets/step4/step4classDecoy.png#thumbnail)

**FlyBehavior interface**

![MallardDuckstep1](/src/assets/step4/stepinterfaceFlyBehavior.png#thumbnail)


**FlyWithWings class**

![MallardDuckstep1](/src/assets/step4/step4classFlyWithWings.png#thumbnail)

**FlyNoWay class**

![MallardDuckstep1](/src/assets/step4/step4interfaceFlyNoWay.png#thumbnail)


**QuackBehavior interface**

![MallardDuckstep1](/src/assets/step4/stepinterfaceQuackBehavior.png#thumbnail)


**Quack class**

![MallardDuckstep1](/src/assets/step4/step4classQuack.png#thumbnail)

**Squeak class**

![MallardDuckstep1](/src/assets/step4/step4classSqueak.png#thumbnail)


**MuteQuack class**

![MallardDuckstep1](/src/assets/step4/step4classMuteQuack.png#thumbnail)



**App class**

![MallardDuckstep1](/src/assets/step4/step4classApp.png#thumbnail)

**Step 4 Output**

![MallardDuckstep1](/src/assets/step4/step4output.png#thumbnail)

```
As you can see it is not ideal fro rubber duck to fly. When adding the flying behavior to the ducks supper class the programmer failed to identify that it is was not appropriate for some duck subclasses.
```

\*_A localized update to the code caused a non-local side effect (flying rubber ducks)_

### **Solution**

```
Override the fly() method in the RubberDuck class to do nothing
```

```

```
