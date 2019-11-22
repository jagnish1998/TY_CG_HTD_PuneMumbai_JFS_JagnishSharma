
//Literal way of Object Creation
var studemt = {
    name: 'jagnish Sharma',
    age: 21,
    degree: 'B.tech',
    phoneNumber: 8825054152,
};

// printing name into the object
console.log(studemt.name);
console.log(studemt.degree);
console.log(studemt);

// Changing the phone no.
studemt.phoneNumber = 8872822602;
console.log('new number is ',studemt.phoneNumber);

// adding one element into object
studemt.selectedCompany = 'Capgemini';
console.log(studemt);

//Using Object Constructor 
var laptop = new Object();
laptop.brand = 'Dell';
laptop.ram = '8gb';
laptop.processor ='core i5';
laptop.price ='500000';
console.log(laptop);

console.log(Object.keys(laptop).length);

