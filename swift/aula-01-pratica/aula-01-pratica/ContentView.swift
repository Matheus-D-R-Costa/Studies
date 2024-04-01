//
//  ContentView.swift
//  aula-01-pratica
//
//  Created by Turma21-02 on 28/03/24.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            
            HStack{
                Text("")
                    .frame(width: /*@START_MENU_TOKEN@*/100/*@END_MENU_TOKEN@*/, height: 100)
                    .background(Color.red)

                Spacer(minLength: /*@START_MENU_TOKEN@*/0/*@END_MENU_TOKEN@*/)
                
                Text("")
                    .frame(width: /*@START_MENU_TOKEN@*/100/*@END_MENU_TOKEN@*/, height: 100)
                    .background(Color.blue)
            }
            
            Spacer(minLength: /*@START_MENU_TOKEN@*/0/*@END_MENU_TOKEN@*/)
            
            HStack{
                Text("")
                    .frame(width: /*@START_MENU_TOKEN@*/100/*@END_MENU_TOKEN@*/, height: 100)
                    .background(Color.green)

                Spacer(minLength: /*@START_MENU_TOKEN@*/0/*@END_MENU_TOKEN@*/)
                
                Text("")
                    .frame(width: /*@START_MENU_TOKEN@*/100/*@END_MENU_TOKEN@*/, height: 100)
                    .background(Color.yellow)
            }
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
