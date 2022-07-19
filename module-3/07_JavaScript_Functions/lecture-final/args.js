

// given an array, count the number of event numbers
function countEven() {
    let values = Array.from(arguments);
    let count = 0;
    for (let num of values) {
        if (num % 2 === 0) {
            count++;
        }
    }
    return count;
}

console.log(countEven(2, 4, 6, 8, 9));
console.log(countEven(1, 3, 6));

