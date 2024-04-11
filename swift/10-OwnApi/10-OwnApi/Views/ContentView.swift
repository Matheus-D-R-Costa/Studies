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
        AsyncImage(
          url: URL(string: "https://img.freepik.com/free-photo/empty-parking-lot_1127-3299.jpg"),
          content: {
            image in
            image
              .resizable()
              .blur(radius: 5)
              .aspectRatio(contentMode: .fill)
          }, placeholder: { ProgressView() }
        ).ignoresSafeArea()
        ScrollView {
          ForEach(viewModel.parkingPlace, id: \.self) { Parking in
            NavigationLink(destination: CarView(park: Parking)) {

              VStack {
                ForEach(Parking.cars, id: \.self) { car in
                  AsyncImage(
                    url: URL(string: car.image ?? ""),
                    content: {
                      image in
                      image
                        .resizable()
                        .scaledToFill()
                    }, placeholder: { ProgressView() }
                  )
                  .frame(width: 90, height: 90)
                  .background(Color.gray)
                  .clipShape( /*@START_MENU_TOKEN@*/Circle() /*@END_MENU_TOKEN@*/)
                  .padding(10)
                  Text(car.model)
                }

                Spacer()

              }
            }
          }
        }
      }
      .foregroundColor(.white)
      .ignoresSafeArea()
      .background(Color.gray)
    }
    preferredColorScheme(.dark).tint(.white).onAppear {
      viewModel.fetch()
    }
  }
}

struct ContentView_Previews: PreviewProvider {
  static var previews: some View {
    ContentView()
  }
}
