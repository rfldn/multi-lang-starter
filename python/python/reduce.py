from functools import reduce


ITERATIONS = 60000


def reduce_huge_list():
    return reduce(lambda acc, index: acc + [index], range(ITERATIONS), [])


def reduce_huge_list_mutable():
    return [index for index in range(ITERATIONS)]
