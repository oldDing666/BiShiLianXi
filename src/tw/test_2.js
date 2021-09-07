// mappingFunc = value => value.age;
// mappingFunc = value => value % 2 !== 0 ? undefined : value;
// mappingFunc = value => (!value) ? 6 : undefined;
// mappingFunc = value => value;
//
// let array = [1, 2, 3, 4];
// console.log(array);
//


// let array = [1, 2, 3, 4];
// let array = [Number.MAX_VALUE, Number.POSITIVE_INFINITY];
// let array = [Number.MIN_VALUE, Number.NEGATIVE_INFINITY];
// let array = [];
// let array = [null, undefined, NaN];
// let array = [{name: 'John', age: 10},
//     {name: 'Tom', age: 20},
//     {name: 'Bob', age: 30}];
// let array = [1, 2, 3, 4, 5]; // [ undefined, 2, undefined, 4, undefined ]
// let array = [null, 5];
// let newArray = array.map(mappingFunc, array);
// console.log(newArray);

// let array = ['a', 'b', 'c', 'd'];
// let newArray = array.map(mappingFunc, array);
// // let maxVaule = Math.max(...newArray);
// let maxValue = newArray[0];
// for (let i = 1; i < newArray.length; i++) {
//     maxValue = maxValue < newArray[i] ? newArray[i] : maxValue;
// }

// let array = ['a', 'b', 'c', 'd'];
// let maxVaule = Math.max(...array);

// let array = [-100, -15, -50, -10];
// let array = [NaN, -1000];
// let array = [Number.MAX_VALUE, Number.POSITIVE_INFINITY];
// let array = [Number.MIN_VALUE, Number.NEGATIVE_INFINITY];
// let array = [];
// let array = [null, undefined, NaN];
// let array = null;
// let array = undefined;
// let array = [-100, -15, 0, -10];
// let array = ['a', 'b', 'c', 'd'];
// let array = [undefined, -1000, undefined];
// let array = [NaN, -1000, NaN];
// let array = [1, 2, 3, 4, 5];
// let array = [null, 5];
// const array = [
//     {name: 'John', age: 10},
//     {name: 'Tom', age: 20},
//     {name: 'Bob', age: 30}
// ];

mappingFunc = value => value;
// mappingFunc = value => value.age;
// mappingFunc = value => value % 2 !== 0 ? undefined : value;
// mappingFunc = value => (!value) ? 6 : undefined;
if (array === null || array === undefined || array.length === 0) {
    console.log(undefined);
    throw new Error("程序结束");
}

let newArray = array.map(mappingFunc, array);
// console.log(newArray);
let maxValue;
let index = -1;
let isFirstNum = true;
for (let i = 0; i < newArray.length; i++) {
    if (newArray[i] === null || newArray[i] === undefined)
        continue;
    if (isNaN(newArray[i]) && typeof (newArray[i]) != "string") {
        continue;
    }
    if (isFirstNum) {
        isFirstNum = false;
        maxValue = newArray[i];
        index = i;
        continue;
    }
    if (maxValue < newArray[i]) {
        maxValue = newArray[i];
        index = i;
    }
}
if (index === -1) {
    console.log(undefined);
    throw new Error("程序结束");
}
console.log(array[index]);