function getArray(items) {
    return new Array().concat(items);
}
var myNumArr = getArray([100, 200, 300]);
var myStrArr = getArray(["Hello", "world"]);
myNumArr.push(400); // ok
myStrArr.push("Hello TypeScript"); //ok
myStrArr.push("Hi"); //ok
myStrArr.push(500); //ok
console.log(myNumArr);
console.log(myStrArr);
