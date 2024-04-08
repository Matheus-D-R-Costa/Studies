//
//  ViewModel.swift
//  Slytherin-D8
//
//  Created by Turma21-02 on 05/04/24.
//

import Foundation

class ViewModel: ObservableObject {
    
    @Published var HarryPoter: [Characters] = []
    
    func fetch() {
        
        guard let url = URL(string: "https://hp-api.onrender.com/api/characters/house/Slytherin") else {
            return
        }
        
        let task = URLSession.shared.dataTask(with: url) { [weak self] data, _, error in
            
            guard let data = data, error == nil else {
                return
            }
            
            do{
                let parsed = try JSONDecoder().decode([Characters].self, from: data)
                DispatchQueue.main.async {
                    self?.HarryPoter = parsed
                }
            } catch {
                print(error)
            }
        }
        task.resume()
    }
    
}
