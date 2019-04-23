# Unified Modeling Language
- Analysis and design of application.

## UML Relationships
- associations
- aggregations
- generalizations


## TextBrowser 
### Diagram with classes
1. FileManager - class that manages file
2. ViewPort - class that displays the text
3. ScrollBar - class that displays the text



|FileManager|   ViewPort|ScrollBar|
|:--------------:|:--------------:|:--------------:|
|resizeViewPort (newSize)|moveHandle (newPosition)||
|||


### Operations
- actions that user can undertake to interact with the TextBrowser

- #### Void 
  - performing the operation for its effect rather than its return value.

### Percepts
- ScrollBar
  - size
  - position
- ViewPort
  - height / size
  - content / text
- FileManager
  - none - user doesn't directly see.
  - Note: interacts with the operating system, which is an external actor.

### `moveHandle` 
- affects
  - ViewPort
  - ScrollBar
  - FileManager
- relationship
  - aggregation

### `resizeViewPort` 
- affects
  - ViewPort
  - ScrollBar
  - FileManager
- relationship
  - aggregation

### At any given point in time, what is the **number of lines** actually **displayed in the ViewPort** as a **function** of the **window's size** and the **number of lines in the file**?
- `numberOfLinesDisplayed = minimum(windowSize, numberOfLinesInFile)`
- actual number of lines displayed is the **limited** of these two: **minimum** size of the viewport and **minimum** number of lines in the file.

### `LinesVisible Association`
![](/images/lines_visible_association.png)
- **LinesVisible** indicates the **contents of the ViewPort** that must come from the **FileManager**. Those lines are determined by the **position of the ScrollBar handle**. How might this be expressed?
- linesVisible = **from** topPositionOfHandle **to** (topPositionOfHandle + windowSize)

### Display Diagram
![](/images/display_diagram.png)

The final property we must describe has to do with the size of the handle of the ScrollBar. How might this property be described as a relationship amongst components? (Assume a handleProportion of 1 fills the tray).

Example: Consider a file of 1,000 lines where you can only view 100 lines at a time. What should handleProportion be?

handleProportion = (numberOfLinesDisplayed / fileSize)

![](/images/handle_proportion.png)

![](/images/handle_proportion_diagram.png)
- handleProportion association
- ternary association
