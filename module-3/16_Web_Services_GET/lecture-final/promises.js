

console.log('sync...');
console.log('first');
console.log('second');
console.log('third');

console.log('async...');
console.log('first');
const p = new Promise(
    (onSuccess, onError) => {
        // do some work;

        setTimeout(() => onSuccess(42), 1500)
        console.log('second');
    }
);

p.then((result) => { return result + result; })
    .then((r) => { console.log("the result was " + r); })
    .catch((prob) => { console.log("the problem was " + prob) });


console.log('third');
