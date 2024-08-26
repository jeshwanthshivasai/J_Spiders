/* function x (y) {
    console.log('x called');
    y();
}
x(function y (){
    console.log('y called');
} */

function x() {
    console.log('x called');
}
x((() => console.log('y called'))());

function y() {
    console.log('y called');
}