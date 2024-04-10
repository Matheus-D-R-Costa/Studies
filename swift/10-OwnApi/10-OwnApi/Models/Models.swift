//
//  carParking.swift
//  10-OwnApi
//
//  Created by Turma21-02 on 10/04/24.
//

import Foundation

struct Parking : Decodable, Hashable {
    let parkingName : String
    let cars : [Car]
}

struct Car : Decodable, Hashable {
    let model : String
    let year : String
    let color : String
    let owner : String
    let image : String
}
