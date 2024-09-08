const openButton = document.getElementById('openButton');
const closeButton = document.getElementById('closeButton');
const cardCover = document.getElementById('cardCover');
const cardInside = document.getElementById('cardInside');

// Play a sound effect when the card opens
function playSound() {
    const audio = new Audio('https://www.soundjay.com/button/beep-07.mp3');
    audio.play();
}

// Trigger confetti animation
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
    playSound();
});

closeButton.addEventListener('click', () => {
    cardCover.style.transform = 'rotateY(0deg)';
    cardInside.style.transform = 'rotateY(-180deg)';
});
