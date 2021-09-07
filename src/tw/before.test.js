import before from './before';

describe('when calling before to create a function', () => {
  function returnInvokeCount (n, invokeTimes) {
    let count = 0;
    const func = before(n, () => ++count);
    for (let times = 0; times < invokeTimes; times++) {
      func();
    }
    return count;
  }

  it('should invoke `func` before being called `n` times', () => {
    expect(returnInvokeCount(5, 4)).toBe(4);
  });

  it('should not invoke `func` after being called `n - 1` times', () => {
    expect(returnInvokeCount(5, 6)).toBe(4);
  });

  it('should not invoke `func` immediately', () => {
    expect(returnInvokeCount(0, 0)).toBe(0);
  });

  it('should not invoke `func` when called for before(0)', () => {
    expect(returnInvokeCount(0, 1)).toBe(0);
    expect(returnInvokeCount(1, 1)).toBe(0);
  });

  it('should treat NaN as 0', () => {
    expect(returnInvokeCount(NaN, 1)).toBe(0);
  });
});
