//
//  File.swift
//  Slytherin-D8
//
//  Created by Turma21-02 on 05/04/24.
//

import Foundation

struct Characters: Codable,Identifiable {
    let id: String
    let name: String?
    let alternate_names: [String]?
    let species: String?
    let house: String?
    let dateOfBirth: String?
    let yearOfBirth: Int?
    let wizard: Bool?
    let ancestry: String?
    let eyeColor: String?
    let hairColor: String?
    let wand: Wand
    let patronus: String?
    let hogwartsStudent: Bool?
    let hogwartsStaff: Bool?
    let actor: String?
    let alternate_actors: [String?]
    let alive: Bool?
    let image: String?
}

struct Wand: Codable {
    let wood: String?
    let core: String?
    let lenght: Double?
}
