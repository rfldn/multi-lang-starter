import { reduceHugeList } from "../src/reduce";

describe("test perf reduce", () => {
  it("should run fast enough", () => {
    const start = performance.now();
    reduceHugeList();
    const end = performance.now();
    const duration = end - start;
    console.log(`Ran for ${duration} ms`);
    expect(duration).toBeLessThan(6000);
  });
});
