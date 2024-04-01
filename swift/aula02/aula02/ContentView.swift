import SwiftUI

struct ContentView: View {
    @State private var weight: Double = 0
    @State private var height: Double = 0
    @State private var imc: Double = 0
    
    func calculateIMC() {
        if height != 0 {
            imc = weight / (height * height)
        } else {
            imc = 0
        }
    }

    var body: some View {
        ZStack {
            Color("meia-noite")
            
            VStack {
                VStack {
                    Text("Calculadora IMC")
                        .font(.largeTitle)
                        .fontWeight(.black)
                        .foregroundColor(Color("gelo"))
                }
                
                VStack(alignment: .center) {
                    TextField(
                        "Insira seu peso",
                        value: $weight,
                        formatter: NumberFormatter()
                    )
                    .keyboardType(.numberPad)
                    .disableAutocorrection(true)
                    .multilineTextAlignment(.center)
                    
                    TextField(
                        "Insira sua altura",
                        value: $height,
                        formatter: NumberFormatter()
                    )
                    .keyboardType(.numberPad)
                    .disableAutocorrection(true)
                    .multilineTextAlignment(.center)
                }
                .padding(.horizontal, 100.0)
                .textFieldStyle(RoundedBorderTextFieldStyle())
                
                Button(action: {
                    calculateIMC()
                }, label: {
                    Text("Calcular")
                        .frame(width: 100, height: 35)
                    
                })
                .buttonStyle(BorderlessButtonStyle())
                .padding(.top, 30.0)
                
                Text(String(format: "IMC: %.2f", imc))
                    .foregroundColor(.white)
                    .padding()
                
                VStack {
                    Image("tabela-imc")
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
