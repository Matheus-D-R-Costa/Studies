//
//  Model.swift
//  FileScanner-D9
//
//  Created by Turma21-02 on 08/04/24.
//

import Foundation

struct Results: Codable {
    let total: Int
    let results: [Result]
}

struct Result: Codable {
    let id: String
    let description: String?
    let urls: URLs
}

struct Location: Codable {
    let name: String?
    let city: String?
    let country: String?
}

struct URLs: Codable {
    let small: String?
}
