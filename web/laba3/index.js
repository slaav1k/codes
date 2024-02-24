function upFunc(x, y, nm) {
    let tmpSum = 0;
    for (let n = 0; n <= nm; n++) {
        tmpSum += (Math.pow(x, n)) / (2 * Math.pow(y, n + 1) + x * n); 
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
let imgElement = document.createElement("img");
imgElement.src = "./func.png";


let lowCase, upCase, a,  nm1,  nm2;

do {
    lowCase = parseInt(prompt("Введите нижнюю границу (целое число больше 0):"));
} while (isNaN(lowCase) || lowCase <= 0);

do {
    upCase = parseInt(prompt("Введите верхнюю границу (целое число больше " + lowCase + "):"));
} while (isNaN(upCase) || upCase <= lowCase);

console.log("Нижняя граница: " + lowCase);
console.log("Верхняя граница: " + upCase);



do {
    a = parseFloat(prompt("Введите значение параметра а (целое число больше " + lowCase + " и меньше " + upCase + "):"));
} while (isNaN(a) || a < lowCase || a > upCase);
do {
    nm1 = parseFloat(prompt("Введите значение параметра nm1 (целое число от 2 до 6):"));
} while (isNaN(nm1) || nm1 < 2 || nm1 > 6);
do {
    nm2 = parseFloat(prompt("Введите значение параметра nm2 (целое число от 2 до 6):"));
} while (isNaN(nm2) || nm2 < 2 || nm2 > 6);


let resultsDiv = document.getElementById("result");
resultsDiv.innerHTML = "";
resultsDiv.appendChild(imgElement);
resultsDiv.innerHTML += '<br>';
resultsDiv.innerHTML += "Нижняя граница: " + lowCase + '<br>';
resultsDiv.innerHTML += "Верхняя граница: " + upCase + '<br>';
resultsDiv.innerHTML += "Параметр a: " + a + '<br>';
resultsDiv.innerHTML += "nm1: " + nm1 + '<br>';
resultsDiv.innerHTML += "nm2: " + nm2 + '<br>';


for (let x = lowCase; x <= upCase; x++) {
    for (let y = lowCase; y <= upCase; y++) {
        if (x < a) {
            let st = 'f(' + x + ', ' + y + ') = ' + upFunc(x, y, nm1).toFixed(3);
            alert(st);
            resultsDiv.innerHTML += st + '<br>';
        } else {
            let st = 'f(' + x + ', ' + y + ') = ' + downFunc(x, y, nm2).toFixed(3);
            alert(st);
            resultsDiv.innerHTML += st + '<br>';
        }
    }
  
}

let imgElement2 = document.createElement("img");
imgElement2.src = "./ans.png";

resultsDiv.appendChild(imgElement2);
alert("end");