

function add(x, y) {
    return x + y;
}

let add2 = function (x, y) {
    return x + y;
}

let add3 = function myname(x, y) {
    return x + y;
}

let add4 = (x, y) => {
    return x + y;
}

let add5 = (x, y) => x + y;

let noparms = () => { console.log("hello world") };

let obj = {
    add6: function (x, y) { return x + y; },
    add7: (x, y) => x + y,
    add8(x, y) { return x + y; }
};

function acceptFunction(fn) {
    return fn(1, 2);
}

function returnfn() {
    return (x) => x * 4;
}

console.log(add(1, 2));
console.log(add2(1, 2));
console.log(typeof add2);
console.log(add3(1, 2));
console.log(add4(1, 2));
console.log(typeof add4);
console.log(add5(1, 2));
console.log(obj.add8(1, 2));
console.log(acceptFunction(add));
console.log(acceptFunction((x, y) => x + y));
console.log(acceptFunction((x, y) => x * y));

let theFun = returnfn();
console.log(theFun(4));

console.log(returnfn()(5));




