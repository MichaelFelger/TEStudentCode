
/*
 * Into to JavaScript
 */

// single comment

function variables() {

    const doesNotChange = 42;
    // doesNotChange = 0;

    let thisCanChange = 0;
    thisCanChange = 100;

    let thisIsAString = "hello world";
    let thisisAnotherString = 'hello "world"';
    console.log(thisisAnotherString);

    console.log(`the value of thisIsAString is ${thisIsAString}`);

    const weekdays = [
        "monday", "tuesday", "wednesday", "thursday", "friday"
    ];

    console.table(weekdays);

    console.log({ thisCanChange });

}

function canDoMath() {
    console.log(2 + 2);
    console.log("Hello " + "world");
    console.log(typeof ("2" + 2));
    console.log("2" - 2);
}

function hasObjects() {

    const person = {
        firstName: "mike",
        lastName: "levy",
        address: {
            street: "1776 mentor ave",
            city: "cincinnati",
            state: "oh"
        },
        children: [
            "megan", "jacob"
        ],
        toString: function () {
            return `${this.firstName} ${this.lastName}`;
        }
    }

    person.lastName = "smith";
    person.middleName = "joe";
    delete person.children;

    console.log(person);
    console.log(person.toString());
    console.log(person.address.street);

}

function add(x, y) {
    return x + y;
}

function add(x, y, z = 0) {
    return x + y + z;
}

function mathObject() {
    console.log(Math.PI);
    console.log(Math.abs(-3));
    console.log(Math.floor(2.34));
    console.log(Math.ceil(2.34));
}

function stringFun() {
    console.log("hello".length);
    console.log("hello".endsWith("o"));
    console.log("hello".startsWith("h"));
    console.log("hello".substring(1, 3));
}

function arrayFun() {
    const arr = [0];
    arr.push(2);
    arr.push(1);
    console.log(arr.pop());

    arr.unshift(-1);
    console.log(arr.shift());

    arr.push("hello");

    console.log(arr);
}

function test(x) {
    if (x) {
        return "true";
    } else {
        return false;
    }
}

