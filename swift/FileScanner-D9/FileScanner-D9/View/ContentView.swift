//
//  ContentView.swift
//  FileScanner-D9
//
//  Created by Turma21-02 on 08/04/24.
//

import SwiftUI

struct ContentView: View {
    @ObservedObject var searchObjetcs = SearchObjects.shared
    
    var body: some View {
        List {
            ForEach(searchObjetcs.results, id: \.id, content: {
                result in
                Text(result.description ?? "empty")
            })
        }.onAppear() {
            searchObjetcs.search()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
