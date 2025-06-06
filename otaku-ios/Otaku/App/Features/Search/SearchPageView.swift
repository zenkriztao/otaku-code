//
//  SearchPageView.swift
//  iosApp
//
//    on 24/07/21.
// 
//

import SwiftUI
import Shared
import KMMViewModelSwiftUI

struct SearchPageView: View {
  let navigator: SearchRouter
  
  @StateViewModel var viewModel: SearchViewModel
  @State var searchQuery: String = ""
  
  private var viewState: SearchState {
    viewModel.state
  }
  
  var body: some View {
    VStack {
      if viewState.isEmpty {
        Text("Result Not Found, Search Something Else :)")
          .foregroundColor(.black)
          .font(.custom(.sedgwickave, size: 60))
          .multilineTextAlignment(.center)
        
      } else {
        ScrollView(showsIndicators: false) {
          LazyVGrid(columns: [
            GridItem(.adaptive(minimum: 90), spacing: 25, alignment: .center)
          ], alignment: .leading, spacing: 10) {
            
            if viewState.isLoading {
              ForEach(0..<12) { _ in
                ShimmerSearchView()
              }
              
            } else {
              ForEach(viewState.mangas, id: \.id) { manga in
                NavigationLink(destination: navigator.routeToDetail(mangaId: manga.id)) {
                  SearchRow(manga: manga)
                }.buttonStyle(PlainButtonStyle())
              }
              
            }
            
          }.padding(.horizontal, 30)
            .padding(.top, 20)
          
          Spacer(minLength: 250)
          
        }
      }
    }
    .navigationTitle("Search")
    .searchable(text: $searchQuery, placement: .navigationBarDrawer(displayMode: .always))
    .autocapitalization(.none)
    .disableAutocorrection(true)
    .onChange(of: searchQuery) { query in
      viewModel.onTriggerEvent(event: SearchEvent.GetMangas(query: query))
    }
    .onSubmit(of: .search) {
      viewModel.onTriggerEvent(event: SearchEvent.GetMangas(query: searchQuery.isEmpty ? "naruto" : searchQuery))
    }
  }
}
