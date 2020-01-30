simpleGreetProvider = function(){
    return "Hello ";
}

timelyGreetProvider = function(){
    greet="";

    hour = (new Date()).getHours();

    if (hour>=3 && hour<=11) greet="Good Morning ";
    else if(hour<=15) greet="Good Afternoon ";
    else greet="Good Evening ";

    return greet;
}

function greetUser(userName,greetProvider){
    return greetProvider() + " " + userName;
}

/* Here greetProvider is a function passed as param to another function called greetUser.
* such functions are called callbacks. (greetProvider is a call back)
*/

// the above function can be written as an ARROW FUNCTION
// greetUser = (userName,greetProvider) => greetProvider() + " " + userName;

//calling 

console.log(greetUser("vinu", simpleGreetProvider));

console.log(greetUser("vinu",timelyGreetProvider));

console.log(greetUser("vinu", function() { return "Sasriakal ";}));

console.log(greetUser("gowdre",()=>"Namasthey "));

console.log(greetUser("gowdre",()=>"Vanakkam "));
console.log(greetUser("gowdre",()=>"Namaskar "));

// console.log(greetUser("Kiran",simpleGreetProvider));
// console.log(greetUser("Vasu",simpleGreetProvider));

// console.log(greetUser("Kiran",()=>"Namasthey "));
// console.log(greetUser("Vasu",()=>"Namasthey "));

// IIFE - Immediately Invoked Function Expression

(function(){
    console.log("has to execute her right away..!");    
})(); 