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
