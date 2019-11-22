// var x = [1234, 'xyz', true, { name: 'Sharuk kahn' }];

// for (var i = 0; i < x.length; i++) {
//     console.log(x[i]);
// }


var color = ['yelow', 'green', 'white', 'red'];
console.log(color);
color.pop();
console.log(color);
color.push('violet', 'blue');
console.log(color);
color.splice(2, 2);
console.log(color);
color.splice(3, 0, 'indigo', 'orange', 'grey');
console.log(color);

// function test(cb) {
//     console.log('test function started');
//     cb();
//     console.log('test function ended');
// }

// test(function () {
//     console.log('callback function is being executed');
// });


// setTimeout(function () {
//     console.log('10 second delay');
// }, 1000);

// var i = 1;



// setInterval(function () {
//     console.log(i);
//     i++;
// }, 1000);

var arr = [1,2,3,4,5,6,7,8,9,5,8,8,4,4,3,2,2,2];

color.forEach(function(value , index , array )
{
    console.log(value,index,array);
})


var newArray = arr.filter(function(value)
{
    return value > 3;
});

console.log(newArray);

var filterArray = arr.filter(function(value,index,array){
return array.indexOf(value) === index;
});

console.log(filterArray);

if(123 === '123')
{
    console.log(true);
}
else
{
    console.log(false);
}

for (var value of arr)
{
    console.log(value);    
}

for (var i in color) 
{
    console.log('the value is ',color[i],'the index is ',i);
}

var Movie = 
{
    name : 'paisa Vasool',
    actor: 'Balaiah',
    actress: 'Shreya',
    director: 'puri jagannath'
};

for(var key in Movie)
{
    console.log(Movie[key]);
}





