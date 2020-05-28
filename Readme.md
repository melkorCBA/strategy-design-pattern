# **Design Patterns**

## Duck problem

**This is the same scenario used in the "Head First Design Patterns" book.\*  
**Please refer the SimDuck app section for details description of the scenario.\*

## Problem Propagation

### **Solution fro Step 1**

```
Override the fly() method in the RubberDuck class to do nothing
```

## **Step 2**

### Current Design

- Similar to the previous design

### Current Pond

- Mallard Duck
- RedHead Duck
- Rubber Duck

**RubberDuck class**

![MallardDuckstep1](/src/assets/step2/step2classRubber.png#thumbnail)

**Step 2 Output**

![MallardDuckstep1](/src/assets/step2/step2output.png#thumbnail)

```
What happens when a wooden decoy duck added to the programme?.
```

### **Solution**

<p>
Override the fly(), swim(), quack(),  method in the DecoyDuck class to do nothing. <br>
But what happens when new types of duck (like rubber duck, decoy duck) adds to the system quit frequently. Then we'd have an overwhelming task in our hands to override every method fro each new class. So the Inheritance (concept of OOP) is not really the way to go. We now need a cleaner way to have only some(but not all) of the duck types fly or quack.
</p>

```
A better solution here would be to use interfaces.
```
