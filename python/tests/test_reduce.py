import timeit
from unittest import TestCase

from python import reduce

timeout = 6000


class Test(TestCase):
    def test_reduce_huge_list(self):
        execution_time = timeit.timeit(reduce.reduce_huge_list, globals=globals(), number=1) * 1000
        print("Concatenation ran for {} ms".format(execution_time))
        assert execution_time <= timeout

    def test_reduce_huge_list_mutable(self):
        execution_time = timeit.timeit(reduce.reduce_huge_list_mutable, globals=globals(), number=1) * 1000
        print("Mutation ran for {} ms".format(execution_time))
        assert execution_time <= timeout

