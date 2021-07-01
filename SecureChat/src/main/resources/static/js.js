
/*
   File: ChatMessageController.java
   Date       Author      Changes
   May  9 21  Patryk Polak     Created
   May 20 21  Patryk Polak      Fixed two Issues
   May 28 21  Patryk Polak   Added Draft Documentation
*/

var Chatclient = null;

/**
 * method to showing messages takes
 * @param value
 * @param user
 */
function showMessage(value,user){
    var newResponse = document.createElement('p');
    newResponse.appendChild(document.createTextNode(user));
    newResponse.appendChild(document.createTextNode(": "));
    newResponse.appendChild(document.createTextNode(value));
    var ActionResponse = document.getElementById('response');
    ActionResponse.appendChild(newResponse);


}

/**
 * method that connect all elements
 */
function connect() {
    Chatclient =  Stomp.client('ws://localhost:8080/SecureChatApplication');
    Chatclient.connect({}, function (frame) {
        Chatclient.subscribe("/main/ChatMessage", function (chatmessage) {
            showMessage(JSON.parse(chatmessage.body).value,JSON.parse(chatmessage.body).user)
        });
    })
}

/**
 * method that send message from user to mechanism
 */
function sendMessage(){
    var messageToSend = document.getElementById('messageToSend').value;
    var user = document.getElementById('user').value;
    Chatclient.send("/SecureChat/SecureChatApplication",{},JSON.stringify({'value':messageToSend,'user':user}));


}
