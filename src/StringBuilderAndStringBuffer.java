import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringBuilderAndStringBuffer {

     public static void main(String[] args){


     }
}

/*
In Java:

String is immutable.
That means:
String s = "Hello";
s = s + " World";
👉 Every time you modify, a new object is created in memory.
If this happens inside a loop (1000 times) → ❌ performance issue.

🧠 Real-Life Example

Imagine:
String = writing with pen on paper (can't erase, must write new page)
StringBuilder = writing with pencil (can erase and modify)
StringBuffer = writing with pencil + security guard (safe but slower)

🔹 What is StringBuilder?
StringBuilder is a mutable class.
👉 It allows you to modify the same object.
👉 Not thread-safe (faster)

🔹 What is StringBuffer?
StringBuffer is also mutable
👉 But it is thread-safe (synchronized methods)
👉 Slightly slower than StringBuilder

| Feature     | StringBuilder      | StringBuffer      |
| ----------- | ------------------ | ----------------- |
| Mutable     | ✅ Yes              | ✅ Yes             |
| Thread Safe | ❌ No               | ✅ Yes             |
| Performance | 🚀 Faster          | 🐢 Slower         |
| Used in     | Single-thread apps | Multi-thread apps |


append(), length(), charAt(0), deleteCharAt(0), reverse(),
Note:: always used toString to convert stringbuilder into the string at the end company standard.

 */
