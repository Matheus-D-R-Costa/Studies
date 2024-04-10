//
//  ViewModel.swift
//  10-OwnApi
//
//  Created by Turma21-02 on 10/04/24.
//

import Foundation

class ViewModel : ObservableObject {
    @Published var parkingPlace : [Parking] = []
    
    func fetch() {
        guard let url = URL(string: "http://127.0.0.1:1880/park/show/cars")
        else {
            return
        }
        
        let task = URLSession.shared.dataTask(with: url) { [weak self]
            data, _, error in guard let data = data, error == nil else {
                return
            }
            
            do {
                let parsed = try JSONDecoder().decode([Parking].self, from: data)
                
                DispatchQueue.main.async {
                    self?.parkingPlace = parsed
                }
            } catch {
                print(error)
            }
        }
        task.resume()
    }
}
