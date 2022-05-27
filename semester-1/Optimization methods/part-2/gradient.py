# example of plotting a gradient descent search on a one-dimensional function
from numpy import asarray
from numpy import arange
from numpy.random import rand
from matplotlib import pyplot
from scipy.misc import derivative
# objective function
def objective(x):
    return 0.5 * (x**4 - 16 * x**2 + 5 * x)
 
# derivative of objective function
def objective_derivatgitive(x):
	return derivative(objective, x)


 
# gradient descent algorithm
def gradient_descent(objective, objective_derivative, bounds, n_iter, step_size):
	# track all solutions
	solutions, scores = list(), list()
	# generate an initial point
	solution = bounds[:, 0] + rand(len(bounds)) * (bounds[:, 1] - bounds[:, 0])
	# run the gradient descent
	for i in range(n_iter):
		# calculate gradient
		gradient = objective_derivative(solution)
		# take a step
		solution = solution - step_size * gradient
		# evaluate candidate point
		solution_eval = objective(solution)
		# store solution
		solutions.append(solution)
		scores.append(solution_eval)
		# report progress
		print('>%d f(%s) = %.5f' % (i, solution, solution_eval))
	return [solutions, scores]
 
# define range for input
bounds = asarray([[-5.0, 5.0]])
# define the total iterations
n_iter = 30
# define the step size
step_size = 0.25
# perform the gradient descent search
solutions, scores = gradient_descent(objective, objective_derivative, bounds, n_iter, step_size)
# sample input range uniformly at 0.1 increments
inputs = arange(bounds[0,0], bounds[0,1]+0.1, 0.1)
# compute targets
results = objective(inputs)
# create a line plot of input vs result
pyplot.plot(inputs, results)
# plot the solutions found
pyplot.plot(solutions, scores, '.-', color='red')
# show the plot
pyplot.show()