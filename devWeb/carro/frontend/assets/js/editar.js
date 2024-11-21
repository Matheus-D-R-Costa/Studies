const form = document.getElementById('formulario');
const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

document.addEventListener('DOMContentLoaded', async () => {

    try {
        const response = await fetch(`http://localhost:8080/carros/${id}`);
        if (response.ok) {
            const carro = await response.json();
            document.getElementById('marca').value = carro.marca;
            document.getElementById('modelo').value = carro.modelo;
            document.getElementById('ano').value = carro.ano;
            document.getElementById('cor').value = carro.cor;
        } else {
            alert('Erro ao carregar dados do carro.');
        }
    } catch (error) {
        console.error('Erro ao carregar dados do carro:', error);
        alert('Erro ao conectar ao servidor.');
    }

});

document.getElementById('formulario').addEventListener('submit', async (event) => {
    event.preventDefault(); // Evita envio padrão

    const formData = {
        marca: form.marca.value,
        modelo: form.modelo.value,
        ano: form.ano.value,
        cor: form.cor.value
    };

    console.log(formData);

    try {
        const response = await fetch(`http://localhost:8080/carros/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });

        if (response.ok) {
            alert('Carro editado com sucesso!');
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
