// let element = document.createElement('div');

// element.textContent = 'Hello, World!';

// document.body.appendChild(element);


// let section = document.createElement('section');
// document.body.appendChild(section);
// let div = document.createElement('div');
// section.appendChild(div);
// let p = document.createElement('p');
// div.appendChild(p);
// p.textContent = 'Hello, World!';

let image = document.createElement('img');
document.body.appendChild(image);

// image.src = 'https://picsum.photos/200';

//or

// image.setAttribute('src', 'https://picsum.photos/200');
// image.setAttribute('alt', 'images');


let api = fetch('https://fakestoreapi.com/products');
console.log(api);

//importing all the images from the api

api.then(res => res.json()).then(data => {
    data.forEach(product => {
        let image = document.createElement('img');
        document.body.appendChild(image);
        image.src = product.image;
        image.alt = product.title;
    });
}).catch(err => console.error(err));

// api.then(res => res.json()).then(x => {
//     x.map(data => {
//         let image = document.getElementById('images');
//         image.innerHTML += `<img src="${data.image}" alt="${data.title}">`;
//     })
// })

