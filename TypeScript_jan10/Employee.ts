export class Employee{
    empID:number = 123;
    empName:string = "Srikanth";
    empSal:number = 2345

    constructor(i:number, n:string, s:number){
        this.empID=i;
        this.empName=n;
        this.empSal=s;
    }
     display(){
         console.log(this.empID);
         console.log(this.empName);
         console.log(this.empSal);

     }
}

 var e1 = new Employee(124,"kranthi",345);
 e1.display();