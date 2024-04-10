//
//  ContentView.swift
//  Slytherin-D8
//
//  Created by Turma21-02 on 05/04/24.
//

import SwiftUI

struct ContentView: View {
    
    @StateObject var viewModel = ViewModel()
    
    var body: some View {
        NavigationStack {
            ZStack {
                
                
                VStack {
                    HStack(alignment: .top) {
                        AsyncImage(url: URL(string: "https://cdn.awsli.com.br/2500x2500/2607/2607018/produto/226635258/harry-potter--slytherin-vkwc9l080o.png"), content: {Image in
                            Image.resizable().aspectRatio(contentMode: .fill)
                        }, placeholder: {ProgressView()})
                        .ignoresSafeArea().frame(width: 50, height: 50)
                        
                        Spacer()
                        
                        Text("Contatos").font(/*@START_MENU_TOKEN@*/.title/*@END_MENU_TOKEN@*/).fontWeight(.bold)
                        
                        Spacer()
                        
                        AsyncImage(url: URL(string: "https://cdn.awsli.com.br/2500x2500/2607/2607018/produto/226635258/harry-potter--slytherin-vkwc9l080o.png"), content: {Image in
                            Image.resizable().aspectRatio(contentMode: .fill)
                        }, placeholder: {ProgressView()}).padding(.trailing, 44.0)
                        .ignoresSafeArea().frame(width: 50, height: 50)
                        
                    
                    }
                    ScrollView{
                        ForEach(viewModel.HarryPoter) { index in
                            NavigationLink(destination: CharacterView(index: index)) {
                                HStack {
                                    AsyncImage(url: URL(string: index.image!), content: {image in image.resizable().scaledToFill()}, placeholder: {ProgressView()}).frame(width: 50, height: 50).background(Color.gray).clipShape(Circle()).padding(10)
                                    
                                    Text(index.name!).font(.title2).fontWeight(.semibold).foregroundColor(Color.black)
                                                                    
                                    Spacer()
                                }.border(Color.gray, width: 1, height: )
                            }
                        }
                    }
                }
                .onAppear() {
                    viewModel.fetch()
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
