# Big O
## Simplified analysis of an algorithm's efficiency
1. complexity in terms of input size, N
2. machine-independent
3. basic computer steps
4. time  & space

## types of measurement
- worst-case (usually done)
- best-case (bogus)
- average-case (sometimes done)

## general rules
1. ignore constants
  - 5n -> O(n)
2. certain items "dominate others"
  - O(1) < O(logn) < O(n) < O(nlogn) < O(n<sup>2</sup>) < O(2<sup>n</sup>) < O(n!)


## The algorithms can be classified as follows from the best-to-worst performance (Running Time Complexity):
- A logarithmic algorithm – O(logn)
  - Runtime grows logarithmically in proportion to n.
- A linear algorithm – O(n)
  - Runtime grows directly in proportion to n.
- A superlinear algorithm – O(nlogn)
  - Runtime grows in proportion to n.
- A polynomial algorithm – O(nc)
  - Runtime grows quicker than previous all based on n.
- A exponential algorithm – O(cn)
  - Runtime grows even faster than polynomial algorithm based on n.
- A factorial algorithm – O(n!)
  - Runtime grows the fastest and becomes quickly unusable for even
small values of n.
