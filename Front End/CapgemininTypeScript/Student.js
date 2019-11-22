var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Student = /** @class */ (function () {
    function Student(name, age, marks, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    return Student;
}());
var student1 = new Student('Jagnish', 21, 89.90, 12);
console.log(student1);
//Student1.printDetail();
var student2 = {
    name: 'Pooja',
    age: 23,
    marks: 60
};
console.log(student2);
var students = [new Student('Rahul', 25, 50),
    {
        name: 'Deepak',
        age: 43,
        marks: 69
    },
    student2, student1
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var i = students_1[_i];
    console.log(i);
}
var Graduate = /** @class */ (function (_super) {
    __extends(Graduate, _super);
    function Graduate(name, age, marks) {
        return _super.call(this, name, age, marks) || this;
    }
    return Graduate;
}(Student));
