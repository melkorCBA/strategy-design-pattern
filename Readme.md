# **Design Patterns**
## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.*  
**Please refer the SimDuck app section for details description of the scenario.*


## Problem Propagation 

## **Step 1**  
### Current Design
* Super Class
    * Duck  
* Sub Classes
    * MallardDuck
    * RedHeadDuck
    * RubberDuck

### Current Pond
* Mallard Duck
* RedHead Duck
* Rubber Duck

**Duck class**

![MallardDuckstep1](/src/assets/step1/Step1classDuck.png#thumbnail)


**MallardDuck class**

![MallardDuckstep1](/src/assets/step1/step1classMallard.png#thumbnail)


**RedHeadDuck class** 

![MallardDuckstep1](/src/assets/step1/step1classRedhead.png#thumbnail)

**RubberDuck class**

![MallardDuckstep1](/src/assets/step1/step1classRubber.png#thumbnail)

**App class**

![MallardDuckstep1](/src/assets/step1/step1classApp.png#thumbnail)

**Step 1 Output**

![MallardDuckstep1](/src/assets/step1/step1output.png#thumbnail)  
~~~
As you can see it is not ideal fro rubber duck to fly. When adding the flying behavior to the ducks supper class the programmer failed to identify that it is was not appropriate for some duck subclasses.
~~~

**A localized update to the code caused a non-local side effect (flying rubber ducks)*


### **Solution**
~~~
Override the fly() method in the RubberDuck class to do nothing
~~~

## **Step 2**  
### Current Design
* Similar to the previous design 

### Current Pond
* Mallard Duck
* RedHead Duck
* Rubber Duck

**RubberDuck class**

![MallardDuckstep1](/src/assets/step2/step2classRubber.png#thumbnail) 


**Step 2 Output**

![MallardDuckstep1](/src/assets/step2/step2output.png#thumbnail) 
~~~
What happens when a wooden decoy duck added to the programme?.
~~~

### **Solution**
~~~
Override the fly(), swim(), quack(),  method in the DecoyDuck class to do nothing. But what happens when new types of duck (like rubber duck, decoy duck) adds to the system quit frequently. Then we'd have an overwhelming task in our hands to override every method fro each new class. So the Inheritance (concept of OOP) is not really the way to go. We now need a cleaner way to have only some(but not all) of the duck types fly or quack.
~~~
~~~
A better solution here would be to use interfaces.
~~~




## **Step 3**  
### Current Design
* Super Class
    * Duck  
* Sub Classes
    * MallardDuck
    * RedHeadDuck
    * RubberDuck
    * DecoyDuck
* Interfaces
    * Flyable
    * Quackable


### Current Pond
* Mallard Duck
* RedHead Duck
* Rubber Duck
* Decoy Duck

**Duck class**

![MallardDuckstep1](/src/assets/step3/step2classDuck.png#thumbnail)

**MallardDuck class**

![MallardDuckstep1](/src/assets/step3/step3classMallard.png#thumbnail)

**RedHeadDuck class** 

![MallardDuckstep1](/src/assets/step3/step3classRedhead.png#thumbnail)

**RubberDuck class**

![MallardDuckstep1](/src/assets/step3/step3classRubber.png#thumbnail)


**DecoyDuck class**

![MallardDuckstep1](/src/assets/step3/step3classDecoy.png#thumbnail)

**Flyable interface**

![MallardDuckstep1](/src/assets/step3/step3interfaceFlyable.png#thumbnail)

**Quackable interface**

![MallardDuckstep1](/src/assets/step3/step3interfaceQuackable.png#thumbnail)

**App class**

![MallardDuckstep1](/src/assets/step3/step3classApp.png#thumbnail)

**Step 3 Output**

![MallardDuckstep1](/src/assets/step3/step2output.png#thumbnail) 

~~~
An additional  add method is used here because if the encapsulation. Now what let's say we need to make a little change in flying behavior. We have to go through all the flying duck subclass. This completely destroys the code reusing concept (Lot of duplication).
~~~

## **Design Principle 1**
~~~
**Identify the aspects of your application that vary and separate them from what stays the same**.
~~~

~~~
Take what varies and "encapsulate" it so it won't affect the rest of the code. later you can alter or extend the parts that vary without affecting those that don't.
~~~