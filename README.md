[![Build Status](https://travis-ci.org/mauricioklein/cakeproblem.svg?branch=master)](https://travis-ci.org/mauricioklein/cakeproblem)

# Cake Problem

Problem proposed by Amazon recruting team to the software engineer role.

Problem Description
-------------------

You received a cake as a gift, which every layer has a different flavor. Each flavor has a value, which represents how much you like it. The higher value, the more you like it. You can eat the cake from the top to the bottom, from the bottom to the top, both or you can decide to do not eat anything. You don’t need to eat all layers. Create an application that receives as input an array of Integers where each position represents one cake layer from the top to the bottom. As output you will need to return the sum of layers values that you will eat in order to maximize your pleasure of eating the cake.

## Example 1:

**Input:** [10, -2, 5, -4, 3, -5, 1]

**Output:** 14 

In the first example you would **eat the layers 0, 1, 2 and 6**, so the result would be 10 + (-2) + 5 + 1 = **14**.

## Example 2: 
**Input:** [-1, -5, -7, 9, 10, 8]

**Output:** 27

In the second example you would **eat the layers 5, 4 and 3**, so the result would be 8 + 10 + 9 = **27**.

## Example 3:
**Input:** [-1, -2, 1, -7]

**Output:** 0

In the third example you will **not eat anything** since in any case you will not like the cake.

## Code skeletons:

Use one of the following skeletons for your solutions.

Java:

```java
package questions;

public class QuestionB {
    public static Integer cake(final int[] input) {
        // YOUR CODE
    }
}
```

C++:

```c++
class QuestionB {
	int cake (int input[]) {
		// YOUR CODE
	}
};
```
