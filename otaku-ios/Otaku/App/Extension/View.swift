//
//  View.swift
//  iosApp
//

//

import SwiftUI

extension View {
  func customDialog<DialogContent: View>(
    isShowing: Binding<Bool>,
    @ViewBuilder dialogContent: @escaping () -> DialogContent
  ) -> some View {
    self.modifier(CustomDialogView(isShowing: isShowing, dialogContent: dialogContent))
  }
}
