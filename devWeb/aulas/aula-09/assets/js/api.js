async function searchCEP() {
  const cep = document.getElementById("cep-input").value;

  if (!isValidCep(cep)) {
    alert("O cep inserido é inválido!")
    return
  }

  try {
    const result = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
    if (!result.ok) throw new Error("Erro ao buscar o CEP. Tente novamente.")

    const data = await result.json();

    if (data.erro) {
      alert("CEP não encontrado. Verifique e tente novamente.");
      return;
    }

    return data;

  } catch (error) {
    console.error("Erro:", error);
    alert("Ocorreu um erro ao buscar o CEP. Verifique sua conexão ou tente novamente.");
  }

}

function isValidCep(cep) {
  return !isNaN(cep) && cep.length === 8
}