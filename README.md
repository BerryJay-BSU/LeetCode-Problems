# LeetCode Practice Problems

## Entries:
----

### Sept. 15th 2026
### Problem #1: 1768. Merge Strings Alternately
#### Reflection:
The problem offered a challenge working with Strings in a new way. My immediate thought was to look at the words as an array of characters. After initially creating the arrays I quickly realized that `charAt()` let me access individual characters without converting strings to arrays. This was the key to solving the first problem, from here the next challenge was the remainder. By comparing the length of each word I did some Javadoc diving into the methods available to Strings. Once I came across a method to copy and add the remainder to the final result I started testing the actual output. This is where I discovered that I was not trackng the offset correctly. Once I made the correction to the logic of the index the rest of the test cases passed.

#### Usage:
Compile:
```bash
javac TestSolution.java Solution.java
```
Run:
```bash
java TestSolution
```
#### Sources:
AI Used: ChatGPT
Prompt: I am attempting a LeetCode problem and I have been working on it for a little over ~30 mins. I made the directions into a README.md and I have my first attempt. Can you provide code to test? I don't want the solution, I still want to work through it but how am I doing so far?

Response: Code for TestSolution.java. 
Action: By using failed tests and debugging I discovered that I had initially used the incorrect index to copy the remaining characters. I implemented the correct function and passed the remaining test cases.

#### Notes:
* By using `result+=` to merge strings the function becomes O(n^2) because each call creates a new copy every time the string is updated (due to strings being immutable).
* Using a Stringbuilder will yield O(n + m) where (n,m) = (word1, word2).

```java
    StringBuilder result = new StringBuilder();
    int sharedLength = Math.min(word1.length(), word2.length());

    for (int i = 0; i < sharedLength; i++) {
        result.append(word1.charAt(i));
        result.append(word2.charAt(i));
    }
```

### Problem #2: 1071. Greatest Common Divisor of Strings
#### Reflection:

#### Usage:

#### Sources:
AI Used:
Prompt:
Response: 
Action: 

#### Notes:


###### Entry Template

### Problem # : 
#### Reflection:

#### Usage:

#### Sources:
AI Used:
Prompt:
Response: 
Action: 

#### Notes:
