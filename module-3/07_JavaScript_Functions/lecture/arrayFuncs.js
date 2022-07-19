// see lecture final for how to pass a function in to each of these to do the operation and reduce repetition
// line 40omething (the map one) in final is doing the same thing as function at line 30


function incrementArray(arr) {
    let results = []
    for (let val of arr) {
        results.push(val + 1);
    }
    return results;
}

function decrementArray(arr) {
    let results = []
    for (let val of arr) {
        results.push(val - 1);
    }
    return results;
}

function doubleArray(arr) {
    let results = []
    for (let val of arr) {
        results.push(val - 2);
    }
    return results;
}

const nums = [1, 2, 3, 4, 5, 6];
console.log(incrementArray(nums));
console.log(decrementArray(nums));
console.log(doubleArray(nums));