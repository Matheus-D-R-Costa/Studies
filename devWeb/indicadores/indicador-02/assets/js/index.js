const removeButton = document.getElementById("btn-remove")

removeButton.addEventListener("click", removeRow);

function removeRow() {

  const confirmRemoval = confirm("Deseja remover esse registro?");

  if (confirmRemoval) {

    const row = this.closest('tr');
    row.remove();
  }
  
}

