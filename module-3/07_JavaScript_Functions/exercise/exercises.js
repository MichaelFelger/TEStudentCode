/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
function isAdmitted(gpa, satScore = 0, recommendation = false) {
    if (gpa > 4 || satScore > 1300 || (gpa > 3 && recommendation === true) || (satScore > 1200 && recommendation === true)) {
        return true;
    } else return false;
}
/**
 * Write a function called useParameterToFilterArray that takes a
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];
function useParameterToFilterArray(filterFunction) {
    return unfilteredArray.filter(filterFunction);
}

/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */
function makeNumber(first, second = '') {
    return Number.parseInt(first.concat(second));
}
/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll() {
    let numArray = Array.from(arguments);
    return (numArray.reduce((acc, num) => acc += num, 0));
}
/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */
/**
 * Takes an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array.
 * 
 * @param {*} myArray 
 * @returns {Array} 'Happy ' + original element
 */

function makeHappy(myArray) {
    return myArray.map(x => 'Happy ' + x);

}
/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */
/**
 * Takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 * @param {*} objectArray 
 * @returns {string} space delineated address properties
 */
function getFullAddressesOfProperties(objectArray) {
    return objectArray.map(x => x.streetNumber + " " + x.streetName + " " + x.streetType + " " + x.city + " " + x.state + " " + x.zip)
}

/**
 * Write and document a function called findLargest that uses `forEach`
 * to find the largest element in an array.
 * The function must work for strings and numbers.
 *
 * For strings, "largest" means the word coming last in lexographical order.
 * Lexographic is similar to alphabetical order except that
 * capital letters come before lowercase letters:
 *
 * "cat" < "dog" but "Dog" < "cat"
 *
 * @param {number[]|string[]} searchArray the array to search
 * @returns {number|string} the number or string that is largest
 **/
/**
 * Finds the largest element in an array by lexographic value.
 * @param {number[]|string[]} searchArray 
 * @returns {number|string} the number or string that is largest
 */
function findLargest(searchArray) {
    temp = '';
    searchArray.forEach((element) => {

        if (temp < element) {
            temp = element;
        }
    });
    return temp;
}

/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
/**
 * Take an array of arrays, adds up all sub values, and returns
 * the sum.
 * @param {number[]} arrayOfArrays 
 * @returns {number} sum of all elements
 */
function getSumOfSubArrayValues(arrayOfArrays) {
    if ((arrayOfArrays == undefined) || (arrayOfArrays.length === 0)) { return 0 }
    return arrayOfArrays.reduce(function (a, b) {
        return a.concat(b);
    })
        .reduce(function (a, b) {
            return a + b;
        });
}

// other solution: 
//                  if (!sparseArray) return 0;  this is falsy bc it's an empty array
//                  const sumArray = (arr) => arr.reduce((acc, el) => acc += el, 0);
//                      return arrayOfArrays.reduce((acc, arr) => acc += sumArray(arr), 0);