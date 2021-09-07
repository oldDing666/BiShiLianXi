let arr = [[1, 2], [3, 4], [5, 6, 7, 8, 9], [10, 11, 12]];
console.log("原数组：");
console.log(arr);
// let flattened = [].concat.apply([], arr);
// let flattened = [].concat(...arr);
let flattened = arr.reduce((acc, curVal) => {
    return acc.concat(curVal)
}, []);
console.log("新数组：");
console.log(flattened);