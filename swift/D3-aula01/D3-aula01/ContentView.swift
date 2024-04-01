//
//  ContentView.swift
//  D3-aula01
//
//  Created by Turma21-02 on 28/03/24.
//

import SwiftUI

struct ContentView: View {
    @State private var name: String = "Fulano"
    @State private var showingAlert = false
    
    
    var body: some View {
        ZStack {
            Image("galaxy")
                .resizable()
                .ignoresSafeArea()
                .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height)
                .blur(radius: /*@START_MENU_TOKEN@*/3.0/*@END_MENU_TOKEN@*/)
                
                
            
            VStack{
                
                VStack(alignment: .center){
                    Text("Destrua o universo, \(name)").font(.title).fontWeight(.bold).foregroundColor(Color.white).lineLimit(0)
                    
                    TextField("Enter your name", text: $name)
                        .multilineTextAlignment(.center)
                        .foregroundColor(Color.gray)
                        
                        
                }
                
                Spacer()
                    
                
                VStack{
                    Button("Destruir") {
                        showingAlert = true
                    }
                    
                    .alert("Você destruiu o universo!!!", isPresented: $showingAlert) {
                                Button("OK", role: .cancel) { }
                    }
                }
            }
        }
        
        .padding()
    }
}

#Preview {
    ContentView()
}
