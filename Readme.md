# **Design Patterns**

## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.\*  
**Please refer the SimDuck app section for details description of the scenario.\*

## Problem Propagation

```
Override the fly() method in the RubberDuck class to do nothing
```

### **Solution for Step 3**


## **Design Principle 1**

<p style="background-color: #e8ffed; padding:10px;">
Identify the aspects of your application that vary and separate them from what stays the same.
<p>

<p>
Take what varies and "encapsulate" it so it won't affect the rest of the code. later you can alter or extend the parts that vary without affecting those that don't.
<p>

<p>According to the 1st design principle we can identify the parts that vary like this</p>

**Encapsulate what varies**
![MallardDuckstep1](/src/assets/step4/step4whatVarious.png#thumbnail)


## **Design Principle 2**

<p style="background-color: #e8ffed; padding:10px;">
program to an interface, not an implementation.

<p style="background-color: #f0f5f1; padding:10px;">
from now on duck behaviors will live in a separate class, which implements a particular behavior interface. Now duck class won't need to know any implementation details of it's own behaviors.
</p>
<p>This time, Duck class is not the one who will implement these interfaces/behaviors </p>

<span style="color:blue">Note: </span>When we say program to an interface, it's actually program to a supertype. (abstract class or interface). The point is to find polymorphism by programing to a super type, so that actual runtime object isn't lock into the code.
In simple word to dynamically decide the behavior at runtime.

## **Step 3**

### Current Design

- Super Class
  - Duck
- Sub Classes
  - MallardDuck
  - RedHeadDuck
  - RubberDuck
  - DecoyDuck
- Interfaces
  - FlyBehavior
  - QuackBehavior
- Behavior Classes
  - FlyBehavior
    - FlyWithWings
    - FlyNoWay
  - QuackBehavior
    - Quack
    - Squeak
    - MuteQuack

### Current Pond

- Mallard Duck
- RedHead Duck
- Rubber Duck
- Decoy Duck

**Project Structure**
![MallardDuckstep1](/src/assets/step4/step4projectStructure.png#thumbnail)

**Duck class**

![MallardDuckstep1](/src/assets/step4/step4classDuck.png#thumbnail)

<span style="color:blue">Note: </span>Here we are using Composition instead of inheritance.

## **Design Principle 3**

<p style="background-color: #e8ffed; padding:10px;">
Favor composition over inheritance

<p style="background-color: #f0f5f1; padding:10px;">
This allows lot more flexibility to the code.
<ul>
  <li>It allows to encapsulate the behaviors as a family of algorithms<br> into their own set of class</li>
  <li>Also allows to change the behavior at runtime</li>
</ul>

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

![MallardDuckstep1](/src/assets/step4/step4interfaceFlyNoWay.png#thumbnail)

**FlyNoWay class**

![MallardDuckstep1](/src/assets/step4/step4classFlyWithWings.png#thumbnail)

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

**Step 3 Output**

![MallardDuckstep1](/src/assets/step4/step4output.png#thumbnail)

These things points to a Design pattern "Strategy Pattern".

# **Design Pattern 1 - Strategy Pattern**
<p style="background-color: #dcf7f7; padding:10px;">
  The Strategy Pattern defines a family of algorithms, encapsulate each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
<p>

