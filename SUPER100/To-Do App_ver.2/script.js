const inputBox = document.getElementById('input-box');
const listContainer = document.getElementById('list-container');
const completedContainer = document.getElementById('completed-container');
const uncompletedContainer = document.getElementById('uncompleted-container');

function addtask() {
    const task = inputBox.value.trim();
    if (!task) {
        alert('Please write a task to get started');
        return;
    }

    const li = document.createElement('li');
    li.innerHTML = `
        <label>
            <input type="checkbox" >
            <span>${task}</span>
        </label>

        <span class="edit-button">Edit</span>
        <span class="delete-button">Delete</span>
    `;
    listContainer.appendChild(li);

    inputBox.value = "";

    const checkbox = li.querySelector('input');
    const editButton = li.querySelector('.edit-button');
    const taskSpan = li.querySelector('span');
    const deleteButton = li.querySelector('.delete-button');

    checkbox.addEventListener("click", function() {
        li.classList.toggle("completed", checkbox.checked);
    });

    editButton.addEventListener("click", function() {
        const update = prompt("Edit task: ", taskSpan.textContent);
        if(update !== null) {
            taskSpan.textContent = update;
            li.classList.remove("completed");
        }
    });

    function updateCounters() {
        const completedTasks = document.querySelectorAll(".completed").length;
        const uncompletedTasks = document.querySelectorAll("li:not(.completed)").length;

        completedCounter.textContent = completedTasks;
        uncompletedCounter.textContent = uncompletedTasks;
    }
    updateCounters();

    checkbox.addEventListener("click", function() {
        li.classList.toggle("completed", checkbox.checked);
        updateCounters();
    });

    editButton.addEventListener("click", function() {
        const update = prompt("Edit task: ", taskSpan.textContent);
        if(update!== null) {
            taskSpan.textContent = update;
            li.classList.remove("completed");
            checkbox.checked = false;
            updateCounters();
        }
    })

    deleteButton.addEventListener("click", function() {
        if(confirm("Are you sure you want to delete this task?")) {
            li.remove();
            updateCounters();
        }
    });

}

