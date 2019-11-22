let Myname: string =  'Pooja';
// Myname = 1234;  error we cannot change the datatype of the variable

let company; //it is by default Any DataType

company = 123;
company = 'ty0';
company = true;

// Union Types
let age : string | number ;
age = 12;
age  = 'twelve';


//Tuple Type]
let details:[string,number,number,] = ['xyz',1000 ,10];

//For String Array
let mobile: String[] =['Pooja','Uday','Jagnish','Komal','Shyli','true'];

function add(a: number, b: number): number
{
    return a+b;
}