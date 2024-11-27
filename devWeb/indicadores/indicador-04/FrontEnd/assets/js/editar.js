const form = document.getElementById('formulario');
const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

document.addEventListener('DOMContentLoaded', async () => {

    try {
        const response = await fetch(`http://localhost:8080/pessoas/${id}`);
        if (response.ok) {
            const pessoa = await response.json();
            document.getElementById('nome').value = pessoa.nome;
            document.getElementById('email').value = pessoa.email;
            document.getElementById('telefone').value = pessoa.telefone;
            document.getElementById('endereco').value = pessoa.endereco;
            document.getElementById('ativo').checked = pessoa.ativo;
        } else {
            alert('Erro ao carregar dados da pessoa.');
        }
    } catch (error) {
        console.error('Erro ao carregar dados da pessoa:', error);
        alert('Erro ao conectar ao servidor.');
    }

});

document.getElementById('formulario').addEventListener('submit', async (event) => {
    event.preventDefault(); // Evita envio padrão

    const formData = {
        nome: form.nome.value,
        email: form.email.value,
        telefone: form.telefone.value,
        endereco: form.endereco.value,
        ativo: form.ativo.checked
    };

    console.log(formData);

    try {
        const response = await fetch(`http://localhost:8080/pessoas/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });

        if (response.ok) {
            alert('Pessoa editada com sucesso!');
            window.location.href = 'index.html';
        } else {
            const error = await response.json();
            alert(`Erro: ${error.message || 'Erro desconhecido.'}`);
        }
    } catch (err) {
        console.error(err);
        alert('Erro ao conectar ao servidor.');
    }
});
