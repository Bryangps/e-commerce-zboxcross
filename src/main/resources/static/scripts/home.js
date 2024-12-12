//Formataçao dinheiro
function formatarDinheiro(input) {
   
    let valor = input.value.replace(/\D/g, '');
    valor = (Number(valor) / 100).toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    input.value = valor;
}

//navegação
var containerPrincipal = document.getElementById('container-principal');
var containerCadastro = document.getElementById('container-cadastro');
var containerVendas = document.getElementById('container-vendas');
var containerEstoque = document.getElementById('container-estoque');
var containerPagamento = document.getElementById('container-pagamento');
var containerPendente = document.getElementById('container-pendente');
var containerEfetuado = document.getElementById('container-efetuado');
var containerBusca = document.getElementById('container-busca');
var containerTVendas = document.getElementById('container-tvendas');

var botaoCBebidas= document.getElementById('c-bebidas');
var botaoVBebidas= document.getElementById('v-bebidas');
var botaoPagto= document.getElementById('pagto');
var botaoPagtoP= document.getElementById('pagto-p');
var botaoPagtoE= document.getElementById('pagto-e');
var botaoBuscaC= document.getElementById('busca-c');
var botaoTodasV= document.getElementById('todas-v');
var botaoEstoqueB= document.getElementById('estoque-b');
var hamburgerMenu= document.getElementById('hamburger-menu');
var closeMenu= document.getElementById('close-menu');
var navigationHome= document.getElementById('navigation-home');

function toggleNav(){
    navigationHome.style.display = 'block';
    hamburgerMenu.style.display = 'none';
    closeMenu.style.display = 'block';
}

function closeNav(){
    navigationHome.style.display = 'none';
    hamburgerMenu.style.display = 'block';
    closeMenu.style.display = 'none';
}
function closeNav2() {
    if (window.matchMedia("(max-width: 1024px)").matches) {
        closeNav();
    }
}

function Close(){
    containerPrincipal.style.display = 'block';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    
}

function cadastroBebidas(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'block';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-highlight)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-highlight)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function vendasBebidas(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'block';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-highlight)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-highlight)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function Estoque(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'block';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-highlight)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-highlight)';
    closeNav2();
}

function Pagamento(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'block';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-highlight)';
    botaoPagto.style.borderBottom = '2px solid var(--color-highlight)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function Pendente(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'block';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-highlight)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-highlight)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function Efetuado(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'block';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'none';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-highlight)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-highlight)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function Busca(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'block';
    containerTVendas.style.display = 'none';
    
    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-highlight)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-highlight)';
    botaoTodasV.style.color = 'var(--color-text)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-text)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}

function TVendas(){
    containerPrincipal.style.display = 'none';
    containerVendas.style.display = 'none';
    containerEstoque.style.display = 'none';
    containerPagamento.style.display = 'none';
    containerCadastro.style.display = 'none';
    containerPendente.style.display = 'none';
    containerEfetuado.style.display = 'none';
    containerBusca.style.display = 'none';
    containerTVendas.style.display = 'block';

    botaoCBebidas.style.color = 'var(--color-text)';
    botaoCBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoVBebidas.style.color = 'var(--color-text)';
    botaoVBebidas.style.borderBottom = '2px solid var(--color-text)';
    botaoPagto.style.color = 'var(--color-text)';
    botaoPagto.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoP.style.color = 'var(--color-text)';
    botaoPagtoP.style.borderBottom = '2px solid var(--color-text)';
    botaoPagtoE.style.color = 'var(--color-text)';
    botaoPagtoE.style.borderBottom = '2px solid var(--color-text)';
    botaoBuscaC.style.color = 'var(--color-text)';
    botaoBuscaC.style.borderBottom = '2px solid var(--color-text)';
    botaoTodasV.style.color = 'var(--color-highlight)';
    botaoTodasV.style.borderBottom = '2px solid var(--color-highlight)';
    botaoEstoqueB.style.color = 'var(--color-text)';
    botaoEstoqueB.style.borderBottom = '2px solid var(--color-text)';
    closeNav2();
}
//Alerta sair da conta
function alertLogout(){
    if (!confirm('Tem certeza que deseja sair da sua conta?')) {
        event.preventDefault();
    }
}

//funçao submete o formulário e limpa o formulário sem recarregar a página. Permitindo que o usuario continue cadastrando. Emite alerta de cadastro efetuado no cadastro de produtos e venda confirmada no formulario de vendas.
function submitForm(event) {
    event.preventDefault(); 
    document.getElementById("form-cadastrob").reset();
    alert('Cadastro efetuado com sucesso!')
}

function submitVenda(){
    event.preventDefault(); 
    document.getElementById("form-venda").reset();
    alert('Venda confirmada!');
}

