# Kotlin MutableList removeIf vs removeAll

This repository demonstrates a subtle difference in behavior between the `removeIf` and `removeAll` methods when used with Kotlin's `MutableList`.

## Bug Description

The `removeIf` method modifies the list in place, whereas `removeAll` creates a new list containing elements that do not satisfy the predicate.  This distinction is not always immediately obvious and can cause unexpected behavior if not carefully considered.

## Code Example

The `Bug.kt` file contains the code demonstrating the unexpected difference in behavior.  The solution is provided in `BugSolution.kt`.

## How to Run

1. Clone this repository.
2. Open the project in your favorite Kotlin IDE (IntelliJ IDEA, Android Studio).
3. Run `Bug.kt` to observe the unexpected behavior and `BugSolution.kt` to see the solution.
