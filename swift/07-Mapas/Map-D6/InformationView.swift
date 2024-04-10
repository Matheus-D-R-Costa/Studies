import SwiftUI
import MapKit

struct InformationView: View {
    var place: Location
    
    var body: some View {
        VStack {
            Text(place.name)
                .font(.title)
                .bold()
                .padding(.top)
            
            AsyncImage(url: place.flag) { phase in
                switch phase {
                case .empty:
                    ProgressView()
                case .success(let image):
                    image
                        .resizable()
                        .clipShape(Rectangle())
                        .frame(maxWidth: 80, maxHeight: 50)
                        .shadow(radius: 10)
                case .failure:
                    Image(systemName: "photo")
                @unknown default:
                    EmptyView()
                }
            }
            .frame(maxWidth: 80, maxHeight: 50)
            
            Text(place.description)
                .padding()
            
            Spacer()
        }
    }
}

struct InformationPreview_Previews: PreviewProvider {
    static var previews: some View {
        InformationView(place: Location(name: "Placeholder",
                                        coordinate: CLLocationCoordinate2D(latitude: -19.924557, longitude: -43.991597),
                                        flag: URL(string: "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Bandeira-de-Belo-Horizonte.svg/240px-Bandeira-de-Belo-Horizonte.svg.png")!,
                                        description: "Placeholder"))
    }
}
