const openButton = document.getElementById('openButton');
const closeButton = document.getElementById('closeButton');
const cardCover = document.getElementById('cardCover');
const cardInside = document.getElementById('cardInside');

function launchConfetti() {
    confetti({
        particleCount: 1000,
        spread: 7000,
        origin: { y: 0.6 }
    });
}

openButton.addEventListener('click', () => {
    cardCover.style.transform = 'rotateY(180deg)';
    cardInside.style.transform = 'rotateY(0deg)';
    launchConfetti();
});

closeButton.addEventListener('click', () => {
    cardCover.style.transform = 'rotateY(0deg)';
    cardInside.style.transform = 'rotateY(-180deg)';
});
