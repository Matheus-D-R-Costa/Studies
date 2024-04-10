//
//  PlayerView.swift
//  Spotify-D5
//
//  Created by Turma21-02 on 03/04/24.
//

import SwiftUI

struct PlayerView: View {
    @State var sliderValue: Double = 0
    var song: Song
    var body: some View {
        ZStack {
            LinearGradient(colors: [.black, .cyan],
                           startPoint: .center,
                           endPoint: .bottom)
            .edgesIgnoringSafeArea(.top)
            ScrollView{
                VStack{
                    Spacer()
                    AsyncImage(url: URL(string:"\(song.cover)")) { phase in
                        switch phase {
                        case .empty:
                            ProgressView()
                        case .success(let image):
                            image.resizable()
                                .clipShape(Rectangle())
                                .frame(maxWidth: 200, maxHeight: 200)
                                .padding([.leading, .bottom])
                                .padding(.top, 100.0)
                        case .failure:
                            Image(systemName: "photo")
                        @unknown default:
                            EmptyView()
                        }
                    }
                    Text(song.name).foregroundColor(.white).font(.title)
                    Text(song.artist).foregroundColor(.white).padding(.bottom, 100.0)
                    Slider(value: $sliderValue, in: 0...10)
                    Spacer()
                    HStack{
                        HStack{
                            Spacer()
                            Image(systemName: "shuffle").foregroundColor(.white)
                            Spacer()
                            Image(systemName: "backward.end.fill").foregroundColor(.white)
                        }
                        Image(systemName: "play.fill").foregroundColor(.white).padding(.horizontal, 25.0).font(.system(size: 65))
                        HStack{
                            Image(systemName: "forward.end.fill").foregroundColor(.white)
                            Spacer()
                            Image(systemName: "repeat").foregroundColor(.white)
                            Spacer()
                        }
                    }.font(.system(size:35))
                }
            }
        }
    }
    
    struct Player_Previews: PreviewProvider {
        static var previews: some View {
            PlayerView(song: Song(id: 0, cover: "https://hackatruck.com.br/images/2466", name: "aa", artist: "aw"))
        }
    }
}
