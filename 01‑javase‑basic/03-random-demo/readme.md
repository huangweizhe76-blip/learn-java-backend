# Java Random Demo
Examples for `java.util.Random` utility class.

## API Reference
1. `nextInt()`: returns random int across full int range, includes positive & negative numbers.
2. `nextInt(bound)`: generate integer in range **[0, bound‑1]**, left‑closed right‑open interval.

### General range formula
Generate random integer within `[min , max]`:
```java
nextInt(max - min + 1) + min;

## Demo02Random: Guess Number Game
Combine `Random`, `Scanner` and `while(true)` infinite loop.

Logic:
1. Generate secret number in range [1,100].
2. Continuously receive user input.
3. Hint: too big / too small.
4. Break loop when user guesses correctly.
```

```java
nextInt(max - min + 1) + min;