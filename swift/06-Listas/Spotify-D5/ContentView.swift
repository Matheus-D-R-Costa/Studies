//
//  ContentView.swift
//  Spotify-D5
//
//  Created by Turma21-02 on 03/04/24.
//

import SwiftUI

struct Song : Identifiable {
    var id: Int
    var cover: String
    var name: String
    var artist: String
}

struct ContentView: View {
    var Songs = [
        Song(id: 1, cover: "https://i.scdn.co/image/ab67616d00001e0281eae9a98487ae512df29469", name: "Baby Come Back", artist: "Player"),
        Song(id: 2, cover: "https://i.scdn.co/image/ab67616d0000b2736ebfd029f2a8973cabba0766", name: "Be Alright", artist: "Zapp"),
        Song(id: 3, cover: "https://i.scdn.co/image/ab67616d0000b273de437d960dda1ac0a3586d97", name: "Billie Jean", artist: "Michael Jackson"),
        Song(id: 4, cover: "https://i.scdn.co/image/ab67616d0000b27386e5468d84ed66f06d9a799e", name: "Blame It on the Boogie", artist: "The Jacksons"),
        Song(id: 5, cover: "https://i.scdn.co/image/ab67616d0000b273887b7c596249f628db6c6473", name: "Celebration", artist: "Kool & The Gang"),
        Song(id: 6, cover: "https://i.scdn.co/image/ab67616d0000b27332b79ef6568ef7eccac968a6", name: "Do It Roger", artist: "Zapp"),
        Song(id: 7, cover: "https://i.scdn.co/image/ab67616d0000b2737027294551db4fda68b5ddac", name: "Don't Stop 'Til You Get Enough", artist: "Michael Jackson"),
        Song(id: 8, cover: "https://i.scdn.co/image/ab67616d0000b2737f29399efc7ee01e8c56936d", name: "Get Down On It - Single Version", artist: "Kool & The Gang"),
        Song(id: 9, cover: "https://i.scdn.co/image/ab67616d0000b2734c614878cb234061701cac6c", name: "A House Is Not a Home", artist: "Luther Vandross"),
        Song(id: 10, cover: "https://i.scdn.co/image/ab67616d0000b273de437d960dda1ac0a3586d97", name: "Human Nature", artist: "Michael Jackson"),
        Song(id: 11, cover: "https://i.scdn.co/image/ab67616d0000b273039b95b846d039d78a2ca6a1", name: "I Wanna Be Your Lover", artist: "Prince"),
        Song(id: 12, cover: "https://i.scdn.co/image/ab67616d0000b273cc57e9b00b87dd0f6e868347", name: "I Wanna Dance with somebody (Who Loves Me)", artist: "Whitney Houston")

    ]
    
    var body: some View {
        NavigationStack {
            ZStack {
                LinearGradient(colors: [.black, .cyan],
                               startPoint: .center,
                               endPoint: .bottom)
                .edgesIgnoringSafeArea(.top)
                VStack  {
                    Image("cape")
                        .resizable()
                        .frame( width: 250, height: 250)
                    
                    Text("The G.O.T.S of 80s")
                        .font(.title)
                        .fontWeight(.bold)
                        .foregroundColor(Color.white)
                        .multilineTextAlignment(.center)
                        .padding(.trailing)
                    
                    HStack {
                        Image("cape")
                            .resizable()
                            .frame( width: 30, height: 30)
                        Text("Play a song")
                            .font(.title3)
                            .fontWeight(.bold)
                            .foregroundColor(Color.white)
                    }.padding(.trailing, 110.0)
                    
                    ScrollView{
                        VStack {
                            ForEach(Songs) { Play in
                                HStack {
                                    NavigationLink(destination: PlayerView(song: Play)){
                                        AsyncImage(url: URL(string:"\(Play.cover)")) { phase in
                                            switch phase {
                                            case .empty:
                                                ProgressView()
                                            case .success(let image):
                                                image.resizable()
                                                    .clipShape(Rectangle())
                                                    .frame(maxWidth: 50, maxHeight: 50)
                                                    .padding(.leading)
                                            case .failure:
                                                Image(systemName: "photo")
                                                
                                            @unknown default:
                                                
                                                EmptyView()
                                            }
                                            VStack{
                                                NavigationLink(destination: PlayerView(song: Play)){
                                                    Text(Play.name).foregroundColor(.white).padding(.bottom, -3.0).frame(maxWidth: .infinity, alignment: .leading).overlay(
                                                        Text("...").foregroundColor(.white)
                                                            .padding(.trailing)
                                                            .frame(maxWidth: .infinity, alignment: .trailing).font(.system(size: 30))
                                                    )
                                                }
                                                NavigationLink(destination: PlayerView(song: Play)){
                                                    Text(Play.artist).foregroundColor(.white)
                                                        .frame(maxWidth: .infinity, alignment: .leading)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                .padding(.top, 30.0)
                
            }
        }
    }
}

#Preview {
    ContentView()
}
