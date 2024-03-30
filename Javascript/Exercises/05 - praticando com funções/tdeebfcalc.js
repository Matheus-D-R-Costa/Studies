class Main {
    constructor () {
    this.weight = 80
    this.height = 182
    this.age = 19
    this.physicalActivityFactor = 'high'
    this.tbm = 0
    }
   
    imcCalculator () {
        const imc = this.weight / (Math.pow(this.height, 2))
        return imc
    }

    tbmCalculator () {
        this.tbm = 66 + 13.7 * this.weight + 5 * this.height - 6.8 * this.age
        return this.tbm
    }

    tdeeCalculator () {
        if (this.physicalActivityFactor === 'sedentary') {
            const tdee = this.tbm * 1.2
            return console.log('Sua taxa metábolica é de:' + tdee + 'kcals')
        } else if (this.physicalActivityFactor === 'light') {
            const tdee = this.tbm * 1.375
            return console.log('Sua taxa metábolica é de:' + tdee + 'kcals')
        } else if (this.physicalActivityFactor === 'moderate') {
            const tdee = this.tbm * 1.55
            return console.log('Sua taxa metábolica é de:' + tdee + 'kcals')
        } else if (this.physicalActivityFactor === 'high') {
            const tdee = this.tbm * 1.725
            return console.log('Sua taxa metábolica é de:' + tdee + 'kcals')
        } else if (this.physicalActivityFactor === 'very high') {
            const tdee = this.tbm * 1.9
            return console.log('Sua taxa metábolica é de:' + tdee + 'kcals')
        } else {
            return console.log('Invalid physical activity factor')
        }
    }
}

const mainInstance = new Main();
mainInstance.imcCalculator()
mainInstance.tbmCalculator()
mainInstance.tdeeCalculator()