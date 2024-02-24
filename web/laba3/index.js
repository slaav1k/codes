function upFunc(x, y, nm) {
    let tmpSum = 0;
    for (let n = 0; n <= nm; n++) {
        tmpSum += (x ** n) / (2 * y ** (n + 1) + x * n); 
    }
    return tmpSum;
}

function downFunc(x, y, nm) {
    let tmpSum = 0;
    for (let n = 0; n <= nm; n++) {
        tmpSum += (3 * x + y) / (3 * fact(n))
    }
    return tmpSum;
}

function fact(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }   
}

console.log('Hello!');

let lowCase = 2;
let upCase = 6;

let a = parseFloat(prompt("Введите значение параметра а:"));
let nm1 = parseFloat(prompt("Введите значение параметра nm1:"));
let nm2 = parseFloat(prompt("Введите значение параметра nm2:"));

let resultsDiv = document.getElementById("result");
resultsDiv.innerHTML = "";

for (let x = lowCase; x <= upCase; x++) {
    for (let y = lowCase; y <= upCase; y++) {
        if (x < a) {
            let st = 'f(' + x + ', ' + y + ') = ' + downFunc(x, y, nm1).toFixed(2);
            alert(st);
            resultsDiv.innerHTML += st + '<br>';
        } else {
            let st = 'f(' + x + ', ' + y + ') = ' + downFunc(x, y, nm2).toFixed(2);
            alert(st);
            resultsDiv.innerHTML += st + '<br>';
        }
    }
  
}

alert("end");