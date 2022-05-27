# importing modules
import matplotlib.pyplot as plt
from scipy.misc import derivative
import numpy as np
  
# method to return function
def function(x):
    return 0.5 * (x**4 - 16 * x**2 + 5 * x)
  
# method to return its derivative
def deriv(x):
    return derivative(function, x)
  
#range in x-axis
y = np.linspace(-5, 5)
  
# plotting function
plt.plot(y, function(y), color='brown', label='Function')
  
# plotting its derivative
plt.plot(y, deriv(y), color='blue', label='Derivative')
  
# changing limits of y-axis
plt.gca().spines['left'].set_position('zero',)
  
# changing limits of x-axis
plt.gca().spines['bottom'].set_position('zero',)
plt.legend(loc='upper left')
  
# plotting text in the graph
plt.grid(True)
plt.show()