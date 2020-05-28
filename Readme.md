# **Design Patterns**

## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.\*  
**Please refer the SimDuck app section for details description of the scenario.\*

## Problem Propagation

```
Override the fly() method in the RubberDuck class to do nothing
```

### **Solution for Step 2**

<p style="background-color: #f0f5f1; padding:10px;">
Override the fly(), swim(), quack(),  method in the DecoyDuck class to do nothing.<br> But what happens when new types of duck (like rubber duck, decoy duck) adds to the system quit frequently.<br> Then we'd have an overwhelming task in our hands to override every method fro each new class. So the Inheritance (concept of OOP) is not really the way to go. We now need a cleaner way to have only some(but not all) of the duck types fly or quack.
</p>

```
A better solution here would be to use interfaces.
```

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
  - Flyable
  - Quackable

### Current Pond

- Mallard Duck
- RedHead Duck
- Rubber Duck
- Decoy Duck

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

<p style="background-color: #f0f5f1; padding:10px;">
An additional  add method is used here because if the encapsulation. Now what let's say we need to make a little change in flying behavior. We have to go through all the flying duck subclass. This completely destroys the code reusing concept (Lot of duplication).
<p>

## **Design Principle 1**

<p style="background-color: #e8ffed; padding:10px;">
Identify the aspects of your application that vary and separate them from what stays the same.
<p>

<p>
Take what varies and "encapsulate" it so it won't affect the rest of the code. later you can alter or extend the parts that vary without affecting those that don't.
<p>
