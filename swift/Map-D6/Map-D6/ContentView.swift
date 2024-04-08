import SwiftUI
import MapKit

struct Location: Identifiable {
    let id = UUID()
    let name: String
    let coordinate: CLLocationCoordinate2D
    let flag: URL
    let description: String
}

struct ContentView: View {
    @State var actualLocation = "cavalo"
    @State var selectedLocation: Location?
    @State private var region = MKCoordinateRegion(center: CLLocationCoordinate2D(latitude: -15.7833, longitude: -140.7), span: MKCoordinateSpan(latitudeDelta: 10, longitudeDelta: 10))
    
    var body: some View {
        let locations = [
            Location(name: "Polinésia Francesa",
                     coordinate: CLLocationCoordinate2D(latitude: -17.6797, longitude: -149.4068),
                     flag: URL(string: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Flag_of_French_Polynesia.svg/255px-Flag_of_French_Polynesia.svg.png")!,
                     description: "A Polinésia Francesa é um arquipélago de tirar o fôlego no coração do oceano Pacífico...")
        ]
        
        VStack{
            Text("Mapa Mundial")
                .font(.largeTitle)
                .fontWeight(.bold)
            Text("\(actualLocation)")
        }
        .padding()
        .overlay(
            RoundedRectangle(cornerRadius: 16)
                .stroke(Color.gray, lineWidth: 3)
                .background(Color.gray.opacity(0.3))
        )
        
        Map(coordinateRegion: $region, interactionModes: .all, showsUserLocation: true, userTrackingMode: .constant(.follow), annotationItems: locations) { location in
            MapAnnotation(coordinate: location.coordinate) {
                Image(systemName: "mappin")
                    .foregroundColor(.red)
                    .onTapGesture {
                        selectedLocation = location
                    }
            }
        }
        .sheet(item: $selectedLocation) { location in
            InformationView(place: location)
        }
        
        ScrollView {
            HStack {
                ForEach(locations) { location in
                    Button(location.name) {
                        region.center = location.coordinate
                        actualLocation = location.name
                    }
                    .buttonStyle(.borderedProminent)
                    .controlSize(.large)
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
