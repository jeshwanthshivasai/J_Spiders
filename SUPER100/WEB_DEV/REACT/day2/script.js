async function fetchApi() {
    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const apiData = await response.json();
        // console.log(apiData);

        const tableHead = document.getElementById('table-heading');
        const keys = Object.keys(apiData[0]).slice(0,5);
        // console.log(keys);
        keys.map(user => {
            const keys =  document.createElement('th');
            keys.innerHTML = `<th>${user}</th>`;
            tableHead.appendChild(keys);
        });

        const tableBody = document.getElementById('table-data');
        apiData.forEach(user => {
            const values = document.createElement('tr');
            values.innerHTML = `
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.username}</td>
                <td>${user.website}</td>
                <td>${user.email}</td>
            `;
            tableBody.appendChild(values);
        });
    } catch (err) {
        console.error(err);
    }
}

fetchApi();

