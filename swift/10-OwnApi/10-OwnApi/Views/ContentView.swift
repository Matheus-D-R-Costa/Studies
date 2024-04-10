//
//  ContentView.swift
//  10-OwnApi
//
//  Created by Turma21-02 on 10/04/24.
//

import SwiftUI

struct ContentView: View {
    @StateObject var viewModel = ViewModel()
    var body: some View {
        NavigationStack {
            VStack {
                AsyncImage(url: URL(string : "https://img.freepik.com/free-photo/empty-parking-lot_1127-3299.jpg"), content: {
                    image in image
                        .resizable()
                        .blur(radius: 5)
                        .aspectRatio(contentMode: .fill)
                }, placeholder: {ProgressView()}).ignoresSafeArea()
                ScrollView {
                    ForEach(viewModel.parkingPlace, id: \.self) { Parking in NavigationLink(destination: )}
                }
            }
        }
    }
}

#Preview {
    ContentView()
}
