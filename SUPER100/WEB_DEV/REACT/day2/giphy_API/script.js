// import { GiphyApiFetch } from '@giphy/js-fetch-api';
// const fetch = new GiphyApiFetch('Ma4KHGeCQMHXYFU19t3I5vzN79K5N3DS');
// console.log(fetch);

// async function searchGif(gif) {
//     try {
//         const {data} = await fetch.search(gif, {limit:10});
//         console.log(data);
//         return data;
//     } catch (err) {
//         console.error('Error fetching Gifs:', err);
//     }
// }

// function displayGif(gifs) {
//     const container = document.getElementById('gif-container');
//     container.innerHTML = '';

//     gifs.forEach(gif => {
//         const img = document.createElement('img');
//         img.src = gif.images.fixed_width.url;
//         container.appendChild(img);
//     });        
// }

// const searchButton = document.getElementById('search-button');
// searchButton.addEventListener('click', async () => {
//     const gif = document.getElementById('search-box').value;
//     const gifs = await searchGif(gif);
//     displayGif(gifs);
// });

// document.getElementById('search-box').addEventListener('keyup', async (e) => {
//     if (e.key === 'Enter') {
//         const gif = document.getElementById('search-box').value;
//         const gifs = await searchGif(gif);
//         displayGif(gifs);
//     }
// });


async function fetchGif() {
    const query = document.getElementById('searchQuery').value;
    const apiKey = 'Ma4KHGeCQMHXYFU19t3I5vzN79K5N3DS';
    const url = `https://api.giphy.com/v1/gifs/search?api_key=${apiKey}&q=${query}&limit=1`;

    try {
        const response = await fetch(url);
        console.log(response);
        
        const data = await response.json();
        console.log(data);
        
        const gifUrl = data.data[0].images.original.url;
        document.getElementById('gifDisplay').src = gifUrl;
    }
    catch (error) {
        console.error('Error fetching the GIF:', error);
    }
}

fetchGif();