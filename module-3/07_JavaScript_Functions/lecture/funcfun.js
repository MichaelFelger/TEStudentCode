function add(x, y) {
    return x + y;
}

let add2 = function (x, y) { // cant use this in a recursive scenario
    return x + y;
}

let add3 = function add3(x, y) { // can use this in a recursive scenario

    return x + y;
}

let add4 = (x, y) => {  // reads: given x and y, return what's in the code block
    return x + y;
}

let add5 = (x, y) => x + y;

let noparams = () => { console.log("hello world") };

let obj = {
    add6: function (x, y) { return x + y; },  // these should all do the exact same thing
    add7: (x, y) => x + y,                    // these are METHODS because they are attached to an object
    add8(x, y) { return x + y; }
}

function acceptFunction(fn) { // assumes that the function within the function takes 2 parameters
    return fn(1, 2);
}

console.log(add(1, 2));
console.log(add2(1, 2));
console.log(typeof add);
console.log(typeof add2);
console.log(add3(1, 2));
console.log(add4(1, 2));
console.log(typeof add4);
console.log(add5(5, 4));



