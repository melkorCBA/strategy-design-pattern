# **Design Patterns**

## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.\*  
**Please refer the SimDuck app section for details description of the scenario.\*

## Problem Propagation

## **Step 1**

### Current Design

- Super Class
  - Duck
- Sub Classes
  - MallardDuck
  - RedHeadDuck
  - RubberDuck

### Current Pond

- Mallard Duck
- RedHead Duck
- Rubber Duck

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

```
As you can see it is not ideal fro rubber duck to fly. When adding the flying behavior to the ducks supper class the programmer failed to identify that it is was not appropriate for some duck subclasses.
```

\*_A localized update to the code caused a non-local side effect (flying rubber ducks)_

### **Solution**

```
Override the fly() method in the RubberDuck class to do nothing
```
