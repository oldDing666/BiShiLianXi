// let array = [3,1,2,5,4]
// let array = ['a', 'd', 'b', 'c']
// let array = [undefined, -1000, undefined]
// let array = [NaN, -1000, NaN]
let array = [NaN, -1000]

// console.log(array)
// array.sort();
// console.log(array)

// console.log(typeof (NaN) != "string")
// console.log(isNaN(1))

let maxValue;
let index = -1;
let isFirstNum = true;
for (let i = 0; i < array.length; i++) {
    // if (isNaN(newArray[i]) || newArray[i] === null || newArray[i] === undefined)
    if (array[i] === null || array[i] === undefined)
        continue;
    // if (isNaN(newArray[i]) && typeof (newArray[i]) != "string") {
    //     continue;
    // }
    if (isNaN(array[i]) && typeof (array[i]) != "string") {
        continue;
    }
    if (isFirstNum) {
        isFirstNum = false;
        maxValue = array[i];
        index = i;
        continue;
    }
    if (maxValue < array[i]) {
        maxValue = array[i];
        index = i;
    }
}

console.log(maxValue)