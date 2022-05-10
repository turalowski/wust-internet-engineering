# Import packages (numpy and matplotlib here)
import numpy as np;
import matplotlib.pyplot as plt;

# Create a new figure
fig = plt.figure();
# Create new 3d polar axe
ax = fig.gca(projection='3d');
# return evenly spaces values for given array for x axis
x = np.arange(-5, 5, 0.25)
# return evenly spaces values for given array for y axis
y = np.arange(-5, 5, 0.25)
# convert x and y to cordinate matrices
x, y = np.meshgrid(x, y)
# styblinski-tang function
z = 0.5 * ((x**4 + y**4) - 16 * (x**2 + y**2)+ 5 * (x + y))
surface = ax.plot_surface(x, y, z, cmap='gist_earth')
# show figure
plt.show()
# draw contour lines for x,y,z points
plt.contour(x,y,z)
# show figure
plt.show();
# scatter plot for x, y and z 
plt.scatter(x, y, z);
# show figure
plt.show()