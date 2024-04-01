//
//  D2.swift
//  aula-01-pratica
//
//  Created by Turma21-02 on 28/03/24.
//

import SwiftUI

struct D2: View {
    var body: some View {
        HStack {
           Image("macaco")
                .resizable()
                .clipShape(/*@START_MENU_TOKEN@*/Circle()/*@END_MENU_TOKEN@*/)
                .scaledToFit()
                
            Spacer()
            
            VStack {
                Text("Vivo a 150 anos!")
                    .foregroundStyle(.red)
                Text("Silver Back")
                    .foregroundStyle(.blue)
                Text("Pai de pet")
                    .foregroundStyle(.yellow)
            }
        }
        .padding()
    }
}

#Preview {
    D2()
}
