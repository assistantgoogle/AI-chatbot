document.getElementById('send-btn').addEventListener('click', function() {
    const userInput = document.getElementById('user-input').value;
    const chatBox = document.getElementById('chat-box');
    chatBox.innerHTML += `<div>User: ${userInput}</div>`;
    document.getElementById('user-input').value = '';

    fetch('/chat', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userInput),
    })
    .then(response => response.text())
    .then(data => {
        chatBox.innerHTML += `<div>Chatbot: ${data}</div>`;
        chatBox.scrollTop = chatBox.scrollHeight;
    });
});
