

function incrementArray(arr, inc = 1) {
    let results = [];
    for (let val of arr) {
        let newValue = val + inc;
        results.push(newValue);
    }
    return results;
}

function decrementArray(arr) {
    let results = [];
    for (let val of arr) {
        let newValue = val - 1;
        results.push(newValue);
    }
    return results;
}

function doubleArray(arr) {
    let results = [];
    for (let val of arr) {
        let newValue = val * 2;
        results.push(newValue);
    }
    return results;
}

function transformArray(arr, fn) {
    let results = [];
    for (let val of arr) {
        results.push(fn(val));
    }
    return results;
}



const nums = [1, 2, 3, 4, 5, 6];

console.log(nums.map((v) => v * 10));

nums.forEach((v) => {
    console.log(v);
});

console.log(nums.filter((v) => v % 2 === 0));

console.log(nums.find((v) => v % 2 === 0));
console.log(nums.findIndex((v) => v % 2 === 0));

console.log(nums.join(","));


function sumAll(nums) {
    let acc = 0;
    for (let num of nums) {
        acc += num
    }
    return acc;
}
console.log(nums.reduce((acc, num) => acc += num));

function countLetters(words) {
    return words.reduce((runningCount, word) => runningCount += word.length, 0);
}

console.log(countLetters(["abc", "def"]));



// console.log(incrementArray(nums));
// console.log(decrementArray(nums));
// console.log(doubleArray(nums));
// console.log(transformArray(nums, (v) => v * 10));
