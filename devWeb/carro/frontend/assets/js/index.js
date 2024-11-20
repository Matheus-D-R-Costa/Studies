document.addEventListener('DOMContentLoaded', async () => {
    const tabela = document.querySelector('#tabelaRegistros tbody');

    try {
        const response = await fetch('http://localhost:8080/carros');
        const data = await response.json();

        tabela.innerHTML = data.map((carro) => `
            <tr>
                <td>${carro.id}</td>
                <td>${carro.marca}</td>
                <td>${carro.modelo}</td>
                <td>${carro.ano}</td>
                <td>${carro.cor}</td>
                <td class="text-center">
                    <button class="btn btn-warning btn-sm" onclick="editarCarro(${carro.id})">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="excluirCarro(${carro.id})">Excluir</button>
                </td>
            </tr>
        `).join('');
    } catch (error) {
        console.error('Erro ao carregar a lista:', error);
        tabela.innerHTML = '<tr><td colspan="6" class="text-center">Erro ao carregar dados.</td></tr>';
    }
})

function redirecionarEdicao(id) {
    window.location.href = './editar.html?id='+id;
}

async function excluirCarro(id) {
    if (confirm('Tem certeza que deseja excluir este carro?')) {
        try {
            const response = await fetch(`http://localhost:8080/carros/${id}`, { method: 'DELETE' });
            if (response.ok) {
                alert('Carro excluído com sucesso!');
                window.location.reload();
            } else {
                alert('Erro ao excluir carro.');
            }
        } catch (error) {
            console.error('Erro ao excluir carro:', error);
            alert('Erro ao conectar ao servidor.');
        }
    }
}
