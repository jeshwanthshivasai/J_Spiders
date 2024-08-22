var add = (a, b) => a + b;
console.log(add(3, 5));

var multiply = (a, b) => a * b;
console.log(multiply(3, 5));

var subtract = (a, b) => a - b;
console.log(subtract(3, 5));

var divide = (a, b) => a / b;
console.log(divide(3, 5));

var modulo = (a, b) => a % b;
console.log(modulo(3, 5));

var greet = (name) => `Hello, {name}!`;
console.log(greet("Jesse"));

var square = a => a * a;
console.log(square(5));

var even = num => num % 2 === 0;
console.log(isEven(5));

var cube = a => a ** 3;
console.log(cube(4));

var isPrime = num => {
    if (num < 2) {
        return false;
    }
    for (var i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}
console.log(isPrime(17));

var squareRoot = a => Math.sqrt(a);
console.log(squareRoot(16));

var power = (base, exponent) => base ** exponent;
console.log(power(2, 3));

var factorial = n => n <= 1 ? 1 : n * factorial(n - 1);
console.log(factorial(5));

var randomBetween = (min, max) => Math.random() * (max - min) + min;
console.log(randomBetween(1, 10));

var name = () => {
    var myName = "jesse".split("")
    console.log(myName);
}

var name = () => {
    var myName = "jesse".reverse();
    console.log(myName);
}

var name = () => {
    var myName = "jesse".toLowerCase();
    console.log(myName);
}

var name = () => {
    var myName = "jesse".split("").reverse().join("");
    console.log(myName);
}

var name = () => {
    var myName = "jesse".join("james");
    console.log(myName);
}

var name = () => {
    var myName = "jesse".includes("j");
    console.log(myName);
}

var name = () => {
    var myName = "jesse".includes("z");
    console.log(myName);
}

var name = () => {
    var myName = "jesse".indexOf("e");
    console.log(myName);
}

