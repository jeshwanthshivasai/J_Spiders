console.log(React);
console.log(ReactDOM);
let element = React.createElement('h1', {}, "This ain't DOM BOM");

ReactDOM.render(element, document.getElementById('root'));
