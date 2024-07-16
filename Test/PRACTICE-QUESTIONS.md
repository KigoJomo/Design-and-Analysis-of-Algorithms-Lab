### Question (a)

**Define the following terms as used in design and analysis of algorithms:**

#### i. Optimal Substructure
**Optimal substructure** is a property of an algorithmic problem that suggests that the optimal solution to the problem can be constructed from the optimal solutions to its subproblems. This property is a key aspect of dynamic programming and greedy algorithms.

**Example:** In the shortest path problem, the shortest path from node A to node C through node B is the sum of the shortest path from A to B and the shortest path from B to C.

#### ii. Greedy Choice Property
**Greedy choice property** states that a global optimum can be arrived at by selecting a local optimum. This means making the best choice at each step will lead to an optimal solution for the problem.

**Example:** In the coin change problem, where we need to make change using the fewest coins, always choosing the largest denomination coin available first exhibits the greedy choice property.

#### iii. Base Case
**Base case** is a condition in a recursive algorithm that does not call itself, thereby preventing infinite recursion. It defines the simplest instance of the problem that can be solved directly.

**Example:** In a recursive function to calculate factorial, `factorial(0)` or `factorial(1)` is the base case since `factorial(0) = 1` and `factorial(1) = 1`.

### Question (b)

**Construct a Huffman tree and find the Huffman codes for the alphabet below. (6 marks)**

Symbol | A | B | C | D | E | F
---|---|---|---|---|---|---
Frequency | 15 | 20 | 12 | 28 | 19 | 6

To construct a Huffman tree:
1. List all symbols and their frequencies.
2. Combine the two symbols with the smallest frequencies to create a new node with a combined frequency.
3. Repeat the process until only one node remains.

Let's construct the tree step by step:

1. Combine F (6) and C (12) to get a node with frequency 18.
2. Combine A (15) and E (19) to get a node with frequency 34.
3. Combine B (20) and the node from step 1 (18) to get a node with frequency 38.
4. Combine D (28) and the node from step 2 (34) to get a node with frequency 62.
5. Combine the nodes from step 3 (38) and step 4 (62) to get the root node with frequency 100.

Now assign codes (left edge as 0 and right edge as 1):
- A: 110
- B: 00
- C: 011
- D: 10
- E: 111
- F: 010

#### Encoding
Encode the string AFBDEECA using the codes:
- A = 110
- F = 010
- B = 00
- D = 10
- E = 111
- C = 011

Encoded string: `110 010 00 10 111 111 011 110 011`

### Question (c)

**Solve the following instance of the knapsack fractional problem algorithm. Knapsack capacity Weight = 10 kg. (6 marks)**

Item | Weight | Value
---|---|---
1 | 4 kg | $60
2 | 5 kg | $50
3 | 3 kg | $18
4 | 7 kg | $21

To solve the fractional knapsack problem:
1. Calculate the value per unit weight for each item.
2. Sort items based on this value in descending order.
3. Add items to the knapsack starting with the highest value per unit weight until the knapsack is full.

Value per unit weight:
- Item 1: $60 / 4 kg = $15/kg
- Item 2: $50 / 5 kg = $10/kg
- Item 3: $18 / 3 kg = $6/kg
- Item 4: $21 / 7 kg = $3/kg

Sorted order: Item 1, Item 2, Item 3, Item 4.

Knapsack capacity = 10 kg.
- Take all of Item 1 (4 kg, $60).
- Take all of Item 2 (5 kg, $50).
- Remaining capacity = 1 kg.
- Take 1/3 of Item 3 (1 kg, $6).

Total value = $60 + $50 + $6 = $116.

### Question (d)

**Find the longest common subsequence of string Y and X below and give its time complexity. (6 marks)**

Y: CCABDMFGNH

X: ABCVDEFGH

To find the longest common subsequence (LCS):
1. Use dynamic programming to build a table where entry (i, j) represents the length of LCS of Y[0...i-1] and X[0...j-1].
2. Trace back through the table to find the LCS.

Let's build the table:

```
  A B C V D E F G H
C 0 0 1 1 1 1 1 1 1
C 0 0 1 1 1 1 1 1 1
A 1 1 1 1 1 1 1 1 1
B 1 1 1 1 1 1 1 1 1
D 1 1 1 1 2 2 2 2 2
M 1 1 1 1 2 2 2 2 2
F 1 1 1 1 2 2 3 3 3
G 1 1 1 1 2 2 3 4 4
N 1 1 1 1 2 2 3 4 4
H 1 1 1 1 2 2 3 4 5
```

The LCS is: "ABDFGH".

Time complexity: O(m*n), where m and n are the lengths of the two strings.

### Question (e)

**Find the fastest way through the assembly line below clearly showing the steps of solving dynamic programming problems. (6 marks)**

The steps to solve a dynamic programming problem generally include:
1. Characterize the structure of an optimal solution.
2. Recursively define the value of an optimal solution.
3. Compute the value of an optimal solution in a bottom-up fashion.
4. Construct an optimal solution from computed information.

Since the specific assembly line details are not provided in the question image, I'll explain the general process for solving an assembly line scheduling problem using dynamic programming.

### Question (f)

**Search the graph below by applying the breadth-first search (BFS).**

To perform BFS:
1. Start from a given node, mark it as visited and enqueue it.
2. Dequeue a node, visit its adjacent unvisited nodes, mark them as visited, and enqueue them.
3. Repeat until all nodes are visited.

Due to the lack of a clear graph diagram, I can't provide a detailed BFS traversal here. However, I can explain the process in general.

BFS example:
- Start at node 1.
- Visit and enqueue all its unvisited neighbors.
- Dequeue the next node and repeat the process.