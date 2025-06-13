# Data Structures and Algorithms (DAS)

This repository contains implementations of various data structures and algorithms in both Python and Java.

## Contents

### Maximum Consecutive Ones Algorithm
- **Python Implementation**: `max_consecutive_ones.py`
- **Java Implementation**: `MaxConsecutiveOnes.java`

Both implementations solve the problem of finding the maximum number of consecutive 1s in a binary array.

#### Algorithm Description
Given a binary array `nums`, the algorithm finds the maximum number of consecutive 1s in the array.

**Example:**
- Input: `[1,1,0,1,1,1]`
- Output: `3`
- Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

#### Test Cases Included
1. Mixed array: `[1, 1, 0, 1, 1, 1]` → Expected: 3
2. All zeros: `[0, 0, 0, 0]` → Expected: 0
3. All ones: `[1, 1, 1, 1, 1]` → Expected: 5
4. Alternating: `[1, 0, 1, 0, 1]` → Expected: 1
5. Multiple streaks: `[1, 1, 0, 1, 1, 1, 0, 1]` → Expected: 3

### Other Files
- `ds.py`: Python data structures operations (list operations)
- `DS.java`: Java data structures implementation

## How to Run

### Python
```bash
python max_consecutive_ones.py
```

### Java
```bash
javac MaxConsecutiveOnes.java
java MaxConsecutiveOnes
```

## Time Complexity
- **Time Complexity**: O(n) where n is the length of the array
- **Space Complexity**: O(1) - constant extra space

## Author
NSAjay2279
