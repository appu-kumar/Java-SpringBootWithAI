# JVM work flow 
- https://www.youtube.com/watch?v=kK5ep_dd798

# ✅ Real-Life Example of Abstraction in Java
🔹 What is Abstraction?
👉 Abstraction means hiding implementation details and showing only essential features.
In simple words:
User ko “what to do” dikhate hain,
but “how it works internally” hide kar dete hain.

- In Java, abstraction is achieved using:
 - Abstract classes
 - Interfaces

# ✅ Loosely coupled
✅ Real-Time Example of Loose Coupling in Java
🎯 Scenario: Payment System (Real Production Example)

Imagine you’re building an e-commerce backend.
Today you support:
Razorpay
Tomorrow maybe: Stripe
Later maybe PayPal
- If your code directly depends on Razorpay class → ❌ Tight Coupling
- If your code depends on an interface → ✅ Loose Coupling

# ✅ Dependent object vs Target object
- The class that needs something → Dependent class
The object being provided → Dependency
The class that receives injection → Target class
- NOTE:- In most cases, Target Object and Dependent Object mean the same thing.


