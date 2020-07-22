# Graph Cut-Based Parition

## Assighment

In Java, code a simulation of the classic children’s game [Chutes And Ladders](https://en.wikipedia.org/wiki/Snakes_and_Ladders).

## Instructions

1. Use this document as a business spec
2. Design and develop the business objects only (do not create a GUI)
3. To demonstrate that the software works, write a “main” method that simulates 2 to 4 four players and
generates output similar to the sample below

## Sample Output

The sample output displays the player’s name, the spaces from and to which the player moves, when the
player goes up a ladder or down a chute and a winner of the game.
```
1: Eric: 0 --> 7
2: Paul: 0 --> 1 --LADDER--> 38
3: Eric: 7 --> 13
4: Paul: 38 --> 45
5: Eric: 13 --> 15
6: Paul: 45 --> 50
7: Eric: 15 --> 17
8: Paul: 50 --> 57
9: Eric: 17 --> 22
10: Paul: 57 --> 64 --CHUTE--> 60
11: Eric: 22 --> 27
12: Paul: 60 --> 63
13: Eric: 27 --> 33
14: Paul: 63 --> 67
15: Eric: 33 --> 37
16: Paul: 67 --> 68
17: Eric: 37 --> 39
18: Paul: 68 --> 70
19: Eric: 39 --> 43
20: Paul: 70 --> 72
21: Eric: 43 --> 46
22: Paul: 72 --> 73
23: Eric: 46 --> 51 --LADDER--> 67
24: Paul: 73 --> 78
25: Eric: 67 --> 68
26: Paul: 78 --> 80
27: Eric: 68 --> 72
28: Paul: 80 --> 85
29: Eric: 72 --> 73
30: Paul: 85 --> 92
31: Eric: 73 --> 79
32: Paul: 92 --> 95 --CHUTE--> 75
33: Eric: 79 --> 82
34: Paul: 75 --> 79
35: Eric: 82 --> 85
36: Paul: 79 --> 83
37: Eric: 85 --> 86
38: Paul: 83 --> 88 --LADDER--> 100
The winner is Paul!
```