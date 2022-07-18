
/**
 * Into to JavaScript
 */

function variables() {

}
// assumed that all functions return something: could be at least 'undefined'

// errors are going to happen when you run it, not when you write it - no compiler the help you here
// LINTER tooling can help, but won't 

// have a look at lecture final for some good examples

// browser dev tools has a console where you can run and look at all of this stuff running

function math() {
    console.log("2" + 2);
}

// object literals are kind of like key value pairs on a map
function hasObject() {
    const person = {
        firstName: "Michael",
        lastName: "Felger",
        pets: ["Sophie", "Billie"]
    }
    console.log(person)
}

// method overloading does not exist in JS - the last definition encountered is the ONLY definition of a function
function add(x, y) {
    return x + y;
}

function add(x, y, z) {
    return x + y + z;
}

// many build in libraries - math library, string functions

// it's all on MDN, so just look it up