//
//  SonsView.swift
//  aula03-D2
//
//  Created by Turma21-02 on 02/04/24.
//

import SwiftUI

struct SonsView: View {
    @State private var searchText = ""
    @State private var selectedCharacter: String?
    
    func chooseGriffin() {
        if (searchText == "Stiwie || stiwie") {
            NavigationLink(destination: StewieView()) {
                
            }
        }
    }
    var body: some View {
        NavigationStack {
            ZStack{

                VStack {
                    Image("familyguy")
                        .resizable()
                        .frame(width: 360, height: 130)
                    
                    Spacer()
                    
                    Text("Searching for \(searchText)")
                                   .navigationTitle("Seach for Griffins Sons")
                           }
                           .searchable(text: $searchText)
                    
                }
                .padding(.bottom, 200)
            }
            
        }
    }


#Preview {
    SonsView()
}
