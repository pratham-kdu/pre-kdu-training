let counterElement = document.getElementById("counter");

let currentValue = () => Number.parseInt(counterElement.innerText);

let incrementCounter = () => {
    counterElement.innerHTML = currentValue()+1;
}
let decrementCounter = () => {
    counterElement.innerHTML = currentValue()-1;
}