//
//  DetailRouter.swift
//  iosApp
//
//    on 1/1/22.
//  Copyright © 2022 . All rights reserved.
//

import SwiftUI

struct DetailRouter {
  private let assembler: Assembler

  init(assembler: Assembler) {
    self.assembler = assembler
  }

  @MainActor func routeToDetail(mangaId: String) -> some View {
    DetailPageView(viewModel: assembler.resolve(), mangaViewModel: assembler.resolve(), mangaId: mangaId)
  }
}
