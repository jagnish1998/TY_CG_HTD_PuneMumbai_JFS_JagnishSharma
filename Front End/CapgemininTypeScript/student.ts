class Student {
    constructor(
        public name: string,
        public age: number,
        public marks: number,
        public degree ?:number) 
        {
        }
        // printDetail()
        // {
        //     console.log(`Name id ${this.name} age is ${this.age} and marks is ${this.marks} `);
        // }
    }

let student1 = new Student('Jagnish', 21, 89.90,12);
console.log(student1);
//Student1.printDetail();

let student2 : Student = {
    name :'Pooja',
    age : 23,
    marks : 60
}
console.log(student2);

let students: Student[] = [new Student('Rahul',25,50),
{
    name: 'Deepak',
    age : 43,
    marks : 69
},
student2,student1
];

for (let i of students)
 {
    console.log(i);
}


class Graduate extends Student
{
    
    constructor(
         name: string,
         age: number,
         marks: number
    )
    {
        super(name,age,marks);
    }
}