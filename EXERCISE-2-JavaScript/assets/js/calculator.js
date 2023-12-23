let outputElement = document.getElementById("output");
let num1,num2;

let updateValue = () => {
    num1 = Number.parseFloat(document.getElementById("input1").value);
    num2 = Number.parseFloat(document.getElementById("input2").value);

}

let isError = () => {
    return typeof num1 !== 'number' || isNaN(num1) || typeof num2 !== 'number' || isNaN(num2) ;
}

let add = () => outputElement.innerText=isError() ? "Invalid Input" : num1+num2;
let subtract = () => outputElement.innerText=isError() ? "Invalid Input" : num1-num2;
let multiply = () => outputElement.innerText=isError() ? "Invalid Input" : num1*num2;
let divide = () => outputElement.innerText=isError() ? "Invalid Input" : num1/num2;


