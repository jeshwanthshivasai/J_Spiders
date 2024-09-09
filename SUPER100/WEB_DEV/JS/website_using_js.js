document.addEventListener('DOMContentLoaded', () => {
    const images = [
        "https://picsum.photos/800/400",
        "https://picsum.photos/800/400",
        "https://picsum.photos/800/400",
        "https://picsum.photos/800/400"
    ];
////////////////////////////////////////////////////////////////////////////////////////////////
    let currentIndex = 0;
    const carouselContainer = document.getElementById('carousel-container');
////////////////////////////////////////////////////////////////////////////////////////////////
    const frame = document.createElement('div');
    frame.classList.add('carousel-frame');

    const slideHolder = document.createElement('div');
    slideHolder.classList.add('carousel-slides');
////////////////////////////////////////////////////////////////////////////////////////////////
    images.forEach((src, index) => {
        const slide = document.createElement('div');
        slide.classList.add('slide');
        slide.style.backgroundImage = `url(${src})`;
        slideHolder.appendChild(slide);
    });

    frame.appendChild(slideHolder);
    carouselContainer.appendChild(frame);
////////////////////////////////////////////////////////////////////////////////////////////////
    const prevButton = document.createElement('button');
    prevButton.textContent = '❮';
    prevButton.classList.add('carousel-btn', 'prev');
    prevButton.addEventListener('click', () => changeSlide(currentIndex - 1));

    const nextButton = document.createElement('button');
    nextButton.textContent = '❯';
    nextButton.classList.add('carousel-btn', 'next');
    nextButton.addEventListener('click', () => changeSlide(currentIndex + 1));

    carouselContainer.appendChild(prevButton);
    carouselContainer.appendChild(nextButton);
////////////////////////////////////////////////////////////////////////////////////////////////
    function changeSlide(index) {
        if (index < 0) index = images.length - 1;
        if (index >= images.length) index = 0;

        slideHolder.style.transform = `translateX(-${index * 100}%)`;
        updateDots(index);
        currentIndex = index;
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    function updateDots(index) {
        document.querySelectorAll('.dot').forEach((dot, i) => {
            dot.classList.toggle('active', i === index);
        });
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    setInterval(() => {
        changeSlide(currentIndex + 1);
    }, 5000);
////////////////////////////////////////////////////////////////////////////////////////////////
    changeSlide(currentIndex);
});
