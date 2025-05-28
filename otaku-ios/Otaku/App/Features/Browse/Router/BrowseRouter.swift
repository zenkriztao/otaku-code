//
//  BrowseRouter.swift
//  iosApp
//
//    on 1/1/22.
//  Copyright © 2022 . All rights reserved.
//

import SwiftUI

struct BrowseRouter {
  private let asssembler: Assembler

  init(asssembler: Assembler) {
    self.asssembler = asssembler
  }

  @MainActor func routeToBrowse() -> some View {
    BrowsePageView(navigator: self)
  }

  @MainActor func routeToDetail(mangaId: String) -> some View {
    let navigator: DetailRouter = asssembler.resolve()
    return navigator.routeToDetail(mangaId: mangaId)
  }

  @MainActor func routeToSearch() -> some View {
    let navigator: SearchRouter = asssembler.resolve()
    return navigator.routeToSearch()
  }
}


