Programming Assignment 8:  Traveling Salesperson Problem


/******************************************************************************
 *  Approximate number of hours to complete this assignment
 ******************************************************************************/

Number of hours: 3

/******************************************************************************
 *   Explain how you implemented the nearest insertion heuristic.
 ******************************************************************************/

To implement the nearest insertion heuristic, we firstly isolated the different
steps to acheive a path as follows
-Compare distance between the point, say p, to be inserted to every
    other point in the list
-Find the  position of the nearest point to p, and note its position in the list
    from a reference node(start)
-Insert the node at that position

Following this steps we traversed the list, calculating the distance from it to
p and compared it with distances to previous points we calculated to
keep track of where the point with the short distance lay.

Then knowing that we had the position of the point with the nearest distance
at the end of the traveral, we wrote a private function that gets a positiion
and inserts the point at a position say i reference from a node (start)


/******************************************************************************
 *  Explain how you implemented the smallest insertion heuristic. Describe
 *  only the differences between this heuristic and the nearest insertion one.
 ******************************************************************************/

In the smallest insertion heuristic, we used a similar approach as above
but instead of finding the nearest point by distance, we found out how inserting
the point at a particular position will change the total length. Keeping
track of the magitude of that change, we determined what position for insertion
added the least to the total length and inserted the point there.

Keeping track of the maginitudes of this change, we inserted the
point at the position in the list relative to the reference node (start)
where that change was the smallest.

/******************************************************************************
 *  Explain the advantage of using a linked list instead of an array.
 ******************************************************************************/
Using a linked list is better than an array because the size of a list is
mutable and you can insert items into a list much easier than you could in
an array. Also, linked lists have the advantage in that you can make them
circular, while arrays can never be.


/******************************************************************************
 *  Explain what is the advantage of using a *circular* linked list instead
 *  of a null-terminated linked list.
 ******************************************************************************/
A circular linked lists allows for  traversal from the last node to the first node,
which is good because specifically in this problem, you want to calculate
the distance from the last point to the first point, as that is part of the length
calculation. Circular linked lists also allow you to traverse from any node to any
node.


/******************************************************************************
 *  In the table below, fill in the lengths that are computed by the two
 *  heuristics (nearest insertion and smallest insertion).
 ******************************************************************************/

data file      nearest insertion     smallest insertion
-----------------------------------------------------
tsp10.txt         1566.1363             1655.7462
tsp100.txt        7389.9297             4887.2190
tsp1000.txt       27868.7               17265.6282
usa13509.txt      77449.9794            45074.7769


/******************************************************************************
 *  Do two timing analyses. Estimate the running time (in seconds)
 *  of each heuristic as a function of n, using expressions of the
 *  form: a * n^b, where b is an integer.
 *
 *  Explain how you determined each of your answers. You must include
 *  your experimental data.
 *
 *  To get your data points, run the two heuristics for n = 1,000,
 *  and repeatedly double n until the execution time exceeds 60
 *  seconds.
 *
 *  You may use TSPTimer to help do this, as per the checklist.
 *  If you do so, execute it with the -Xint option. This turns off
 *  various compiler optimizations, which helps normalize and
 *  stabilize the timing data that you collect.
 *
 *  If n = 1,000 takes over 60 seconds, your code is too slow.
 *
 *  Use the table below to provide your data for n = 1000, 2000
 *  etc.
 *
 ******************************************************************************/

n               nearest time           smallest time
------------------------------------------------------------
1000            .037                    .122
2000            .141                    .484
4000            .557                    1.932
8000            2.232                   7.68
16000           8.96                    31.056
32000           35.937                  124.573

Nearest time time complexity function: T(N) = 4e-8N^2
Smallest time time complexity function: T(N) = 1.2e-7N^2

Using the formula T(2N)/T(N), I plugged in n=1000, n=2000 into the formula, and
got an answer of approximately 4 (around 3.89/3.9) for both heuristics. I then
verified this number by plugging in n=4000, n=2000, and again got a number around
4. If 4=2^b, then b should be around 2. Plugging this number into the general
T=an^b formula, as well as n=1000, .037 to calculate a for the Nearest Time
time complexity formula, you get a=4e-8. Then I did this again for n=1000, .122,
and got a=1.2e-7 for the Smallest Time time complexity formula, resulting in the
above formulas.

/******************************************************************************
 *  If you implemented your own heuristic, please describe here how it differs
 *  from the assignments' heuristics, and why you think it will perform better.
 ******************************************************************************/

[ if you made a Leaderboard submission, you may copy your answer here ]



/******************************************************************************
 *  If you implemented your own heuristic, please provide the lengths of
 *  these heuristics for the following two input files.
 ******************************************************************************/

[ if you made a Leaderboard submission, you may copy your answer here ]

- distance on tsp1000.txt:
- distance on usa13509.txt:



/******************************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 ******************************************************************************/

Yes or no?




/******************************************************************************
 *  Write any other comments here.
 ******************************************************************************/

