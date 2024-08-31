//getElementById
// let element = document.getElementsByTagName('h1');
// console.log(element);
// element.style.width = '200%';


// display date after 3 seconds
// let date = document.getElementById('date');
// console.log(date);
// function displayDate() {
//     setTimeout(() => {
//         document.getElementById('date').innerHTML = Date();
//         document.getElementById('time').innerHTML = Date();
//     }, 3000);
// }
// displayDate();

// document.write

// let date = new Date();
// let button = document.querySelectorAll("button");
// setTimeout (() => {
//     button[0].innerHTML = date.toLocaleString();
//     button[1].innerHTML = date.toLocaleString();
// }, 1000)

//add background-image and add linear gradient to it
let bg = document.getElementById("background");
// console.log(bg);
bg.style.height = '100vh';
bg.style.background = "url('https://picsum.photos/1920/1080')";
bg.style.backgroundSize = "100vh";
bg.style.backgroundImage = `linear-gradient(to bottom left, black, red)`;