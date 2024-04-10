//
//  CarView.swift
//  10-OwnApi
//
//  Created by Turma21-02 on 10/04/24.
//

import SwiftUI

struct CarView: View {
    var park : Parking
    var body: some View {
        ZStack {
            AsyncImage(url: URL(string: "https://images.rawpixel.com/image_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA4L3Jhd3BpeGVsb2ZmaWNlM19kaWdpdGFsX3BhaW50X2lsbHVzdHJhdGlvbl9zY2VuZV9vZl90cm9waWNhbF9mb18yNTc1MmM1Yi02YTQ5LTQzNDctYjYwMi05MDA3ZjA4ZGNmNzRfMS5qcGc.jpg") content : {})
        }
    }
}

#Preview {
    CarView()
}
