const buttonSum = document.getElementById("btn-sum");
const buttonReset = document.getElementById("btn-reset");

buttonSum.addEventListener('click', displayResult);
buttonReset.addEventListener('click', resetFields);


function displayResult() {
  const result = sum();
  const HTMLResult = document.getElementById("resultado");
  HTMLResult.innerHTML = result;
}

function sum() {
  const number1 = document.getElementById("number1").value;
  const number2 = document.getElementById("number2").value;

  if (number1.trim() === '' && number2.trim() === '') return "Por favor, preencha os dois campos.";
  if (number1.trim() === '') return "O campo do primeiro número está vazio.";
  if (number2.trim() === '') return "O campo do segundo número está vazio.";

  const n1 = parseFloat(number1);
  const n2 = parseFloat(number2);

  if (isNaN(n1)) return "O primeiro valor não é um número válido.";
  if (isNaN(n2)) return "O segundo valor não é um número válido.";

  return n1 + n2;

}

function resetFields() {
  document.getElementById("number1").value = '';
  document.getElementById("number2").value = '';
  document.getElementById("resultado").innerHTML = '';
}
