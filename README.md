# bigO
If there's only one overarching topic of computer science, it's difficult to not give that award to Big O. Having an efficient algorithm can make the difference between a
program running within a few minutes and the program taking a few years (or even worse, until the heat death of the universe).

## [bogosort](https://github.com/kevinfengcs88/bigO/blob/main/Bogosort.java)
Bogosort is an incredibly inefficient sorting algorithm that sorts a set of data purely by chance. Here's how it works:
1. Randomize the data by scrambling the set
2. Check if the data is sorted
3. Repeat steps 1 & 2

Bogosort's average runtime is O(n!), making for a very, VERY slow sorting algorithm. You can learn more about bogosort and other interesting sorting algorithms in one
of my Medium blog posts, [here](https://medium.com/star-gazers/de-optimizing-sorting-algorithms-to-o-505d0060f508).
