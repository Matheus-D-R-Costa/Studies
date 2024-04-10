//
//  ContentView.swift
//  aula03
//
//  Created by Turma21-02 on 02/04/24.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        TabView {
            ZStack{
                Color(.red)
                Image(systemName: "flame")
                    .resizable()
                    .foregroundColor(Color.orange)
                    .frame(width: 250, height: 250)
            }
                .tabItem {
                    Image(systemName: "flame")
                    Text("Fire")
                }
            ZStack{
                Color(.green)
                Image(systemName: "tornado")
                    .resizable()
                    .foregroundColor(Color.gray)
                    .frame(width: 250, height: 250)
            }
                .tabItem {
                    Image(systemName: "tornado")
                    Text("Tornado")
                }
            ZStack{
                Color(.cyan)
                Image(systemName: "cloud.bolt.rain")
                    .resizable()
                    .foregroundColor(Color.blue)
                    .frame(width: 250, height: 250)
            }
                .tabItem {
                    Image(systemName: "cloud.bolt.rain")
                    Text("Water")
                }
            VStack {
                Text("Catastrophes List")
                    .font(.title)
                    .fontWeight(.black)
                Form {
                    Text("fire")
                    Text("Tornado")
                    Text("Water")
                }
            }
               
                .tabItem {
                    Image(systemName: "list.bullet")
                    Text("catastrophes")
                }
        }
    }
}

#Preview {
    ContentView()
}
