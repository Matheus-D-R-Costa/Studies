//
//  LoisView.swift
//  aula03-D2
//
//  Created by Turma21-02 on 02/04/24.
//

import SwiftUI

struct LoisView: View {
    var body: some View {
        ZStack{
            Color("strangePurple")
            VStack {
                Image("familyguy")
                    .resizable()
                    .frame(width: 360, height: 130)
                
                Spacer()
                
                Image("Lois")
                    .resizable()
                    .frame(width: 500, height: 400)
                    
        
                
            }
            .padding(.bottom, 200)
        }

    }
}

#Preview {
    LoisView()
}
