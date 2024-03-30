class Store {

    price = [139.99, 120.30, 259.00, 399.00, 130.00]

    product = {
        maxSteel: this.price[0],
        mochila: this.price[1],
        moleton: this.price[2],
        mafia2UltimateEdition: this.price[3],
        trembolona150mg: this.price[4]
    }

    paymentMethods = {
        aVistaDebito: 0.90,
        aVistaDinheiro: 0.85,
        emDuasVezes: 1.00,
        acimaDuasVezes: 1.10

    }

    choosePaymentMethods = function (product, payWith) {
        if (payWith === 'Débito' || payWith === 'Debito') {
            const finalPrice = product * this.paymentMethods.aVistaDebito
            console.log('Seu produto de ' + product + ' Custará agora ' + finalPrice)
        } else if (payWith === 'Dinheiro' || payWith === 'Boleto') {
            const finalPrice = product * this.paymentMethods.aVistaDinheiro
            console.log('Seu produto de ' + product + ' Custará agora ' + finalPrice)
        } else if (payWith === 'duas vezes' || payWith === 'credito2x') {
            const finalPrice = product * this.paymentMethods.emDuasVezes
            console.log('Seu produto de ' + product + ' Custará agora ' + finalPrice)
        } else if (payWith === 'Acima de duas vezes' || payWith === 'Acima de 2x') {
            const finalPrice = product * this.paymentMethods.acimaDuasVezes
            console.log('Seu produto de ' + product + ' Custará agora ' + finalPrice)
        } else {
            console.log('Formato de pagamento inválido')
        }
    }
}

const MyStore = new Store()
MyStore.choosePaymentMethods(MyStore.product.mafia2UltimateEdition, 'Acima de 2x')