import { reduceHugeList, reduceHugeListMutable } from '../src/reduce';

describe("test perf reduce", () => {
  it("should run fast enough", () => {
    const start = performance.now();
    reduceHugeList();
    const end = performance.now();
    const duration = end - start;
    console.log(`Spread ran for ${duration} ms`);
    expect(duration).toBeLessThan(6000);
  });
  it("should run fast enough", () => {
    const start = performance.now();
    reduceHugeListMutable();
    const end = performance.now();
    const duration = end - start;
    console.log(`Mutation ran for ${duration} ms`);
    expect(duration).toBeLessThan(6000);
  });
});
