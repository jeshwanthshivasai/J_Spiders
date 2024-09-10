function showOnDisplay() {
    const display = document.getElementById('display');
    display.value += value;
}

function clear() {
    const display = document.createElement('display');
    display.value = '';
}

function calResult() {
    const display = document.createElement('display');
    try {
        display.value = eval(display.value);
    } catch (e) {
        display.value = 'Error';
    }
}