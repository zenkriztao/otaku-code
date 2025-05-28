//
//  CustomDialogView.swift
//  iosApp
//

//

import SwiftUI

struct CustomDialogView<DialogContent: View>: ViewModifier {
  @Binding var isShowing: Bool
  let dialogContent: DialogContent
  
  init(isShowing: Binding<Bool>, @ViewBuilder dialogContent: () -> DialogContent) {
    self._isShowing = isShowing
    self.dialogContent = dialogContent()
  }
  
  func body(content: Content) -> some View {
    ZStack {
      content
      if isShowing {
        ZStack {
          dialogContent
            .background(
              RoundedRectangle(cornerRadius: 20)
                .foregroundColor(.white)
                .shadow(radius: 10)
            )
        }.padding(40)
      }
    }
  }
}

