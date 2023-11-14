const ITERATIONS = 30000;
export const reduceHugeList = () => {
  new Array(ITERATIONS).fill(0).reduce((acc, cur, index) => {
    return [...acc, cur + index];
  }, []);
}
