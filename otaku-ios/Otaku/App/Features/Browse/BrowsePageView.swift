//
//  BrowsePageView.swift
//  iosApp
//
//    on 24/07/21.
// 
//

import SwiftUI
import Shared
import KMMViewModelSwiftUI

struct BrowsePageView: View {

  @StateViewModel private var viewModel = BrowseViewModel()
  @State private var isLoaded = false
  let navigator: BrowseRouter

  private var viewState: BrowseState {
    viewModel.state
  }
  
  private let genres: [Genre] = [
    Genre(name: "Shonen", image: "imgShonen", query: "shonen", font: .sedgwickave),
    Genre(name: "Seinen", image: "imgSeinen", query: "seinen", font: .mashanzheng),
    Genre(name: "Shojo", image: "imgShojo", query: "shojo", font: .sedgwickave)
  ]

  var body: some View {
    ScrollView(.vertical, showsIndicators: false) {
      VStack(alignment: .leading) {
        Text("Genre")
          .font(.custom(.msemibold, size: 15))
          .padding(.horizontal, 17)

        ScrollView(.horizontal, showsIndicators: false) {
          HStack {
            ForEach(genres, id: \.id) { genre in
              GenreView(genre: genre)
            }
          }.padding(.leading, 13)
        }

        Text("Trending Now")
          .font(.custom(.msemibold, size: 15))
          .padding(.leading, 17)
          .padding(.top, 30)

        if viewState.isLoading {
          VStack {
            ForEach(0..<10) { _ in
              ShimmerBrowseView()
            }
          }
          .padding(.leading, 17)
          .padding(.trailing, 30)
          .padding(.bottom, 100)

        } else {
          VStack {
            ForEach(viewState.mangas, id: \.id) { manga in
              NavigationLink(destination: navigator.routeToDetail(mangaId: manga.id)) {
                MangaRow(manga: manga)
              }.buttonStyle(PlainButtonStyle())
            }
          }
          .padding(.leading, 17)
          .padding(.trailing, 30)
          .padding(.bottom, 100)
        }
      }.padding(.top, 30)
    }
    .navigationBarTitle("Browse")
    .navigationBarItems(
      trailing: NavigationLink(destination: navigator.routeToSearch()) {
        Image(systemName: "magnifyingglass")
          .resizable()
          .foregroundColor(.black)
          .frame(width: 20, height: 20)
      }
    )
    .onAppear {
      if !isLoaded {
        viewModel.onTriggerEvent(event: BrowseEvent.GetMangas())
        isLoaded = true
      }
    }
  }
}
