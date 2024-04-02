//
//  ContentView.swift
//  aula03-D2
//
//  Created by Turma21-02 on 02/04/24.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationStack {
        ZStack{
            Color("strangePurple")
                VStack {
                    Image("familyguy")
                        .resizable()
                        .frame(width: 360, height: 130)
                    
                    Spacer()
                    
                    NavigationLink(destination: PeterView()) {
                        Text("Peter Griffin")
                            .font(.title)
                            .foregroundColor(.white)
                            .padding()
                            .cornerRadius(8)
                    }
                    .buttonStyle(.bordered)
                    .tint(.pink)
                    
                    NavigationLink(destination: LoisView()) {
                        Text("Lois Griffin")
                            .font(.title)
                            .foregroundColor(.white)
                            .padding()
                            .cornerRadius(8)
                    }
                    .buttonStyle(.bordered)
                    .tint(.pink)
                    
                    NavigationLink(destination: BrainView()) {
                        Text("Brain Griffin")
                            .font(.title)
                            .foregroundColor(.white)
                            .padding()
                            .cornerRadius(8)
                    }
                    .buttonStyle(.bordered)
                    .tint(.pink)
                    
                    
                    Button("Sons") {
                        /*@START_MENU_TOKEN@*//*@PLACEHOLDER=Action@*/ /*@END_MENU_TOKEN@*/
                    }
                    .buttonStyle(.bordered)
                    .tint(.pink)
                }
                .padding(.bottom, 300.0)
            }
        }
    }
}

#Preview {
    ContentView()
}
