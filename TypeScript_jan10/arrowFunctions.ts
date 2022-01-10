//simple ts functions
function addOne(a:number , b:number):number{
    return a + b;

}

console.log(addOne(10,20));

//same converted into arrow function.

let abc = (x: number, y: number): number => {   return x+y;}

console.log(abc(10,20)); // returns 30