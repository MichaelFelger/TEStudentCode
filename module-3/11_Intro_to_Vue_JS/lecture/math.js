export function add(x, y) {
    return x + y;
}

export function subtract(x, y) {
    return x - y;
}

let msg = 'hello world';

// or set up a default export (limit 1)

export default {
    add,
    subtract,
    msg
}