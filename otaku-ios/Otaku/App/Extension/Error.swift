//
//  Error.swift
//  iosApp
//
//    on 1/1/22.
//  Copyright © 2022 . All rights reserved.
//

import Foundation
import Shared

extension Error {
  var apiError: ApiError? {
    (self as NSError).userInfo["KotlinException"] as? ApiError
  }
}

