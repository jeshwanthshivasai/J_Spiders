// const div = document.getElementById('root');
// root.appendChild(h1);
// root.appendChild(p);
// root.appendChild(button);

// const heading = document.createElement('h1');
// heading.textContent = 'Heading 1';
// document.body.appendChild(heading);

// const paragraph = document.createElement('p');
// paragraph.textContent = 'I am a Paragraph';
// document.body.appendChild(paragraph);

// const button = document.createElement('button');
// button.textContent = 'Click here';
// document.body.appendChild(button);

console.log(React);
console.log(ReactDOM);

const h1 = React.createElement('h1', null, "Welcome to React"); 
const paragraph = React.createElement('p', null, "I am a Paragraph");
const button = React.createElement('button', null, "Click here");

const div = React.createElement('div', null, h1, paragraph, button);

ReactDOM.render(
    div,
    document.getElementById('root')
);