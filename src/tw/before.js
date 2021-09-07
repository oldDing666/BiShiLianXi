/**
 * Create a function that will invoke `func` while it is called less than `n` times.
 *
 * @param {Number} n The max number of times (exclusive) that `func` will invoke.
 *                   Please note that we will treat false value as 0.
 * @param {Function} func The function to invoke. If this parameter is `undefined`,
 *                   then invoking returned function will do nothing.
 * @returns The wrapper function.
 */
export default function before(n, func) {
  // TODO:
  // <-start-
  let result;
  const FUNC_ERROR_TEXT = 'Expected a function';
  if (typeof func !== 'function') {
    throw new TypeError(FUNC_ERROR_TEXT);
  }
  return function () {
    if (--n > 0) {
      result = func.apply(this, arguments);
    }
    if (n <= 1) {
      func = undefined;
    }
    return result;
  };
  // --end-->
}
