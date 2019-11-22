
// Anonymus function with expression
var x = function () 
{
    console.log('Hello from Anonymus function')
}
// Calling a function
x();


// naming functionm
function add(a,b)
{
    console.log(a+b);
}
// Calling a function
add(110,200);

//immediately invoke function expression
(function(x,y)
{
    console.log(x*y)
})(200,300);

// Function with return Statement
function division(a,b)
{
    return a/b;
}
// calling and printing function
console.log(division(4,2));







