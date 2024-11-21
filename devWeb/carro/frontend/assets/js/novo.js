document.getElementById('formulario').addEventListener('submit', async (event) => {
    event.preventDefault(); // Evita envio padrão

    const form = event.target;
    const formData = {
        marca: form.marca.value,
        modelo: form.modelo.value,
        ano: form.ano.value,
        cor: form.cor.value
    };

    try {
        const response = await fetch('http://localhost:8080/carros', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });

        if (response.ok) {
            alert('Carro cadastrado com sucesso!');
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
