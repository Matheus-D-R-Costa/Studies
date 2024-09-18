const button = document.getElementById("btn-sum");

button.addEventListener('click', displayResult);

function displayResult() {
  const result = sum();
  const HTMLResult = document.getElementById("result");
  HTMLResult.innerHTML = result;
}

function sum() {
  const n1 = parseInt(document.getElementById("number1").value);
  const n2 = parseInt(document.getElementById("number2").value);

  return n1 + n2;
}
