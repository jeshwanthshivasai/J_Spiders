// let date = new Date()
// function x() {
//     console.log(date.toLocaleTimeString())
// }

// function black() {
//     document.body.style.background = 'black'
//     let button = document.getElementsByTagName('button');
//     button[0].style.background = 'yellow';
// }

// function white() {
//     document.body.style.background = 'white'
//     let button = document.getElementsByTagName('button');
//     button[1].style.background = 'yellow';   
// }

//click to turn on/off a lightbulb
// https://media.geeksforgeeks.org/wp-content/uploads/ONbulb.jpg
// https://media.geeksforgeeks.org/wp-content/uploads/OFFbulb.jpg

//toggle by clicking on and off

let on = document.getElementById('on');
on.addEventListener('click', () => {
    let image = document.getElementById('image');
    image.src = ('https://www.w3schools.com/js/pic_bulbon.gif');
});
let off = document.getElementById('off');
off.addEventListener('click', () => {
    let image = document.getElementById('image');
    image.src = ('https://www.w3schools.com/js/pic_bulboff.gif');
});

//toggle with just one button

let toggle = document.getElementById('toggle');
toggle.addEventListener('click', () => {
    let image = document.getElementById('image');
    image.src = (image.src === 'https://www.w3schools.com/js/pic_bulboff.gif') ? 'https://www.w3schools.com/js/pic_bulbon.gif' : 'https://www.w3schools.com/js/pic_bulboff.gif';
});

//toggle by clicking on the image

let image = document.getElementById('image');
image.addEventListener('click', () => {
    image.src = (image.src === 'https://www.w3schools.com/js/pic_bulboff.gif') ? 'https://www.w3schools.com/js/pic_bulbon.gif' : 'https://www.w3schools.com/js/pic_bulboff.gif';
});