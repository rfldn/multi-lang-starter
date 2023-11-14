import { reduceHugeList, reduceHugeListConcat, reduceHugeListMutable } from '../src/reduce';

const TIMEOUT = 6000

describe("test perf reduce", () => {
  it("should run fast enough", () => {
    const start = performance.now();
    reduceHugeList();
    const end = performance.now();
    const duration = end - start;
    console.log(`Spread ran for ${duration} ms`);
    expect(duration).toBeLessThan(TIMEOUT);
  });
  it("should run fast enough", () => {
    const start = performance.now();
    reduceHugeListMutable();
    const end = performance.now();
    const duration = end - start;
    console.log(`Mutation ran for ${duration} ms`);
    expect(duration).toBeLessThan(TIMEOUT);
  });
  it("should run somewhat ok", () => {
    const start = performance.now();
    reduceHugeListConcat();
    const end = performance.now();
    const duration = end - start;
    console.log(`Concatenation ran for ${duration} ms`);
    expect(duration).toBeLessThan(TIMEOUT);
  });
});
