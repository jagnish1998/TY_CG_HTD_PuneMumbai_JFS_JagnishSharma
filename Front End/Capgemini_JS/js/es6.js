

let Person ={
    name: 'Kajal',
    age : 30
};

let student = {
    ...Person,
    id: 123456,
    percentage: 44.44
};

console.log(student);


let mumbaiCRS = ['Aakash','Aishwarya'];
let noidaCRS =['Kartik','Monali'];
let bangalore = ['yasmin','Shahid kapoor'];
let CRS =[
    ...mumbaiCRS,
    ...noidaCRS,
    ...bangalore,
'suraj','nisha'];

console.log(CRS);


let [name1,name2,name3 , ...restValues] = CRS;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValues);

