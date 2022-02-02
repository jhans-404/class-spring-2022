# Connect 4

## Key Takeaways:
- To traverse a 2D-Array, we need to loop through each element of the outer array (row). For each sub-array we need to loop through each element (column).
<br> For example:
```
for (int r = 0; r < arr.length; r++) {
    for (int c = 0; c < arr[r].length; c++) {
        \\ do something
    }
}
```

- To display the contents of a 2D-Array, we can use the built-in method `System.out.println(Arrays.deepToString(arr));`, or we can create a method that builds a `String` representation of the elements.
