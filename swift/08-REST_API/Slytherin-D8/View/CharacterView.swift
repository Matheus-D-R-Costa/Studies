//
//  CharacterView.swift
//  Slytherin-D8
//
//  Created by Turma21-02 on 05/04/24.
//

import SwiftUI

struct CharacterView: View {
    var index: Characters
    
    var body: some View {
        
        ZStack{
            AsyncImage(url: URL(string: "https://cdn.awsli.com.br/2500x2500/2607/2607018/produto/226635258/harry-potter--slytherin-vkwc9l080o.png"), content: {image in image.resizable()}, placeholder: {ProgressView()})
                .ignoresSafeArea()
                .aspectRatio(contentMode: .fill)
                .blur(radius: 10)
            
            VStack {
                AsyncImage(url: URL(string: index.image!), content: {image in image.resizable().scaledToFill()},
                           placeholder: {ProgressView()}).frame(width: 250, height: 250).background(Color.gray)
                    .clipShape(Circle())
                    .padding(10)
                
                Text(index.house!)
                    .foregroundColor(.white)
                    .bold()
                
                Text(index.name!)
                    .foregroundColor(.white)
                    .bold()
                
                Text(index.dateOfBirth ?? "")
                    .foregroundColor(.white)
                    .bold()
                
                Text(index.ancestry!)
                    .foregroundColor(.white)
                    .bold()
                
                Spacer()
            }.padding(.top, 70)
                .ignoresSafeArea()
            
        }
    }
}

