const buttonSearch = document.getElementById("btn-search-cep");
const buttonCancel = document.getElementById("btn-cancel-search")

buttonSearch.addEventListener('click', displayCep)
buttonCancel.addEventListener('click', cancelFields)

async function displayCep() {
  const cepData = await searchCEP();
  updateEstado(cepData)
  updateCidade(cepData)
  updateBairro(cepData)
  updateLogradouro(cepData)
  updateComplemento(cepData)
}

function cancelFields() {
  document.getElementById("cep-input").value = '';
  document.getElementById("estado-input").value = '';
  document.getElementById("cidade-input").value = '';
  document.getElementById("bairro-input").value = '';
  document.getElementById("logradouro-input").value = '';
  document.getElementById("complemento-input").value = '';
}

function updateEstado(cepData) {
  document.getElementById("estado-input").value = cepData.uf || "-";
}

function updateCidade(cepData) {
  document.getElementById("cidade-input").value = cepData.localidade || "-";
}

function updateBairro(cepData) {
  document.getElementById("bairro-input").value = cepData.bairro || "-";
}

function updateLogradouro(cepData) {
  document.getElementById("logradouro-input").value = cepData.logradouro || "-";
}

function updateComplemento(cepData) {
  document.getElementById("complemento-input").value = cepData.complemento || "-";
}




