console.log('sync...');
console.log('first');
console.log('second');
console.log('third');

console.log('async...');
console.log('first');
const p = new Promise(
    (goodTimes, badTimes) => {
        // doing work
        console.log('second')
        goodTimes(0 / 0)
        badTimes('boo')

    }
)
p.then((result) => { console.log("the result was " + result); })
    .catch((prob) => { console.log("the problem was " + prob) });

console.log('third');