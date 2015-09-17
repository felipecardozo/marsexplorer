# marsexplorer
mars explorer
Statement: A team of robotic explorers have been requested by the

NASA to land on the Martian surface.

Interestingly the Martian surface is flat and should be navigated by

browser so that the inner chambers have a full view of

surrounding terrain and thus send these images to Earth.

A scanner position is represented by the combination of

coordinates X and Y and a letter corresponding to one of the cardinal points.

For simplification, the terrain of Mars can be seen as a grid. By

example, (0,0, N) corresponding to the position of a browser in the corner

lower left of the grid being the exploring pointing north.

In order to control the robotic rover, NASA sends chains

simple characters. The possible letters are 'I', 'D' and 'A'.

● 'I' corresponds to turn 90 degrees to the left without moving from point

on the grid in which it is located,

● 'D' corresponds to turn 90 degrees to the right without moving from point

wherein the grid is

● 'A' corresponds to make a move forward keeping the

same direction that is currently.

Assume that the box just north of the point (X, Y) is (X, Y + 1).

Input data The first line of input data is the coordinate

maximum possible upper right terrain of Mars, the bottom coordinate

left is assumed to be 0.0.

The rest of the input data is relevant information to explorers

they have landed on the Martian surface. Each browser has two

data input lines. The first line is the current position

Scout and the second line is a series of instructions that

They instruct the robot as to explore the terrain.

The position comprises two integers and separated by a letter

spaces corresponding to the X and Y coordinates and orientation

browser.

Each browser will be completed sequentially, which means that the

second browser will not start their movements until the last browser

finished their movements.

Output data: The console output for each browser must be fancy

end and orientation.