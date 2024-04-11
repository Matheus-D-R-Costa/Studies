//
//  CarView.swift
//  10-OwnApi
//
//  Created by Turma21-02 on 10/04/24.
//

import SwiftUI

struct CarView: View {
  var park: Parking
  var body: some View {
    ZStack {

      AsyncImage(
        url: URL(
          string:
            "https://images.rawpixel.com/image_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA4L3Jhd3BpeGVsb2ZmaWNlM19kaWdpdGFsX3BhaW50X2lsbHVzdHJhdGlvbl9zY2VuZV9vZl90cm9waWNhbF9mb18yNTc1MmM1Yi02YTQ5LTQzNDctYjYwMi05MDA3ZjA4ZGNmNzRfMS5qcGc.jpg"
        ), content: { image in image.resizable() }, placeholder: { ProgressView() }
      )
      .ignoresSafeArea()
      .aspectRatio(contentMode: .fill)
      .blur(radius: 10)

      VStack {
        AsyncImage(
          url: URL(string: park.cars[0].image ?? ""),
          content: { image in image.resizable().scaledToFill() }, placeholder: { ProgressView() }
        ).frame(width: 250, height: 250).background(.gray).clipShape(Circle()).padding(10)
          
          Text(park.cars[0].model)
              .foregroundStyle(.white)
              .bold()
          
          Text(park.cars[0].year)
              .foregroundStyle(.white)
              .bold()
          
          Text(park.cars[0].color)
              .foregroundStyle(.white)
              .bold()
          
          Text(park.cars[0].owner)
              .foregroundStyle(.white)
              .bold()
          
          Text("Parked in \(park.parkingName)")
              .foregroundStyle(.white)
              .bold()
      }
    }
  }
}
