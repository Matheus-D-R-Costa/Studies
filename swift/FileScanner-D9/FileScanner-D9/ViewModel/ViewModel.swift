
import Foundation
import SwiftUI

class SearchObjects : ObservableObject {
    
    static let shared = SearchObjects()
    private init() {}
    
    var token = "Otf3RWOKTcm_3uMZ_k0qYzZrphOi_zAsmyzCcNEZxFI"
    @Published var results = [Result]()
    @Published var searchText : String = "flowers"
    
    func search() {
        let url = URL(string: "https://api.unsplash.com/search/photos?&query=\(searchText)")
        var request = URLRequest(url: url!)
        request.httpMethod = "GET"
        request.setValue("CLIENT-ID \(token)", forHTTPHeaderField: "Authorization")
        
        let task = URLSession.shared.dataTask(with: request) { (data, response, error) in guard
            let data = data else { return }
            do {
                let res = try JSONDecoder().decode(Results.self, from: data)
                self.results.append(contentsOf: res.results)
            } catch {
                print(error)
            }
        }
        task.resume()
    }
}
