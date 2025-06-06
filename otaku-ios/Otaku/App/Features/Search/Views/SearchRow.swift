//
//  SearchRow.swift
//  iosApp
//
//    on 14/09/21.
// 
//

import SwiftUI
import Shared
import SDWebImageSwiftUI

struct SearchRow: View {

  let manga: Manga

  var body: some View {
    WebImage(url: URL(string: manga.getPosterImage()))
      .resizable()
      .indicator(.activity)
      .frame(height: 140)
      .cornerRadius(8)
      .padding(.bottom, 20)
  }
}
