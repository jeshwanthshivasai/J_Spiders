//HIGHER-ORDER FUCNTIONS

//1
function calculate(operation) {
    console.log("Area of the triangle is:");
    console.log(operation(5, 10));
}
calculate(function(base, height) {
    return 0.5 * base * height;
});

//2
function x(y) {
    console.log(y(4));
}
x(function y(s) {
    return s*s;
})

//3
function r(){
console.log("area of rectangle ");
    }
r(((l,b) => console.log(l*b))(2,3));

//4
function add(){
    console.log("addition of two numbers is");
    console.log(z(2,3))
}
add()
function z(a,b){
    return a+b;
}

//5
function sub(){
    console.log("subtraction of two numbers is");
    console.log(z(80,3))
}
sub()
function z(a,b){
    return a-b;
}

//6
function mul(){
    console.log("multiplication of two numbers is");
    console.log(z(10,3))
}
mul()
function z(a,b){
    return a*b;
}

//7
function add(operation) {
    console.log("Sum of three numbers is:");
    console.log(operation(10, 20, 30));
}
add(function(a, b, c) {
    return a + b + c;
});

//8
function sub(z){
    console.log("subtraction of two numbers is");
    console.log(z(5,3))
}
sub(function z(a,b){
    return a-b;
})

//9 
function multiply(operation) {
    console.log("Product of three numbers is:");
    console.log(operation(2, 3, 4));
}
multiply(function(a, b, c) {
    return a * b * c;
});

//10
function calculate(operation) {
    console.log(operation(7));
}
calculate(function(radius) {
    return Math.PI * radius * radius;
});

//11
function calculate(operation) {
    console.log("Square root of the number is:");
    console.log(operation(49));
}
calculate(function(num) {
    return Math.sqrt(num);
});

//12
function checkEven(operation) {
    console.log("Is the number even?");
    console.log(operation(4));
}
checkEven(function(num) {
    return num % 2 === 0;
});

//13
