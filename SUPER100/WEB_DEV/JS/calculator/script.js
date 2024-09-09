function showOnDisplay() {
    
}

function clear() {
    const display = document.createElement('display');
    display.value = '';
}

function calculateResult() {
    const display = document.createElement('display');
    try {
        display.value = eval(display.value);
    } catch (e) {
        display.value = 'Error';
    }
}