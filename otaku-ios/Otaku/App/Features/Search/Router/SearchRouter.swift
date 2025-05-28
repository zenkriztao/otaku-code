//
//  SearchRouter.swift
//  iosApp
//
//    on 1/1/22.
//  Copyright © 2022 . All rights reserved.
//

import SwiftUI

struct SearchRouter {

  private let assembler: Assembler

  init(assembler: Assembler) {
    self.assembler = assembler
  }

  @MainActor func routeToSearch() -> some View {
    SearchPageView(navigator: self, viewModel: assembler.resolve())
  }

  @MainActor func routeToDetail(mangaId: String) -> some View {
    let navigator: DetailRouter = assembler.resolve()
    return navigator.routeToDetail(mangaId: mangaId)
  }
}
