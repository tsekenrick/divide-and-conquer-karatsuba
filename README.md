## Description

Professor Farnsworth has been working on designing his new crazy invention, the Smell-O-Scope. This device lets mankind smell the different odors of the celestial bodies, over vast distances. Unfortunately these smells are sometimes mixed up while reaching earth. The Professor wants to model each smell as a function of various properties of the body, specifically as polynomials. He is also modelling the mixing of the smells as multiplying the two polynomials. If he can figure out the mixture formula he is sure that he can get back the original smells.

Help the Professor work out the simulation so he can start smelling the universe.

### Input Format

The first line of the input is ***n***, the degree of the two following polynomials.

The second line of the input consists of ***n+1*** space separated integers ***a[0],...,a[n], where ***a[i]*** is the coefficient of ***x^i***.

The third line consists of ***b[0],...,b[n]***, similar to above.

### Constraints

***n+1 = 2^k, 2 <= k <= 16***.

***0 <= a[i],b[i] <=9***

### Output Format

Output the coefficients of the product of the two polynomials, space separated in a single line, starting with the coefficient of ***x^0***.

### Sample Input 0

```
3
5 2 6 8
0 6 1 8
```

### Sample Output 0

```
0 30 17 78 70 56 64
```

### Sample Input 1

```
3
2 4 4 5
5 1 7 2
```

### Sample Output 1

```
10 22 38 61 41 43 10
```

### Sample Input 2

```
31
1 7 1 5 0 1 0 5 5 3 4 6 9 2 5 4 4 4 7 3 1 6 8 2 4 1 8 6 0 1 2 6
4 1 2 7 8 0 0 7 1 3 3 7 2 6 6 0 8 7 2 7 8 8 6 4 4 4 5 7 9 7 3 5
```

### Sample Output 2

```
4 29 13 42 64 77 44 69 82 52 124 145 187 124 237 237 208 235 278 296 289 377 393 365 395 465 438 428 534 578 561 582 522 530 569 564 483 524 604 517 530 474 483 494 401 389 374 383 330 293 292 256 239 217 179 170 112 111 97 71 53 28 30 
```
