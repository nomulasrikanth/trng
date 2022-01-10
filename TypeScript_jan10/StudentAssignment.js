var StudentAssignment = /** @class */ (function () {
    function StudentAssignment(i, n, s) {
        this.SID = 26;
        this.SName = "Srikanth";
        this.SClass = 4;
        this.SID = i;
        this.SName = n;
        this.SClass = s;
    }
    StudentAssignment.prototype.display = function () {
        console.log(this.SID);
        console.log(this.SName);
        console.log(this.SClass);
    };
    return StudentAssignment;
}());
var s1 = new StudentAssignment(10, "Ashok", 9);
s1.display();
var s2 = new StudentAssignment(15, "Arjun", 11);
s2.display();
