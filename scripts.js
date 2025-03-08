document.addEventListener('DOMContentLoaded',function()
{
    const taskInput=document.getElementById('taskInput');
    const addButton=document.getElementById('addButton');
    const taskList=document.getElementById('taskList');
    addButton.addEventListener('click',addTask);
    function addTask()
    {
        const taskText=taskInput.value.trim();
        if(taskText!=='')
        {
            const listItem=document.createElement('li');
            listItem.textContent=taskText;
            const removeButton=document.createElement('button');
            removeButton.textContent='Remove';
            removeButton.addEventListener('click',function()
            {
                taskList.removeChild(listItem);
            });
            listItem.appendChild(removeButton);
            taskList.appendChild(listItem);
            taskInput.value='';
        }
    } 
    taskInput.addEventListener('keypress',function(event)
    {
        if(event.key==='Enter')
        {
            addTask();
        }
    });
});