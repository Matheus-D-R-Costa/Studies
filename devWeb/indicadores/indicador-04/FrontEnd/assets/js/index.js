document.addEventListener('DOMContentLoaded', async () => {
    const tabela = document.querySelector('#tabelaRegistros tbody');

    try {
        const response = await fetch('http://localhost:8080/pessoas');
        const data = await response.json();

        tabela.innerHTML = data.map((pessoa) => `
            <tr>
                <td>${pessoa.id}</td>
                <td>${pessoa.nome}</td>
                <td>${pessoa.email}</td>
                <td>${pessoa.telefone}</td>
                <td>${pessoa.endereco}</td>
                <td>${pessoa.ativo}</td>
                <td class="text-center">
                    <button class="btn btn-warning btn-sm" onclick="redirecionarEdicao(${pessoa.id})">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="excluirCarro(${pessoa.id})">Excluir</button>
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
    if (confirm('Tem certeza que deseja excluir esta pessoa?')) {
        try {
            const response = await fetch(`http://localhost:8080/pessoas/${id}`, { method: 'DELETE' });
            if (response.ok) {
                alert('pessoa excluída com sucesso!');
                window.location.reload();
            } else {
                alert('Erro ao excluir a pessoa.');
            }
        } catch (error) {
            console.error('Erro ao excluir a pessoa:', error);
            alert('Erro ao conectar ao servidor.');
        }
    }
}
