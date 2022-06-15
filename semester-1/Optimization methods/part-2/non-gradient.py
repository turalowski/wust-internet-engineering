from scipy.optimize import minimize
from numpy.random import rand
from numpy import exp, arange, meshgrid
from matplotlib import pyplot

# Single value
def objective(v):
    x, y = v
    return 0.5 * ((x**4 + y**4) - 16 * (x**2 + y**2)+ 5 * (x + y))

## Double values
def objective1(x, y):
    return 0.5 * ((x**4 + y**4) - 16 * (x**2 + y**2)+ 5 * (x + y))

## Define minimum, maxiumum and step
r_min, r_max, step = -5.0, 5.0, 0.1

## Implement gradient method to calculate the result
pt = r_min + rand(2) * (r_max - r_min)

## Call nelder-mead optimization method
result = minimize(objective, pt, method='nelder-mead')

## Print the total amount of evaluations
print('Total Evaluations: %d' % result['nfev'])

## Print the best solution
evaluation = objective(result['x'])
print('Solution: f(%s) = %.5f' % (result['x'], evaluation))