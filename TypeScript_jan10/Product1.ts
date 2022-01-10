// Create a product class The properties are ProID, ProName, ProPrice ,add GST as additional tax for ProPrice display the data.
export class Product{
    prdID:number=26;
    prdName:String="Srikanth";
    prdPrice:number=4

    constructor(i:number,n:string,s:number)
    {
        this.prdID=i;
        this.prdName=n;
        this.prdPrice=s;
    }

    display()
    {
        console.log(this.prdID);
        console.log(this.prdName);
        console.log(this.prdPrice);
        
    }
}
    function calculateAmount(prdPrice) { 

        var totalPrice =prdPrice+(prdPrice*0.18);
    
        return totalPrice
    
     }
   


var e1=new Product(124,"Toys",240);
var e2=new Product(135,"Teady Bear",250);
e1.display();
e2.display();
console.log(calculateAmount(230));