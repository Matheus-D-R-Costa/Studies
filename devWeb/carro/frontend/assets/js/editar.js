document.addEventListener('DOMContentLoaded', async () => {
    const form = document.getElementById('formulario');
    const urlParams = new URLSearchParams(window.location.search);
    const id = urlParams.get('id');

    if (!id) {
        alert('ID não fornecido!');
        window.location.href = 'index.html';
    }

    // Preenche os campos com os dados existentes
    try {
        const response = await fetch(`http://localhost:8080/carros/${id}`);
        if (response.ok) {
            const data = await response.json();
            form.id.valueOf = data.id;
            form.marca.value = data.marca;
            form.modelo.value = data.modelo;
            form.ano.value = data.ano;
            form.cor.value = data.cor;
        } else {
            alert('Erro ao carregar os dados do carro.');
            window.location.href = 'index.html';
        }
    } catch (error) {
        console.error('Erro:', error);
        alert('Erro ao conectar ao servidor.');
        window.location.href = 'index.html';
    }

    // Submete as alterações
    form.addEventListener('submit', async (event) => {
        event.preventDefault();

        const formData = {
            id: form.id.value,
            marca: form.marca.value,
            modelo: form.modelo.value,
            ano: form.ano.value,
            cor: form.cor.value
        };

        try {
            const response = await fetch(`http://localhost:8080/carros/${id}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(formData)
            });

            if (response.ok) {
                alert('Carro atualizado com sucesso!');
                window.location.href = 'index.html';
            } else {
                const error = await response.json();
                alert(`Erro ao atualizar: ${error.message || 'Verifique os dados'}`);
            }
        } catch (error) {
            console.error('Erro:', error);
            alert('Erro ao conectar ao servidor.');
        }
    });
});
