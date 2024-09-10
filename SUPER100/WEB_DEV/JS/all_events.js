//on focus
let input = document.getElementById('input');
input.addEventListener('focus', () => {
    console.log('input field is focused');
});

//on change
input.addEventListener('change', () => {
    console.log('input field value has changed');
});

//on blur
input.addEventListener('blur', () => {
    console.log('input field is no longer focused');
});

//on keydown
input.addEventListener('keydown', (event) => {
    console.log(`Key down event: ${event.key}`);
});

//on keyup
input.addEventListener('keyup', (event) => {
    console.log(`Key up event: ${event.key}`);
});

//on keypress
input.addEventListener('keypress', (event) => {
    console.log(`Key press event: ${event.key}`);
});

//mouse out
input.addEventListener('mouseout', (event) => {
    console.log('Mouse has left the input field');
});

//mouse release
input.addEventListener('mouseup', (event) => {
    console.log('Mouse button has been released');
});

//mouse press
input.addEventListener('mousedown', (event) => {
    console.log('Mouse button has been pressed');
});
