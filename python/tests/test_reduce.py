import timeit
from unittest import TestCase

from python import reduce


class Test(TestCase):
    def test_reduce_huge_list(self):
        execution_time = timeit.timeit(reduce.reduce_huge_list, globals=globals(), number=1)
        print(execution_time)
        assert execution_time <= 6000
