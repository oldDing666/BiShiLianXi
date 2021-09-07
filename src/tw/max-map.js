/**
 * This function will find the maximum mapped value in the array. Returning
 * the original value in the array.
 *
 * Please note that the element whose mapping value is `NaN`, `undefined` or
 * `null` will be ignored.
 *
 * @param {Array} array The input array.
 * @param {Function} mappingFunc The mapping function which will map each
 *                   value in the input array.
 * @returns The original element value whose mapping value is the max value.
 *          If no element is available, then the function returns `undefined`.
 *          If the input array is `undefined` or `null`, then the function
 *          returns `undefined`.
 */
export default function maxMap(array, mappingFunc) {
    // TODO: Please implement the function.
    // <-start-

    // --end-->
}

// TODO
// You can add additional method if you want
// <-start-

function deleteNaN(arr) {
    const res = [];
    for (let i = 0; i < arr.length; i++) {
        // eslint-disable-next-line no-self-compare
        if (arr[i] === arr[i]) {
            res.push(arr[i]);
        }
    }
    return res;
}

// --end-->
