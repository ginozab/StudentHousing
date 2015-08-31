# StudentHousing
This is a program that I created for a final project in an undergraduate class at Allegheny College.

# What this program does
The goal of this project was to help solve the problem of the sometimes "unfair" housing numbers given to students.
This project works by assigning weights to students depending on their previous living situation and their previous room draw number.
Therefore if the students previous living situation and room draw number were "bad" compared to what the school has to offer, then the student would get a better room draw number for next year. 
And the opposite was true too. 

In order to determine what was a relatively "bad" living situation we asked 50 students to rank each available living situation, and we ordered them based on those results. 

In the program we create a random class where each random student gets a random previous room draw and living situation. 
They then get passed into the algorithm where it outputs a list of the class and gives each student a new room draw number. 

# Running the program
In order to run the program all you need to do is type in the command
```shell
java RoomDraw <enter class you want to create room draw numbers for (Ex. freshmen, sophmore, junior)>
```

# Example output
The output shows the student (we just varied by giving the student a number), their old room draw number, their old living situation, the weight calculated based on previous room draw and living situation, and finally their new room draw number. 
```shell
java RoomDraw junior
Junior373 484 RD 98.98 1
Junior376 476 RD 97.32 2
Junior386 437 RD 94.86 3
Junior383 400 RD 92.04 4
Junior372 317 RD 90.24000000000001 5
...
```
