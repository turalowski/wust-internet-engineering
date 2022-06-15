from scipy.optimize import minimize
from numpy.random import rand

# Single value
def objective(v):
    x, y = v
    return 0.5 * ((x**4 + y**4) - 16 * (x**2 + y**2)+ 5 * (x + y))

# Derivative function
def objective_derivative(x):
    return 0.5 * (4 * x**3 - 32 * x + 5)

## Double values
def objective1(x,y):
    return 0.5 * ((x**4 + y**4) - 16 * (x**2 + y**2)+ 5 * (x + y))

r_min, r_max, step = -5.0, 5.0, 0.1

pt = r_min + rand(2) * (r_max - r_min)
result = minimize(objective, pt, method='Newton-CG', jac=objective_derivative)

print('Total Evaluations: %d' % result['nfev'])

solution = result['x']
evaluation = objective(solution)
print('Solution: f(%s) = %.5f' % (solution, evaluation))